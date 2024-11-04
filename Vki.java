import java.lang.Math;
import java.util.Scanner;

public class Vki{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.printf("Boyunuzu m cinsinden arada nokta olacak şekilde (örneğin 1.75) giriniz: ");
	double boy = scan.nextDouble();

	System.out.printf("Kilonuzu kg cinsinden giriniz: ");
	double kilo = scan.nextDouble();

	double sonuc = kilo / Math.pow(boy,2.0);

	if (sonuc < 18.5)
		System.out.println("Zayıf");
	else if(sonuc >= 18.5 && sonuc <24.9)
		System.out.println("Normal Kilolu");
	else if(sonuc >= 25 && sonuc < 29.9)
		System.out.println("Fazla Kilolu");
	else if(sonuc >= 30 && sonuc < 34.9)
		System.out.println("1.derece obez (hafif obez)");
	else if(sonuc >= 35 && sonuc < 39.9)
		 System.out.println("2.derece obez (orta obez)");
	else if(sonuc >= 40)
		 System.out.println("3.derece obez (ağır obez)");
	}
}
