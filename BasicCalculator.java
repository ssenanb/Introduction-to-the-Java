import java.util.Scanner;
import javax.swing.JOptionPane;

public class BasicCalculator{

	public static void main(String[] args){
	Scanner sayi = new Scanner(System.in);
	System.out.printf("Bir tam sayı girin: ");
	int sayi1 = sayi.nextInt();
	System.out.printf("Bir tam sayı girin: ");
	int sayi2 = sayi.nextInt();
	System.out.printf("Yapacağınız işlemi seçin:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçim:");
	int islem = sayi.nextInt();
	if((islem > 4) || (islem < 1))
		System.out.println("geçerli bir işlem seçiniz.");

	if(islem == 1){
		int sonuc1 = sayi1 + sayi2;
		System.out.println(sonuc1);
		JOptionPane.showMessageDialog(null,sonuc1,"Toplama İşleminin Sonucu",1);
	}else if(islem == 2){
		int sonuc2 = sayi1 - sayi2;
		System.out.println(sonuc2);
		JOptionPane.showMessageDialog(null,sonuc2,"Çıkarma İşleminin Sonucu",1);
	}else if(islem == 3){
		int sonuc3 = sayi1 * sayi2;
		System.out.println(sonuc3);
		JOptionPane.showMessageDialog(null,sonuc3,"Çarpma İşleminin Sonucu",1);
	}else if(islem == 4){
		int sonuc4 = sayi1 / sayi2;
		System.out.println(sonuc4);
		JOptionPane.showMessageDialog(null,sonuc4,"Bölme İşleminin Sonucu",1);
		}
	}
}


	

