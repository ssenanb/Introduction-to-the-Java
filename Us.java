import java.util.Scanner;
public class Us{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.printf("sayi giriniz: ");
	int sayi = scan.nextInt();
	if(sayi <= 0)
		System.out.println("geçersiz işlem.");
	else{
		for(int i = 1; i <= sayi ;i++){
			double sonuc = Math.pow(i,2);
			System.out.printf("%d ^ 2 = %.0f\n",i,sonuc);
			}
		}
	}
}
