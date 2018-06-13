import java.util.Scanner;
public class cezar {
	public static void main(String[] args)
	{
		Scanner welp=new Scanner(System.in);
		System.out.println("Podaj slowo(zdanie) do zakodowania: ");
		String slowo=welp.nextLine();
		System.out.println("Słowo zakodowane: ");
		koduj(slowo);
		System.out.println("Podaj slowo(zdanie) do odkodowania: ");
		String odkodowanie=welp.next();
		System.out.println("Słowo odkodowane: ");
		odkoduj(odkodowanie);
		
		welp.close();
	}
		
		
		
		
		public static void koduj(String slowo)
		{
		char [] pomoc=slowo.toCharArray();
		int[] pomoc2=new int[slowo.length()];
		char [] wynik=new char[slowo.length()];
		for(int i=0;i<slowo.length();i++)
		{
			if(pomoc[i]==' ') 
			{
				pomoc2[i]=((int)pomoc[i]);
			}
			else
			{
				pomoc2[i]=((int)pomoc[i]+3);
			}
			if(pomoc2[i]>(int)'z')
			{
				pomoc2[i]=pomoc2[i]-26;
			}
			wynik[i]=(char)pomoc2[i];
		
			}
		System.out.println(wynik);
	
	}
		public static void odkoduj(String slowo)
		{
				char [] pomoc=slowo.toCharArray();
				int[] pomoc2=new int[slowo.length()];
				char [] wynik=new char[slowo.length()];
				
	
		}
	
		}
