public class MobileGamesHacker2014Main {
	public static void main (String[] args) {
		
		Teilnehmer paul = new Teilnehmer("Paul", "paul@paulsen.de", "Mitglied");
		Teilnehmer svenja = new Teilnehmer("Svenja", "Svenja@svenjasen.de", "Student");
		Teilnehmer udo = new Teilnehmer("Udo", "udo@udosen.de", "Nichtmitglied");
		Teilnehmer katinka = new Teilnehmer("Katinka", "katinka@katinkasen.de", "Mitglied");
		
		Referent referenda = new Referent("Referenda", "referenda@referendasen.de", "Student", "Meierei Meier");
		Referent referendo = new Referent("Referendo", "referendo@referendosen.de", "Mitglied", "SuperCompany");

		Event vortragUeberNasenbaerprogrammierung = new Workshop(1, "Nasenbaeren-Programmierung", "10 Uhr", "Raum 1", referendo, paul, svenja, udo);
		Event datenbanken = new Workshop(2, "Datenbanken", "11 Uhr", "Raum 1", referenda, referendo, svenja, paul);
		Event freizeit = new Rahmenprogramm(3, "Museum", "15 Uhr", "Kulturmuseum", referenda, referendo, svenja);
		
		System.out.println();
		System.out.println(vortragUeberNasenbaerprogrammierung);
		System.out.println();
		System.out.println(datenbanken);
		System.out.println();
		System.out.println(freizeit);
		System.out.println();


	
	}

}