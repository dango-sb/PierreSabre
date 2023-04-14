package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	Ronin(String nom, String boison, int argent){
		super(nom,boison,argent);
	}
	
	public void donner(Commercant beneficiaire){
		int argentDonner = this.getArgent() / 10;
		System.out.println("(" + getNom() + ") - " + beneficiaire.getNom() + " prend ces 6 sous.");
		this.perdreArgent(argentDonner);
		beneficiaire.recevoir(argentDonner);
	}
}
