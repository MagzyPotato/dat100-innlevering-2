package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int e : tabell) {
			System.out.println(e);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String streng = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			
			if (tabell.length - 1 > i) {
				streng += tabell[i] + ",";
			} else {
				streng += tabell[i];
			}
				
		}
		
		streng += "]";
		
		return streng;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean innhold = false;
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				innhold = true;
			}
		}

		return innhold;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;
		int index = -1;
		
		while (i < tabell.length && index == -1) {
			
			if (tabell[i] == tall) {
				index = i;
			}
			
		i++;
		}
		
		return index;
		
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revers;
		revers = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			revers[i] = tabell[tabell.length - 1 - i];
		}
		
		return revers;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i-1] > tabell[i]) {
				sortert = false;
			}
		}
		
		return sortert;
		
		}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int j = 0;
		int[] sammen;
		sammen = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			sammen[i] = tabell1[i];
			
		}
		
		for (int i = tabell1.length; i < tabell1.length + tabell2.length; i++) {
			
			sammen[i] = tabell2[j];
			j++;
		}
		
		return sammen;
		
	}
}
