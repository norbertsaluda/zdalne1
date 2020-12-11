

import java.util.Scanner;

public class zdalna12 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("podaj tekst");
String tekst=scanner.nextLine();

String nowy="";
for(int i=0;i<tekst.length();i++)
	{
		if(tekst.charAt(i)>='a' && tekst.charAt(i)<='z')
		nowy+=tekst.charAt(i);
	}
System.out.println("nowy tekst = "+nowy);
String r="999";
int u=Integer.parseInt(r)+1;
System.out.println(u);

	}

}
