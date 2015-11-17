public class Teilnehmer {
	private String name;
	private String email;
	private String status;
	
	public Teilnehmer(String name, String email, String status) {
		this.name = name;
		this.email = email;
		this.status = status;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStatus() {
		return status;
	}
}