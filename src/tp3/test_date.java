package tp3;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class test_date {
	public static void main(String [] args) {
		MaDate d1,d2,d3,d4;
		d1= new MaDate(2024);
		d2=new MaDate(9,12,2025);
		d3=new MaDate(12,13,2020);
		d1.setJours(9);
		d1.setMois(5);
		d2.setAnnée(2012);
		d2.setMois(4);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		
		Calendar cal= new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
		d4 =new MaDate(day, month, year);
		
		int ch;
		Scanner s=new Scanner(System.in);
		do {
		System.out.println("------- welcome ------- \n 1: ajouter un jour \n 2: ajouter plusieur jours \n 3: ajouter un mois \n 4:ajouter un année \n -->");
		 ch=s.nextInt();
		}while ((ch<1) && (ch>4));
		
		 switch (ch) {
		 case 1: 
			 System.out.println("ajouter un jour \n resultat-->");
			 d4.ajouterUnJour();
				System.out.println(d4);
			 break;
		 case 2: 
			 System.out.println("ajouter plusieur jours \n (donnez nb jour)  -->");
			 int j = s.nextInt();
			 d4.ajouterPluseursJours(j);
			 System.out.println("\n resultat -->");
				System.out.println(d4);
			 break;
		 case 3: 
			 System.out.println("ajouter un mois \n resultat-->");
			 d4.ajouterMois();
				System.out.println(d4);
			 
			 
			 break;
		 case 4: 
			 System.out.println("ajouter un jour \n resultat-->");
			 d4.ajouterUnAn();
				System.out.println(d4);
			 break;
		 
		 
		 
		 }
		s.close();
		
	}
}
