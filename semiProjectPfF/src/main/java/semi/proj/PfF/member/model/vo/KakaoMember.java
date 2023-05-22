package semi.proj.PfF.member.model.vo;

import java.sql.Date;

public class KakaoMember {
	private long memberId;
	private String memberName;
	private String memberNickName;
	private String memberHomePhone;
	private String memberPhone;
	private String memberAddress;
	private Date enrollDate;
	private int point;
	private int payAmount;
	private String grade;
	private char admin;
	private char memberStatus;
	
	public KakaoMember() {}

	public KakaoMember(long memberId, String memberName, String memberNickName, String memberHomePhone,
			String memberPhone, String memberAddress, Date enrollDate, int point, int payAmount, String grade,
			char admin, char memberStatus) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberNickName = memberNickName;
		this.memberHomePhone = memberHomePhone;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.enrollDate = enrollDate;
		this.point = point;
		this.payAmount = payAmount;
		this.grade = grade;
		this.admin = admin;
		this.memberStatus = memberStatus;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNickName() {
		return memberNickName;
	}

	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
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

	public char getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(char memberStatus) {
		this.memberStatus = memberStatus;
	}

	@Override
	public String toString() {
		return "KakaoMember [memberId=" + memberId + ", memberName=" + memberName + ", memberNickName=" + memberNickName
				+ ", memberHomePhone=" + memberHomePhone + ", memberPhone=" + memberPhone + ", memberAddress="
				+ memberAddress + ", enrollDate=" + enrollDate + ", point=" + point + ", payAmount=" + payAmount
				+ ", grade=" + grade + ", admin=" + admin + ", memberStatus=" + memberStatus + "]";
	}

}
