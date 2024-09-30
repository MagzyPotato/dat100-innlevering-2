package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] e : matrise) {
			for (int f : e) {
				System.out.print(f);
			}
			System.out.println();
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = "";
		
		for (int[] e : matrise) {
			for (int f : e) {
				streng += f + " ";
			}
		streng += "\n";
		}
		
		return streng;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skal = new int[matrise.length][];
		
		for (int i = 0; i < skal.length; i++) {
			skal[i] = new int[matrise[i].length];
			for (int j = 0; j < skal[i].length; j++) {
				skal[i][j] = matrise[i][j] * tall;
			}
		}
		
		return skal;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i].length != b[i].length) {
				return false;
				
			}
			
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

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
