package personnages;

public class HistoireTP4_1 {
	public static void main(String[] args){
		Humain prof = new Humain("Prof", "kombucha", 54); 
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
	}
}
