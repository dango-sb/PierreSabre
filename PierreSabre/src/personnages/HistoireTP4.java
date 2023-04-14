package personnages;

public class HistoireTP4 {
	public static void main(String[] args){
		Humaine prof = new Humaine("Prof", "kombucha", 54); 
		prof.parler(prof.direBounjour());
		prof.parler(prof.acheter("boisson", 12));
		prof.parler(prof.boire());
		prof.parler(prof.acheter("jeu", 2));
		prof.parler(prof.acheter("kimono", 50));

	}
}
