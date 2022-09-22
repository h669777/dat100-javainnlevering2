package no.hvl.dat100.lab6.matriser;

import java.util.Iterator;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] j : matrise) {
			for (int i : j) {
				System.out.print(i + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String string = "";
		for (int j = 0; j < matrise.length; j++) {
			for (int i = 0; i < matrise.length; i++) {
				string += matrise[j][i] + " ";
			}
			string += "\n";
		}

		return string;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] multiplisert = new int[matrise.length][matrise.length];

		for (int j = 0; j < matrise.length; j++) {
			for (int i = 0; i < matrise.length; i++) {
				multiplisert[j][i] = matrise[j][i] * tall;

			}
		}

		return multiplisert;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}

		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		// Kopierer matrisen sin lengde
		int[][] kopi = new int[matrise.length][matrise.length];

		int z = 0;
		for (int i = 0; i < kopi.length; i++) {

			for (int j = 0; j < kopi[i].length; j++) {
				kopi[i][j] = matrise[j][z];
			}

			z++;
		}
		return kopi;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		// Å multiplisere to matriser vil gi en ny matrise med antallet kolonner til a
		// og
		// antallet rader til b

		int[][] svar = new int[a[0].length][b.length];

		// Den innerste løkken ganger de to matrisene ved å gange radene i a med
		// kolonnene i b og legger svarene i svar matrisen
		

		for (int z = 0; z < svar.length; z++) {

			for (int i = 0; i < svar.length; i++) {

				for (int j = 0; j < svar[0].length; j++) {

					svar[z][i] += a[z][j] * b[j][i];

				}

			}
		}
		return svar;
	}
}
