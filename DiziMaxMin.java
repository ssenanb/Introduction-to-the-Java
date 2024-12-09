import java.util.*;
public class DiziMaxMin{

	public static void main(String args[]){
	int dizi [] = new  int[4];
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir dizi giriniz");
	for(int i = 0; i < dizi.length; i++){
		dizi[i] = scan.nextInt();
	}
	Arrays.sort(dizi);
	System.out.printf("Bu dizideki en küçük değer:%d\n",dizi[0]);
	System.out.printf("Bu dizideki en büyük değer:%d\n",dizi[3]);
	}
}
