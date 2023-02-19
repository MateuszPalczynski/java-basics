package Kolos1;

import java.util.Arrays;
import java.util.Random;

public class tablice {
	

	private static double max(double[] a) {
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) 
				max = a[i];
		}
		return max;
	}
	
	private static double min(double[] a) {
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= min) 
				min = a[i];
		}
		return min;
	}
	
	private static int ileWystapien(double[] a) {
		int licznik = 0;
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if (a[i] < 0.5) {
				licznik = licznik + 1;
			}
		}
		return licznik;
	}
	
	private static double srednia(double[] a ) {
		double suma = 0;
		int N = a.length;
		for (int i = 0; i < N; i++) {
			suma = suma + a[i];
		}
		return suma/N;
				
	}
	
	private static int ilezer(int[] a) {
		int licznik = 0;
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if (a[i] == 0) {
				licznik = licznik + 1;
			}
		}
		return licznik;
	}
	
	private static int ilejeden(int[] a) {
		int licznik = 0;
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if (a[i] == 1) {
				licznik = licznik + 1;
			}
		}
		return licznik;
	}
	
	public static void main(String[] args) {
		Random los = new Random();
		int n=100;
		double[] dane = new double[n];
		for(int i=0; i<n; i++) {
			dane[i] = los.nextDouble();
		}
		//Wypisanie liczb (bez ich numerów, z zaokr¹gleniem do 4 cyfr po rzecinku) ale – w jednym wierszu obs³u¿y 
		//np. nastêpny  algorytm iteracyjny
		for(int i=0; i<n; i++) {
			System.out.printf("%6.4f ",dane[i]);
		System.out.println();
		
		double[] g = new double[10];
		 
 		for (int j = 0; j < 10; j++)
 			g[j] = -1;
		double[] f = new double[5]; //definiujemy tablice o n elementów
		f[0] = 2;
		f[1] = -1;
		f[2] = 0;
		f[3] = -5;
		f[4] = 5;
		System.out.println(Arrays.toString(g));
		System.out.println("W tablicy f jest "+ileWystapien(f)+" liczb mniejszych ni¿ 1/2");
		System.out.println("srednia f o: "+srednia(f));
		System.out.println("srednia g o: "+srednia(g));
		
		//zadanie 6 wyniki:
		System.out.println("Max dane to: "+max(dane));
		System.out.println("Min dane to: "+min(dane));
		System.out.println("Œrednia dane to: "+srednia(dane));
		System.out.println("W tablicy f jest "+ileWystapien(dane)+" liczb mniejszych ni¿ 1/2");
		}
		//zadanie 7
		
		int x = los.nextInt(2);
		int[] rzuty = new int[100];
		for(int i = 0; i < 100; i++) 
			rzuty[i] = los.nextInt(2);
		System.out.println(x);
		System.out.println(Arrays.toString(rzuty));
		System.out.println("Jest " +ilezer(rzuty)+" zer");
		System.out.println("Jest " +ilejeden(rzuty)+" jedynek");
		if (ilezer(rzuty) == ilejeden(rzuty)) {
			System.out.println("Jest tyle samo zer co jedynek");
		} else if (ilezer(rzuty) < ilejeden(rzuty)) {
			System.out.println("Jest wiecej jedynek");
		} else {
			System.out.println("Jest wiêcej zer");
		}
		
		int m=6;
		int[] dane1 = new int[m];
		for(int i = 0; i < 6; i++) 
			dane1[i] = (1 + los.nextInt(6));
		System.out.println(Arrays.toString(dane1));		

		for(int j=1; j<=6; j++) {
			System.out.printf("%d: %2d\n",j,dane1[j-1]);
		}


	}
}