package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);

		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String string = "[";
		// For løkken legger til hvert element med komma bak med unntak av siste
		// elementet som ikke har komma bak
		for (int i = 0; i < tabell.length; i++) {
			if (i < (tabell.length - 1)) {
				string += tabell[i] + ",";
			} else {
				string += tabell[i];
			}

		}

		string += "]";

		return string;

	}

	// c)
	public static int summer(int[] tabell) {

//		// Variant for-løkke
//		int sum = 0;
//		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
//		return sum;

//		// Variant while-løkke
//		int sum = 0;
//		int i = 0;
//		while (i < tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
//		return sum;

		// Variant utvidet for-løkke
		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i : tabell) {
			if (i == tall) {
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}

		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		// Lager en ny tabell med samme lengde som tabellen som skal reverseres
		int[] revers = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			revers[i] = tabell[tabell.length - 1 - i];
		}
		return revers;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int i = 1;
		while (i < tabell.length) {
			if (tabell[i] < tabell[i - 1]) {
				return false;
			}
			i++;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] begge = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < begge.length; i++) {
			if (i < tabell1.length) {
				begge[i] = tabell1[i];
			} else {
				begge[i] = tabell2[i - tabell1.length];
			}
		}
		return begge;
	}
}
