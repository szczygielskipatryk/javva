import java.util.Scanner;
public class palindrom {
	public static void main(String[] args)
	{
		Scanner wczytaj=new Scanner(System.in);
		String slowo1=wczytaj.nextLine();
		int rozmiar=slowo1.length();
		int h=rozmiar-1;
		int kk=3;
		for(int i=0;i<rozmiar;i++)
		{
			if(slowo1.charAt(i) !=slowo1.charAt(h))
			{
				kk=1;
			}
			else
			{
				kk=0;
			}
			h--;
		}
		if(kk==0)
		{
			System.out.print(slowo1+" jest palindromem");
		}
		else if(kk==1)
		{
			System.out.print(slowo1+" nie jest palindromem");
		}
		wczytaj.close();
	}
}
