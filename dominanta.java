package Kolos1;

public class dominanta {
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
	
	private static int binSearch1(int[] a, int x, int left, int right) {
		if (left > right) 
			throw new IllegalArgumentException("The data is not found!");
		else {
			int mid = (left+right)/2;
			if (a[mid] == x)
				return mid;
			else if (x < a[mid]) 
				return binSearch1(a,x,left,mid-1);
			else 
				return binSearch1(a,x,mid+1,right);
			}
	}
	
	private static int ileWystapien(int[] a) {
		int licznik = 0;
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if (a[i] < 0.5) {
				licznik = licznik + 1;
			}
		}
		return licznik;
	}
	
	private static int binSearch(int[] a, int x) {
		return binSearch1(a,x,0,a.length-1);
	}
	
}
