import java.util.Scanner;
public class Faktoriyel{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.printf("bir sayi giriniz: ");
	int sayi = scan.nextInt();
	int sonuc = 1;
	if(sayi < 0 )
		System.out.println("Geçersiz işlem.");
	else if(sayi == 0 || sayi == 1)
		System.out.printf("%d! = 1\n",sayi);
	else{
		for(int i = sayi; i >= 1;i--){
			sonuc *= i;
		}
	System.out.printf("%d! = %d\n",sayi,sonuc);
	}
}}
