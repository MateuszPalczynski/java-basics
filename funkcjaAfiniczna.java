package Kolos1;

public class funkcjaAfiniczna {
double a, b;
	
	public funkcjaAfiniczna(double A,double B) {
		if (A != 0)	{
		a = A;	b = B;
		}
		else
			System.out.println("a nie mo¿e byæ zerem!");
		}
		
	
	public String mZerowe() {
		if (a != 0)
			return -b/a+"";
		if (a == 0) {
			return "Nieprawid³owe dane";
		}
		return null;

	}	
	public double wartosc(double x) {
		if (a != 0)
		return a*x+b;
		else return b;
	}
	@Override
	public String toString() {
		return  "f(x) = " + a +"x + "+b;
	}
	public static void main(String[] args) {
		funkcjaAfiniczna o = new funkcjaAfiniczna(4, -1);
		System.out.println(o.wartosc(2.0));
		System.out.println(o.mZerowe());
		System.out.println(o);
	}

}
