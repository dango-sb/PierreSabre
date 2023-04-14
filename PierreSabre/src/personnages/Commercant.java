package personnages;

public class Commercant extends Humain {
	
	Commercant(String nom, int argent){
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentPosede = getArgent();
		this.perdreArgent(argentPosede);
		System.out.println("(" + getNom() + ") - " + "J’ai tout perdu! Le monde est trop injuste...");
		return argentPosede;
	}
	
	public void recevoir(int income){
		this.gagnerArgent(income);
		System.out.println("(" + getNom() + ") - " + income + " sous ! Je te remercie généreux donateur!");
	}

}
