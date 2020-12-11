

import java.util.Random;


public class zdalna11 {

	public static void main(String[] args) {
int tab[]=new int[30];
Random r = new Random();

for(int i=0;i<tab.length;i++)
{
	tab[i]=r.nextInt(100)+1;
	System.out.println(tab[i]);
}

int temp;

for(int j=0;j<tab.length-1;j++)
{
	for(int i=0;i<tab.length-1;i++)
	{
		if(tab[i]>tab[i+1])	
		{
			temp=tab[i+1];
			tab[i+1]=tab[i];
			tab[i]=temp;		
		}
	}
}
System.out.println("=====================================");
for(int i=0;i<tab.length;i++)
System.out.println(tab[i]);

	}
}
