import java.util.Scanner;
public class UcakBileti{

	public static void main(String[] args){
	//km birim fiyatı : 0.10$
	//12 yaşından küçükse %50 indirim
	//12 ve 24 yaş arasındaysa %10 indirim
	//65 yaşından büyükse %30 indirim
	//gidiş ve dönüşbiletinin birlikte alırsa %20 indirirm
	Scanner bilet = new Scanner(System.in);
	System.out.printf("Gideceğiniz yer kaç km?");
	double km = bilet.nextDouble();

	if (km <= 0.0)
            System.out.println("Geçersiz km bilgisi girdiniz.");

	System.out.printf("Gidiş ve dönüş biletinizi birlikte mi alacaksınız?\n1-Evet\n2-Hayır\n");
	int secim = bilet.nextInt();

	 if (secim != 1 && secim != 2) 
            System.out.println("Geçersiz seçim yaptınız.");

	System.out.printf("Yaşınızı giriniz: ");
	int yas = bilet.nextInt();

	    if (yas < 0)
            System.out.println("Geçersiz yaş girdiniz.");

	double asilFiyat = km * 0.10;

	if(yas < 12 && yas > 0){
		double indirim1 = asilFiyat / 2.0;
		if(secim == 1){
			double sonFiyat1 = (indirim1 * 4.0)/ 5.0;
			System.out.println("İndirimli bilet fiyatınız($):" + sonFiyat1);
		}else
			System.out.println("İndirimli bilet fiyatınız($): " +  indirim1);
	}
	else if(yas >= 12 && yas <= 24){
		double indirim2 = (asilFiyat * 9.0) / 10.0;
		if(secim == 1){
			double sonFiyat2 = (indirim2 *4.0)/ 5.0;
			System.out.println("İndirimli bilet fiyatınız($): " + sonFiyat2);
		}else
			System.out.println("İndirimli bilet fiyatınız($): " +  indirim2);
	}
	else if(yas >= 65){
		double indirim3 = (asilFiyat * 7.0) / 10.0;
		if(secim == 1){
			double sonFiyat3 = (indirim3 * 4.0) / 5.0;
			System.out.println("İndirimli bilet fiyatınız($): " + sonFiyat3);
		}else
			System.out.println("İndirimli bilet fiyatınız($): " + indirim3);
		}
	}
}
