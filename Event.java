import java.util.Arrays;

public abstract class Event {
	protected int eventNr;
	protected String bezeichnung;
	protected String zeit;
	protected String ort;
	protected Teilnehmer teilnehmer1;
	protected Teilnehmer teilnehmer2;
	protected Teilnehmer teilnehmer3;
	protected Teilnehmer[] teilnehmerListe;

	
	public Event(int eventNr, String bezeichnung, String zeit, String ort, Teilnehmer teilnehmer1, Teilnehmer teilnehmer2, Teilnehmer teilnehmer3) {
		//man hätte natürlich eine beliebige Zahl an Teilnehmer implementieren können, hier aber exemplarisch mal fuer 3 Teilnehmer
		//wahrscheinlich mit einer "richtigen" Liste und addTeilnehmer() in diesem Fall
		
		this.eventNr = eventNr;
		this.bezeichnung = bezeichnung;
		this.zeit = zeit;
		this.ort = ort;
		this.teilnehmer1 = teilnehmer1;
		this.teilnehmer2 = teilnehmer2;
		this.teilnehmer3 = teilnehmer3;
				
		teilnehmerListe = new Teilnehmer[] {teilnehmer1, teilnehmer2, teilnehmer3};
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}	
	
	public void setDate(String zeit){
		this.zeit = zeit;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public abstract String toString();
	
}