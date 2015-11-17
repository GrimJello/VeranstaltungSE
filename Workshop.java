public class Workshop extends Event {
	private Referent referent;

	public Workshop(int eventNr, String bezeichnung, String zeit, String ort, Referent referent, Teilnehmer teilnehmer1, Teilnehmer teilnehmer2, Teilnehmer teilnehmer3){
		super(eventNr, bezeichnung, zeit, ort, teilnehmer1, teilnehmer2, teilnehmer3);
		this.referent = referent;
	}

	public String toString() {
		return "Typ: Workshop" + "\nEventnummer: " + eventNr + "\nName: " + bezeichnung + "\nReferent: " + referent.getName() + "\nZeit: " + zeit + "\nOrt: " + ort + "\nTeilnehmer: " + teilnehmer1.getName() + ", " + teilnehmer2.getName() + ", " + teilnehmer3.getName();
	}
}