import java.util.*;
public class DersSoru_04_GirilenİkiSayıyıToplayan {

	public static void main(String[] args) {
		// Girilen iki sayıyı toplayan program
		Scanner a=new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz: ");
		int s1=a.nextInt();
		System.out.println("Lutfen 2. sayiyi giriniz: ");
		int s2=a.nextInt();
		int toplam=s1+s2;
		System.out.println("Cevap: "+toplam);
	}

}
