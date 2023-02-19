package Kolos1;

public class funkcjaKwadratowa {
double a, b, c;
	
	public funkcjaKwadratowa(double A,double B,double C) {
		if (A != 0) {
			a = A;	b = B;	c = C;
		}
		else
			System.out.println("Nie poprawnie podane parametry");
		
	}
	
	public double odcietaWierzcholka() {
		return -b/2/a;
	}	
	
	@Override
	public String toString() {
		return  "f'(x) = "+2*a +"x"+ " + " +b;
	}
	
	public static void main(String[] args) {
		funkcjaKwadratowa o = new funkcjaKwadratowa(2, 4, 1);
		System.out.println(o.odcietaWierzcholka());
		System.out.println(o);
	}

}
