import java.util.Scanner;
public class WhileOrnek3{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.printf("bir sayi giriniz: ");
	int sayi = scan.nextInt();
	for(int i = 1;i <= sayi;i++){
	System.out.printf("%d ^ 2 = %.0f\n",i,Math.pow(2,i));
	}
}}
