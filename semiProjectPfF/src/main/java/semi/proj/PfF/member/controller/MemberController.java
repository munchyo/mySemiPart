package semi.proj.PfF.member.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import semi.proj.PfF.common.model.service.MailSendService;
import semi.proj.PfF.member.model.exception.MemberException;
import semi.proj.PfF.member.model.service.MemberService;
import semi.proj.PfF.member.model.vo.KakaoMember;
import semi.proj.PfF.member.model.vo.Member;

@SessionAttributes("loginUser")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService mService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private MailSendService mailService;
	
	// 로그인 화면 이동
	@GetMapping("loginView.me")
	public String loginView() {
		return "login";
	}

	// 회원로그인
	@PostMapping("login.me")
	public String login(@ModelAttribute Member login, Model model) {
		Member m = mService.login(login);
		
		if(m != null && bcrypt.matches(login.getMemberPwd(), m.getMemberPwd())) {
			model.addAttribute("loginUser", m);
			return "redirect:/";
		} else throw new MemberException("���̵� �Ǵ� �н����带 Ȯ���ϼ���.");
	}
	
	// 로그아웃
	@GetMapping("logout.me")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:/";
	}

	// 회원가입 약관동의로 이동
	@GetMapping("enrollViewAgree.me")
	public String enrollViewAgree() {
		return "enrollViewAgree";
	}

	// 약관동의에서 회원가입으로 이동
	@RequestMapping("enrollView.me")
	public String enrollView(@RequestParam(name = "eventAgree", required = false, defaultValue = "N") String eventAgree, HttpServletRequest request) {
		request.setAttribute("eventAgree", eventAgree);
		return "enrollView";
	}

	// 회원가입 집전화가 둘중에 하나라도 널이면 오류발생
	@PostMapping("enroll.me")
	public String enroll(@ModelAttribute Member enrollUser, @RequestParam("homePhone1") String home1, @RequestParam("homePhone2") String home2, @RequestParam("homePhone3") String home3,
			 			@RequestParam("phone1") String phone1, @RequestParam("phone2") String phone2, @RequestParam("phone3") String phone3,
			 			@RequestParam("postCode") String addr1, @RequestParam("address") String addr2, @RequestParam("detailAddress") String addr3, @RequestParam("refAddress") String addr4,
			 			Model model) {
		
		if(home2 != null && home3 != null) {
			enrollUser.setMemberHomePhone(home1 + "-" + home2.trim() + "-" + home3.trim());
		} else if((home2 == null && home3 != null) || (home2 != null && home3 == null)) {
			throw new MemberException("회원가입에 실패하였습니다.");
		} else {
			enrollUser.setMemberHomePhone(null);
		}
		
		enrollUser.setMemberPhone(phone1 + "-" + phone2.trim() + "-" + phone3.trim());
		enrollUser.setMemberAddress(addr1 + "/" + addr2 + "/" + addr3 + "/" + addr4);
		
		enrollUser.setMemberPwd(bcrypt.encode(enrollUser.getMemberPwd()));
		
		int result = mService.enroll(enrollUser);
		
		if(result > 0) {
			model.addAttribute("loginUser", enrollUser);
			return "redirect:/";
		} else throw new MemberException("회원가입에 실패하였습니다.");
		
	}
	
	// 아이디 중복 체크
	@RequestMapping("checkId.me")
	public void checkId(@RequestParam("id") String id, PrintWriter out) {
		int count = mService.checkId(id);
		out.print(count == 0 ? "yes" : "no");
	}
	
	// 닉네임 중복 체크
	@RequestMapping("checkNickName.me")
	public void checkNickName(@RequestParam("nickname") String nickname, PrintWriter out) {
		out.print(mService.checkNickName(nickname) == 0 ? "yes" : "no");
	}
	
	// 이메일 중복 체크
	@RequestMapping("checkEmail.me")
	public void checkEmail(@RequestParam("email") String email, PrintWriter out) {
		int count = mService.checkEmail(email);
		out.print(count == 0 ? "yes" : "no");
	}
	
	// 카카오로그인
	@PostMapping("kakaoLogin.me")
	public String kakaoLogin(@ModelAttribute KakaoMember loginUser, Model model) {
		// DB에 정보가 있다면 로그인, 없다면 회원가입 후 로그인
		KakaoMember kakao = mService.selectKakaoMember(loginUser);
		
		if(kakao != null) {
			model.addAttribute("loginUser", kakao);
			return "redirect:/";
		} else {
			int result = mService.enrollKakao(loginUser);
			
			KakaoMember enrollKakao = mService.selectKakaoMember(loginUser);
			
			model.addAttribute("loginUser", enrollKakao);
			return "redirect:/";
		}
		
	}
	
	// 인증 메일 확인
	@RequestMapping("mailCheck.me")
	@ResponseBody
	public String mailCheck(String email) {
		return mailService.joinEmail(email);
	}
	
}
