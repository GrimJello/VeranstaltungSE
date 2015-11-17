public class Rahmenprogramm extends Event {

	public Rahmenprogramm(int eventNr, String bezeichnung, String zeit, String ort, Teilnehmer teilnehmer1, Teilnehmer teilnehmer2, Teilnehmer teilnehmer3) {
		super(eventNr, bezeichnung, zeit, ort, teilnehmer1, teilnehmer2, teilnehmer3);
	}


	public String toString() {
		return "Typ: Rahmenprogramm" + "\nEventnummer: " + eventNr + "\nName: " + bezeichnung + "\nZeit: " + zeit + "\nOrt: " + ort + "\nTeilnehmer: " + teilnehmer1.getName() + ", " + teilnehmer2.getName() + ", " + teilnehmer3.getName();
	}
}