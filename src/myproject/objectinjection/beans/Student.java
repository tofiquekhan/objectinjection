package myproject.objectinjection.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String sid;
	private String sname;
	private Address saddr;
	private List<String> squal;
	private Set<String> scourses;
	private Map<String, String> scoursesAndFaculty;
	
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
	
	public List<String> getSqual() {
		return squal;
	}
	public void setSqual(List<String> squal) {
		this.squal = squal;
	}

	public Set<String> getScourses() {
		return scourses;
	}
	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}
	
	
	
	public Map<String, String> getScoursesAndFaculty() {
		return scoursesAndFaculty;
	}
	public void setScoursesAndFaculty(Map<String, String> scoursesAndFaculty) {
		this.scoursesAndFaculty = scoursesAndFaculty;
	}
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("----------------------------------");
		System.out.println("Student Id 			: "+sid);
		System.out.println("Student Name 		: "+sname);
		System.out.print("Student Qualifications  : ");
		
		for(String qual:squal) {
			System.out.print(qual+" ");
		}
		System.out.println();
		System.out.print("Student Courses 		: ");
		for(String courses : scourses)
			System.out.print(courses+" ");
		System.out.println();
		System.out.println("Student Courses and Faculty : "+scoursesAndFaculty);
		
		System.out.println();
		System.out.println("Student Address");
		System.out.println("----------------------------------");
		System.out.println("Flate Number		: "+saddr.getPno());
		System.out.println("Street 				: "+saddr.getStreet());
		System.out.println("City 				: "+saddr.getCity());
		System.out.println("State 				: "+saddr.getState());
		System.out.println("Country 			: "+saddr.getCountry());
		
	}
}
