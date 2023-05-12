package semi.proj.PfF.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import semi.proj.PfF.member.model.vo.Member;

@Controller
public class MemberController {

	// 로그인 화면 이동
	@GetMapping("loginView.me")
	public String loginView() {
		return "login";
	}

	// 회원로그인
	@PostMapping("login.me")
	public String login(@ModelAttribute Member login) {
		// 서비스에 보내서 Member 채워옴
		System.out.println("아이디 : " + login.getMemberId());
		System.out.println("비번 : " + login.getMemberPwd());

		return null;
	}

	// 회원가입 약관동의로 이동
	@GetMapping("enrollViewAgree.me")
	public String enrollViewAgree() {
		return "enrollViewAgree";
	}

	// 약관동의에서 회원가입으로 이동
	@RequestMapping("enrollView.me")
	public String enrollView(
			@RequestParam(name = "eventAgree", required = false, defaultValue = "uncheck") String eventAgree,
			Model model) {
		System.out.println(eventAgree);
		model.addAttribute(eventAgree);
		return "enrollView";
	}

	// 회원가입
	// 주소, 전화번호 여기서 가공해서 다시 넣어주기, 이벤트체크안갖고옴
	@PostMapping("enroll.me")
	public String enroll(@ModelAttribute Member enrollMember) {
		System.out.println(enrollMember); // Member(memberId=id입니당, memberPwd=qlalfqjsgh, memberName=이름임,
											// memberAge=2023-06-02, memberGender=M, memberEmail=m_chyo_@naver.com,
											// memberHomePhone=null, memberPhone=null, memberAddress=null,
											// enrollDate=null, point=0, payAmount=0, eventCheck=null, grade=null,
											// admin=
		return "redirect:/";
	}

}
