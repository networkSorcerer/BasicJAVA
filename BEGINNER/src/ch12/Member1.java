package ch12;

public class Member1 implements Comparable<Member1>{
	private int memberId;
	private String memberName;
	
	public Member1(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public int compareTo(Member1 member) {
		return (this.memberId - member.memberId);
	}
}
