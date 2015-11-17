public class Referent extends Teilnehmer {
	private String firma;
	
	public Referent(String name, String email, String status, String firma) {
		super(name, email, status);
		this.firma = firma;
	}
	
	public String getFirma() {
		return firma;
	}


	
}
