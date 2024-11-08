import java.util.Scanner;
public class Asal{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.printf("Sayi giriniz: ");
	int sayi = scan.nextInt();
	if(sayi < 2)
		System.out.println("asal sayı yoktur.");
	else if(sayi == 2)
		System.out.println("sayi asaldir");
	else{
		boolean bool = true;
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                System.out.println("Sayi asaldır.");
            } else {
                System.out.println("Sayi asal değildir.");
            }
        }

}}
