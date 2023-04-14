package personnages;

public class Humain {
	
	private String nom;
	private String boisson;
	private int argent;
	
	Humain(String nom, String boisson, int argentPossede){
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
	
	public void direBonjour(){
		System.out.println("(" + getNom() + ") - " + "Bonjour ! Je m’appelle " +  getNom() + " et j’aime boire du " + getBoisson() + ".");
		}
	
	public void boire(){ 
		System.out.println("(" + getNom() + ") - " + "Mmmm, un bon verre de " + getBoisson() + "! GLOUPS !" + ".");
		}
	
	public void acheter(String bien, int prix) {
		if (argent>prix){
			perdreArgent(prix);
			System.out.println("(" + getNom() + ") - " +  "J'ai " + Integer.toString(getArgent() + prix) + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + Integer.toString(prix) + " sous" + ".");
			}
		else {
			System.out.println("(" + getNom() + ") - " +  "Je n'ai plus que " + Integer.toString(getArgent()) + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + Integer.toString(prix) + " sous" + ".");
			}
		}
	
	public void gagnerArgent(int gain){
		argent = argent + gain;
		}
	
	public void perdreArgent(int pert) {
		argent = argent - pert;
		}
	}