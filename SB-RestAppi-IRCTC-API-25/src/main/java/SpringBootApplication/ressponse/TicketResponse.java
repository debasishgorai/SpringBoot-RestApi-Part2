package SpringBootApplication.ressponse;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketResponse {

	private String name;
	private String dob;
	private String doj;
	private String from;
	private String to;
	private String gender;
	private String status;
	private Double price;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TicketResponse [name=" + name + ", dob=" + dob + ", doj=" + doj + ", from=" + from + ", to=" + to
				+ ", gender=" + gender + ", status=" + status + ", price=" + price + "]";
	}
	public TicketResponse() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
}
