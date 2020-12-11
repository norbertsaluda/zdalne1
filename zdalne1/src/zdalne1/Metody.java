package zdalne1;

public class Metody {
	
public static void dzielniki(int liczba) {
System.out.println("dzielniki liczby "+liczba);
	for(int i = 1;i<=(liczba / 2);i++)
		if(liczba % i == 0)
			 System.out.print(i+"; ");
	
	System.out.println();
}
	

public static boolean czy_parzysta(int liczba)
{
	if(liczba % 2 ==0)
	return true;
	else
		return false;
}

}