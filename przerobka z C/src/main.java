import java.util.Scanner;
public class main {
	public main (String[] args)
	{
		Scanner czytaj=new Scanner(System.in);
		System.out.println("Podaj swoj wiek:");
		int zmienna=czytaj.nextInt();
		System.out.println("Podaj swoje imie:");
		String zmienna2=czytaj.next();
		System.out.println("Podaj swoje Nazwisko:");
		String zmienna3=czytaj.next();
		int[] pesel=new int[11];
		for(int i=0;i<11;i++)
		{
			System.out.println("Podaj "+ (i+1) +" pozycje numeru pesel");
			pesel[i]=czytaj.nextInt();
			if(pesel[i]>9&&pesel[i]<0)
			{
				System.out.println("Nie mozna wstawic liczby dwucyfrowej i ujemnej ");
				System.exit(1);
			}
			
		}
		System.out.println("Podaj wzrost: ");
		double wzrost=czytaj.nextDouble();
		System.out.print("Twoj wiek to:"+zmienna+ "\nTwoje imie i nazwisko to: "+zmienna2+ " " + zmienna3); 
		System.out.printf("Twoj wzrost to: %.2f ",wzrost );
		System.out.println("Twoj pesel to: ");
		czytaj.close();
		for(int i=0;i<11;i++)
		{
			System.out.print(pesel[i]);
		}
	}

}