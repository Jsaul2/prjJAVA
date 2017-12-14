import java.util.Scanner;

public class ConvertisseurCR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		String reset = "O";

		while (reset == "O" || reset == "o") {
			System.out.print("Entrez un nombre compris entre 1 et 3999 : ");
			int n = sc.nextInt();
			
			System.out.print("\nNotation romaine simplifiee : " + convertirEnRomains(n, true));
			System.out.print("\nNotation romaine vraie : " + convertirEnRomains(n, false));
			
			System.out.print("\nVoulez-vous recommencer [O(o) / N(n)] :  ");
			reset = sc1.nextLine();
		}
		sc.close();
		sc1.close();
	}
	
	static String convertirEnRomains(int n, boolean simplifie) {
		if (n >= 1 && n <= 4999) {
			int unites = n % 10;
			int dizaines = (n / 10) % 10;
			int centaines = (n / 100) % 10;
			int milliers = (n / 1000) % 1000;
			
			if (simplifie) {
				return (additif(milliers, 'M', '?') + additif(centaines, 'C', 'D') + additif(dizaines, 'X', 'L') + additif(unites, 'I', 'V'));
			} else {
				return (soustractif(milliers, 'M', '?', '?') + soustractif(centaines, 'C', 'D', 'M') + soustractif(dizaines, 'X', 'L', 'C') + soustractif(unites, 'I', 'V', 'X'));
			}
		} else return "Nombre impossible a ecrire en chiffres romains.";
	}
	
	static String additif (int x, char un, char cinq) {
		String s = "";
		if (x >= 5) {
			s = s + cinq;
		}
		switch (x % 5) {
			case 1: s = s + un; break;
			case 2: s = s + un + un; break;
			case 3: s = s + un + un + un; break;
			case 4: s = s + un + un + un + un; break;
		}
		return s;
	}
	
	static String soustractif(int x, char un, char cinq, char dix) {
		String s;
		switch (x) {
			case 0: s = ""; break;
			case 1: s = "" + un; break;
			case 2: s = "" + un + un; break;
			case 3: s = "" + un + un + un; break;
			case 4: s = "" + un + cinq; break;
			case 5: s = "" + cinq; break;
			case 6: s = "" + cinq + un; break;
			case 7: s = "" + cinq + un + un; break;
			case 8: s = "" + cinq + un + un + un; break;
			case 9: s = "" + un + dix; break;
			default: s = "???";
		}
		return s;
	}

}
