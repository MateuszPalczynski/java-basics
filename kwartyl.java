package Kolos1;

import java.util.Arrays;
import java.util.Random;


public class kwartyl {
	
	private static double[] maxWhere(double[] a) {
		double max = a[0];
		double k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
				k = i;
			}
		}
		double[] t = {max,k};
		return t;
	}
	
	private static void sortMax(double[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			double[] b = new double[n-i]; // tablica pomocnicza z której bêdziemy wyznaczaæ maksimum
			for (int j = 0; j < n-i; j++) //wype³nienie pomocniczej tablicy b elementami tablicy a
				b[j] = a[j];
			double max = maxWhere(b)[0]; //maksimum tablicy b
			int ind = (int)maxWhere(b)[1]; //indeks w którym znajduje siê maksimum tablicy b
			a[ind] = a[n-1-i];
			a[n-1-i]= max;
		}
	}
	
	public static double mediana(double[] a) {
		sortMax(a);		
		if (a.length % 2 == 1)
			return a[a.length/2+1/2];
		else 
			return (a[a.length/2-1] + a[a.length/2])/2;
	}
	public static double thirdQuartile(double[] a) { 
		int n = a.length;
		if (n % 2 == 1) {
			double[] b = new double[(n-1)/2];
			for (int i = 0; i < (n-1)/2; i++) {
				b[i] = a[(n-1)/2+i+1];
				}
			return mediana(b);
			}
		else {
			double[] b = new double[n/2];
			for (int i = 0; i < n/2; i++) {
				b[i] = a[n/2+i];
				}
			return mediana(b);
		}						
	}
	
	public static double firstQuartile(double[] a) { 
		int n = a.length;
		if (n % 2 == 1) {
			double[] b = new double[(n-1)/2];
			for (int i = 0; i < (n-1)/2; i++) {
				b[i] = a[i];
				}
			return mediana(b);
			}
		else {
			double[] b = new double[n/2];
			for (int i = 0; i < n/2; i++) {
				b[i] = a[i];
				}
			return mediana(b);
		}						
	}
	
	public static void main(String[] args) {
		Random los = new Random();
		double[] x = {4, 7, 5, 8, 7.5, 8.5, 3, 5, 9, 2};
		System.out.println(mediana(x));
		System.out.println(thirdQuartile(x));
		double[] L = new double[100];
		for(int i = 0; i < 100; i++)
			L[i] = los.nextDouble(100);		
		System.out.println(thirdQuartile(L));
		System.out.println(firstQuartile(x));
		}
	}


