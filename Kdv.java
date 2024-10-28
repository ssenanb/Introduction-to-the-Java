import java.util.Scanner;
public class Kdv{

        public static void main(String[] args){
        Scanner hesaplar = new Scanner(System.in);
        System.out.printf("Ürünün fiyatını girin: ");
        int fiyat = hesaplar.nextInt();
        System.out.printf("Ürünün yüzde kaç KDV'sini hesaplamak istiyorsunuz? ");
        int kdv = hesaplar.nextInt();

        int hesap = (fiyat*(100 + kdv))/100;
        int sonuc = hesap - fiyat;

        System.out.printf("%d liralık ürünün yüzde %d'li kdvsi %d'dir.\n",fiyat,kdv,sonuc};
}
