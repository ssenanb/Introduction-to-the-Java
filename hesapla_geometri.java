import java.util.*;
public class hesapla_geometri{

public static int alan_kare(int a1,int a2){
return a1 * a2;
}
public static int alan_dikdortgen(int a,int b){
return a * b;
}
public static int alan_dik_ucgen(int a,int b){
return (a * b) / 2;
}
public static int alan_daire(int r){
return 3 * r * r;
}

public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("hangi alanı hesaplamk istiyosunuz yazın");
String alan = scan.nextLine();

geometri sekil = new geometri();

if(alan.equals(sekil.kare)) 
	System.out.println(alan_kare(2,2));
else if(alan.equals(sekil.dikdortgen))
	 System.out.println(alan_dikdortgen(2,3));
else if(alan.equals(sekil.dik_ucgen)) 
	System.out.println(alan_dik_ucgen(4,6));
else if(alan.equals(sekil.daire)) 
	System.out.println(alan_daire(2));

}}
