package Kolos1;

import java.util.Scanner;
public class dominanta1 {
	
	 
	 
	private static int[] tab;
	private static int[] liczby;
	private static int[] ilosc;
	 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Podaj rozmiar tablicy: ");
	int n = sc.nextInt();
	tab = new int[n];
	 
	for (int i = 0; i < n; i++) {
	System.out.print("Podaj liczbe " + (i+1) + ": ");
	tab[i] = sc.nextInt();
	}
	 
	liczby = new int[n];
	ilosc = new int[n];
	int indeks = 0;
	int ileLiczb = 0;
	 
	for (int i = 0; i < n; i++) {
	int temp = tab[i];
	 
	for (int j = 0; j < n; j++) {
	if (liczby[j] == temp) {
	++ilosc[j];
	break;
	}
	else if (j == n-1) {
	liczby[indeks] = temp;
	ilosc[indeks] = 1;
	++indeks;
	++ileLiczb;
	}
	}
	}
	 
	int dominanta = 0;
	int licznik = 1;
	for (int i = 1; i < ileLiczb; i++) {
	if (ilosc[i] > ilosc[dominanta]) {
	dominanta = i;
	licznik = 1;
	}
	else if(ilosc[i] == ilosc[dominanta]) {
	++licznik;
	}
	}
	 
	if (licznik == 1) {
	System.out.println("Dominanta jest liczba " + liczby[dominanta] + ". Wystapila " + ilosc[dominanta] + " razy");
	}
	else {
	System.out.println("Nie ma dominanty");
	}
	}
	}

