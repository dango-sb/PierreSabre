package personnages;

public class HistoireTP4_3 {
	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco", 40);
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
