package usAl;
import java.util.Scanner;
public class UsAlma {
    public static int sayac=1;
    public static int usAl(int a,int b,int sayac,int sonIslem){
        if(b==1) return a;
        if(sayac==b) return sonIslem;
        sonIslem*=a;
        return usAl(a,b,++sayac,sonIslem);
    }

    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.println("Ussunu almak istediginiz sayinin tabanini(a) giriniz : ");
    int taban=k.nextInt();
    int sonIslem=taban;
    System.out.println("Ussunu almak istediginiz sayinini ussunu(b) giriniz : ");
    int ust= k.nextInt();
    System.out.println("a uzeri b = ");
    System.out.println(usAl(taban,ust,sayac,sonIslem));
    }
}
