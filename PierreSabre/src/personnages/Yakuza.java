package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;
	
	Yakuza(String nom, String boison, int argent, String clan){
		super(nom, boison, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime){
		reputation++;
		System.out.println("(" + getNom() + ") - " + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println("(" + getNom() + ") - " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = victime.seFaireExtorquer();
		this.gagnerArgent(argentExtorque);
		System.out.println("(" + getNom() + ") - " + "J’ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
	}	
}
