package myproject.objectinjection.beans;

public class Student {

	private String sid;
	private String sname;
	private Address saddr;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getSaddr() {
		return saddr;
	}
	public void setSaddr(Address saddr) {
		this.saddr = saddr;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("----------------------------------");
		System.out.println("Student Id 			: "+sid);
		System.out.println("Student Name 		: "+sname);
		System.out.println("Student Address");
		System.out.println("----------------------------------");
		System.out.println("Flate Number		: "+saddr.getPno());
		System.out.println("Street 				: "+saddr.getStreet());
		System.out.println("City 				: "+saddr.getCity());
		System.out.println("State 				: "+saddr.getState());
		System.out.println("Country 			: "+saddr.getCountry());
		
	}
}
