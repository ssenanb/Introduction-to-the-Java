import java.util.*;
public class DiziTersi{

	static void ters(int dizi []){
	int uzunluk = dizi.length;
	for(int i = 0; i < uzunluk / 2;i++){
	int temp = dizi[i];
        dizi[i] = dizi[uzunluk - 1 - i];
        dizi[uzunluk - 1 - i] = temp;
		}
	for(int j : dizi)
                System.out.println(j);
	}
	public static void main(String[] args){
	int dizi [] = new int[4];
	Scanner scan = new Scanner(System.in);
	System.out.println("bir dizi giriniz");
	for(int i = 0; i < dizi.length ;i++){
		dizi[i] = scan.nextInt();
	}
	System.out.println("Dizinin ilk hali");
	for(int i : dizi)
		System.out.println(i);
	System.out.println("Dizinin ters çevrilmiş hali");
	ters(dizi);
	}
}
