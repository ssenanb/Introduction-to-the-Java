import java.util.*;
public class kalgec{

public static float hesapla(int vize,int finalN){
float ilk = (vize) * 40 / 100.0f;
float  iki = (finalN) * 60 / 100.0f;
return ilk + iki;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("kaç kişi için işlem yapıcaksınız");
int kisiler = scan.nextInt();
scan.nextLine();//temizlik
notlar sonuc = new notlar(kisiler);

System.out.println("adları giriniz");
for(int i = 0; i < kisiler; i++){
sonuc.isimler[i] = scan.nextLine();
}

System.out.println("sırasıyla ilk ve son sınavlarınızı giriniz");
for(int i = 0; i < kisiler; i++){
sonuc.not[0][i] = scan.nextInt();
sonuc.not[1][i] = scan.nextInt();
}

for(int i = 0;i < kisiler;i++){
System.out.printf("%s --> %f\n",sonuc.isimler[i],hesapla(sonuc.not[0][i],sonuc.not[1][i]));
}

}}
