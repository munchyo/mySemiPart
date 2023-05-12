package semi.proj.PfF.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private Date memberAge;
	private char memberGender;
	private String memberEmail;
	private String memberHomePhone;
	private String memberPhone;
	private String memberAddress;
	private Date enrollDate;
	private int point;
	private int payAmount;
	private String eventCheck;
	private String grade;
	private char admin;
	
	public Member() {}

	public Member(String memberId, String memberPwd, String memberName, Date memberAge, char memberGender,
			String memberEmail, String memberHomePhone, String memberPhone, String memberAddress, Date enrollDate,
			int point, int payAmount, String eventCheck, String grade, char admin) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberHomePhone = memberHomePhone;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.enrollDate = enrollDate;
		this.point = point;
		this.payAmount = payAmount;
		this.eventCheck = eventCheck;
		this.grade = grade;
		this.admin = admin;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(Date memberAge) {
		this.memberAge = memberAge;
	}

	public char getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(char memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberHomePhone() {
		return memberHomePhone;
	}

	public void setMemberHomePhone(String memberHomePhone) {
		this.memberHomePhone = memberHomePhone;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public String getEventCheck() {
		return eventCheck;
	}

	public void setEventCheck(String eventCheck) {
		this.eventCheck = eventCheck;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public char getAdmin() {
		return admin;
	}

	public void setAdmin(char admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberAge=" + memberAge + ", memberGender=" + memberGender + ", memberEmail=" + memberEmail
				+ ", memberHomePhone=" + memberHomePhone + ", memberPhone=" + memberPhone + ", memberAddress="
				+ memberAddress + ", enrollDate=" + enrollDate + ", point=" + point + ", payAmount=" + payAmount
				+ ", eventCheck=" + eventCheck + ", grade=" + grade + ", admin=" + admin + "]";
	}
	
}
