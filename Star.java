import java.util.Scanner;
public class Star{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.printf("kaç satır olsun yıldız? ");
	int satir = scan.nextInt();
	if(satir <= 0)
		System.out.println("geçersiz işlem");
	else{
		for(int i = 1; i <= satir;i++){
			for(int j = 1; j <= i; j++){
				System.out.printf("*");
			}
	System.out.println();
		}
	}
}}
