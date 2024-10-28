import java.util.Scanner;
public class DaireIslemleri{

        public static void main(String[] args){
        float pi = 3.14f;

        Scanner daire = new Scanner(System.in);
        System.out.printf("Alanı ve çevresi hesaplanacak dairenin yarıçapını giriniz:">        int r = daire.nextInt();

        float daireAlanı = pi*r*r;
        float daireCevre = pi*2*r;

        System.out.printf("Dairenin alanı(float türünde): %.2f\n",daireAlanı);
        System.out.printf("Direnin çevresi(float türünde): %.2f\n",daireCevre);

        System.out.printf("\n");

        int intdaireAlanı = (int)(pi*r*r);
        int intdaireCevre = (int)(2*pi*r);

        System.out.printf("Dairenin alanı(integer türünde): %d\n",intdaireAlanı);
        System.out.printf("Dairenin çevresi(integer türünde): %d\n",intdaireCevre);
        }
}
