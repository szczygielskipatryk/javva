import java.util.Scanner;
public class androizm {

	public static void main(String[] args) {
		Scanner wybierz=new Scanner(System.in);
		String slowo1=wybierz.next();
		String slowo2=wybierz.next();
		slowo1=slowo1.toLowerCase();
		slowo2=slowo2.toLowerCase();
		char[] tablica1=slowo1.toCharArray();
		char [] tablica2=slowo2.toCharArray();
		//int pomocnicza=23;
		int wartosc1=0;
		int wartosc2=0;
		for(int i=0;i<slowo1.length();i++)
		{
			wartosc1+=(int)tablica1[i];
			wartosc2+=(int)tablica2[i];
			
				
		}
		if(wartosc1!=wartosc2)
		{
			System.out.print(slowo1 + " i "+ slowo2 +" nie są anagramami");
		}
		else if(wartosc1==wartosc2)
		{
			System.out.print(slowo1 + " i "+ slowo2 +" są anagramami");
		}
		wybierz.close();

	}

}
