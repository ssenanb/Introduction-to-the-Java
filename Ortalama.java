import java.util.Scanner;
public class Ortalama{

        public static void main(String[] args){
        Scanner not = new Scanner(System.in);

        System.out.printf("Vize notunuzu giriniz: \n");
        int vize = not.nextInt();
        int vizeNot = (vize * 2)/5;
        System.out.printf("Final notunuzu giriniz: \n");
        int finall = not.nextInt();
        int finallNot = (finall * 3)/5;
        int sonuc = vizeNot + finallNot;
        System.out.printf("Vize ve finall notlarının ortalaması: %d \n",sonuc);
        }
}
