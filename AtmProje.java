import java.util.Scanner;

public class AtmProje {

    public static void main(String[] args) {
        int bakiye = 1000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz!");
        System.out.println("Güncel bakiyeniz: " + bakiye + " TL");

        while (bakiye > 0) {
            System.out.println();
            System.out.println("Yapacağınız işlemi seçiniz.");
            System.out.println("1- Para çek.");
            System.out.println("2- Para yatır.");
            System.out.println("3- Bakiye sorgula.");
            System.out.println("4- Kart iade.");
            int secenek = scan.nextInt();

            if (secenek == 1) {
                System.out.print("Çekeceğiniz tutar nedir? ");
                int tutar = scan.nextInt();

                if (tutar > bakiye) {
                    System.out.println("Yetersiz bakiye.");
                } else {
                    bakiye -= tutar;
                    System.out.printf("%d TL çekildi.\n", tutar);
                    System.out.printf("Güncel bakiyeniz: %d TL\n", bakiye);
                }

            } else if (secenek == 2) {
                System.out.print("Yatıracağınız tutar nedir? ");
                int diger_tutar = scan.nextInt();
                bakiye += diger_tutar;
                System.out.printf("%d TL hesabınıza yatırıldı.\n", diger_tutar);
                System.out.printf("Güncel bakiyeniz: %d TL\n", bakiye);

            } else if (secenek == 3) {
                System.out.printf("Güncel bakiyeniz: %d TL\n", bakiye);

            } else if (secenek == 4) {
                System.out.println("Yine bekleriz!");
                break;

            } else {
                System.out.println("Geçersiz işlem. Lütfen tekrar deneyiniz.");
            }
        }
    }
}
