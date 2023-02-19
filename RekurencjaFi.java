package Kolos1;

import java.util.Arrays;

public class RekururuFi {

	public static double rekururu(int n) {
		if (n == 1) return 1;
		return Math.sqrt(1+ rekururu(n-1));
	}

	private static double[] Table(double[] a) {
		double fi = (1+Math.sqrt(5))/2;
		int licznik = 0;
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if (Math.abs(a[i]-fi) < 0.00001) {
				licznik = licznik + 1;
			}
		}
		double[] b = new double[licznik];
		for (int j = 0; j < licznik; j++) {
			b[j] = a[N-licznik+j];
		}
		return b;
	}
	private static double suma(double[] a ) {
		double suma = 0;
		int N = a.length;
		for (int i = 0; i < N; i++) {
			suma = suma + a[i];
		}
		return suma;
				
	}
	public static void main(String[] args) {
	System.out.println(rekururu(20));
	int N = 30;
	double[] c = new double[30];
	for (int i=1; i<N+1; i++) {
		c[i-1] = rekururu(i);		
	}
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(Table(c)));
	System.out.println(suma(Table(c)));
	}

}
