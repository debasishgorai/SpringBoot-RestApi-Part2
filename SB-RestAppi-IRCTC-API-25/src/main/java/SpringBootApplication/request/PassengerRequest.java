package SpringBootApplication.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PassengerRequest {

	
	private String name;
	private String dob;
	private String doj;
	private String from;
	private String to;
	private String gender;
	public PassengerRequest() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PassengerRequest [name=" + name + ", dob=" + dob + ", doj=" + doj + ", from=" + from + ", to=" + to
				+ ", gender=" + gender + ", trail=" + trail + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTrail() {
		return trail;
	}
	public void setTrail(String trail) {
		this.trail = trail;
	}
	private String trail;
}
