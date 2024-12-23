import java.util.*;
public class employee_manager{

public static double yillik(float maas){
return maas * 12;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);

employee kisiler = new employee();

System.out.println("isimleri ve departman giriniz");

for(int i = 0; i < kisiler.ad_departman.length;i++){
kisiler.ad_departman[i] = scan.nextLine();
}

System.out.println("maaşınızı girin");
for(int i = 0; i < kisiler.ad_departman.length;i++){
kisiler.maas[i] = scan.nextFloat();
}

for(int i = 0; i < kisiler.ad_departman.length; i++){
System.out.printf("%s --> %f\n",kisiler.ad_departman[i],yillik(kisiler.maas[i]));
}

}}
