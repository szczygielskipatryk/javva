
public class dzialanie{
	public static void main(String[]args)
		{
			int wynik=0;
			System.out.print(wynik);
		}
		public static int dodaj(int a, int b)
		{

			return a+b;	
			
			
		}
		public int odejmij(int a, int b)
		{
			return a-b;
		}
		public int mnoz(int a, int b)
		{
			return a*b;
			
		}
		public float dziel(float a, float b)
		{
			return a/b;
		}
		public static int potega(int a, int b)
		{
		double var1=Math.pow(a, b);
		return (int) var1;
		}
	}