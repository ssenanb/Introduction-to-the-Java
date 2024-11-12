import java.util.Scanner;
public class TasKagitMakas{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
        System.out.printf("hangisini oynamak istersiniz? :");
	System.out.println("1-Taş");
	System.out.println("2-Kağıt");
	System.out.println("3-Makas");
	System.out.println("0-Çıkış");

	while(true){
	int secim = scan.nextInt();

        if(secim < 0 || secim > 3){
                System.out.println("geçersiz işlem.");
		continue;
	}

	if(secim == 0){
		System.out.println("oyundan çıkılıyor...");
		break;
	}

	int pc_secim = (int)(Math.random() * 3) + 1;
	if(secim == 1){
		if(pc_secim == 1)
			System.out.println("bilgisayar TAŞ dedi,berabere");
		else if(pc_secim == 2)
			System.out.println("bilgisayar KAĞIT dedi,bilgisayar kazandı");
		else if(pc_secim == 3)
			System.out.println("bilgisayar MAKAS dedi,siz kazandınız");
		}
	 else if(secim == 2){
		if(pc_secim == 1)
			System.out.println("bilgisayar TAŞ dedi,siz kazandınız");
		else if(pc_secim == 2)
			System.out.println("bilgisayar KAĞIT dedi,berabere");
		else if(pc_secim == 3)
			System.out.println("bilgisayar MAKAS dedi,bilgisayar kzandı");
		}
	else if(secim == 3){
		if(pc_secim == 1)
			System.out.println("bilgisayar TAŞ dedi,bilgisayar kazandı");
		else if(pc_secim == 2)
			System.out.println("bilgisayar KAĞIT dedi,siz kazandınız");
		else if(pc_secim == 3)
			System.out.println("bilgisayar MAKAS dedi,berabere");
			}
		}
	}
}


