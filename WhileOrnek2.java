import java.util.Scanner;
public class WhileOrnek2{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	int baslangic = 0;
	System.out.printf("bir sayı giriniz: ");
	int sayi  = scan.nextInt();
	while(sayi >= 0){
		if(sayi % 2 != 0)
			baslangic += sayi;
	System.out.printf("bir sayı giriniz: ");
        sayi  = scan.nextInt();
	}
	System.out.println("sonuc: " + baslangic);
	}
}
