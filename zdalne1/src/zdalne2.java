import java.util.Scanner;

import zdalne1.Metody;

public class zdalne2 {
	

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("podaj pierwsza liczbe = ");
int liczba1= scanner.nextInt();

if(Metody.czy_parzysta(liczba1))
System.out.println("liczba jest parzysta");
else
	System.out.println("liczba nie jest parzysta");
System.out.println("git");

}
}