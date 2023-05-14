package semi.proj.PfF.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semi.proj.PfF.member.model.dao.MemberDAO;
import semi.proj.PfF.member.model.vo.Member;

@Service
public class MemberService {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private MemberDAO mDAO;

	public Member login(Member login) {
		return mDAO.login(sqlSession, login);
	}

	public int enroll(Member enrollUser) {
		return mDAO.enroll(sqlSession, enrollUser);
	}
}
