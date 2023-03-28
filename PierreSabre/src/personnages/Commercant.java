package personnages;

public class Commercant extends Humaine {
	
	private int argent;
	Commercant(String nom){
		super(nom, "thé", 0);
	}
	
	public String recevoir(int income){
		argent = argent + income;
		return Integer.toString(income) + " sous ! Je te remercie généreux donateur!";
	}

}
