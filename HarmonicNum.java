import java.util.Scanner;
public class HarmonicNum{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.printf("Bir sayi giriniz: ");
	int sayi = scan.nextInt();
	float sonuc = 0;
	if(sayi <= 0)
		System.out.println("geçersiz işlem.");
	else{
		for(float i = sayi; i >= 1;i--){
		sonuc += 1/i;
		}
	System.out.printf("Harmonic(%d) = %f\n",sayi,sonuc);
	}
}}
