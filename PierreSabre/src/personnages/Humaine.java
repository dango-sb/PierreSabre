package personnages;

public class Humaine {
	private String nom;
	private String boisson;
	private int argent;
	Humaine(String nom, String boisson, int argentPossede){
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argentPossede;
	}
	public String getNom() {
		return nom;
	}
	public String getBoisson() {
		return boisson;
	}
	public int getArgent() {
		return argent;
	}
	public String direBounjour(){
		return "Bonjour ! Je m’appelle " +  getNom() + " et j’aime boire du " + getBoisson();
	} 
	public String boire(){ 
		return "Mmmm, un bon verre de " + getBoisson() + "! GLOUPS !";
	}
	public String acheter(String bien, int prix) {
		if (argent>prix){
			perdreArgent(prix);
			return "J'ai " + Integer.toString(getArgent()) + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + Integer.toString(prix) + " sous";
		}
		else {
			return "Je n'ai plus que " + Integer.toString(getArgent()) + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + Integer.toString(prix) + " sous";
		}
	}
	public void gagnerArgent(int gain){
		argent = argent + gain;
	}
	public void perdreArgent(int pert) {
		argent = argent - pert;
	}
	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}
	}