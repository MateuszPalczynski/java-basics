package Kolos1;

public class ulamek {
	
	long l,m; //pola: licznik i mianownik
	
	public ulamek(long licznik, long mianownik) { //konstruktor
		l = licznik; m = mianownik;
	}
	
	@Override 	//tego nie musimy pisaæ
	public String toString() {
		return "[" + l + "/" + m + "]";
	}
	
	public ulamek plus(ulamek y) {
		return new ulamek(l * y.m + m * y.l, m * y.m);
	}
	
	public ulamek minus(ulamek y) {
		return new ulamek(l * y.m - m * y.l, m * y.m);
	}
	
	public ulamek razy(ulamek y) {
		return new ulamek(l * y.l, m * y.m);
	}
	
	public ulamek przez(ulamek y) {
		return new ulamek(l * y.m, m * y.l);
	}
	
	public static void main(String[] args) { 
		ulamek x = new ulamek(3, 7);
		System.out.println("x="+x);
		
		ulamek y = new ulamek(1, 2);
		System.out.println("y="+y);
		
		ulamek z = x.plus(y);
		System.out.println("x+y="+z);
		
		ulamek a = new ulamek(3, 5);
		ulamek b = new ulamek(2, 7);
		ulamek c = new ulamek(9, 14);
		ulamek s = a.minus(b);
		ulamek t = s.przez(c);
		System.out.println("([3/5]-[2/7])/[9/14] "+t);
	}

}
