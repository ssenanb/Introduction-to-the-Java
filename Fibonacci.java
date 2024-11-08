import java.util.Scanner;
public class Fibonacci{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("sayi giriniz: ");
	int sayi = scan.nextInt();
	int ilk = 0;
	int ikinci = 1;
	int toplam;
	System.out.print(sayi + " sayısının fibonacci serisi: ");
	if(sayi <= 0)
		System.out.println("hatalı giriş");
	else{
	for(int i = 1; i <= sayi;i++){
		System.out.print(ilk + ",");
		toplam = ilk + ikinci;
		ilk = ikinci;
		ikinci = toplam;
		}
	}
	System.out.println();
}}
