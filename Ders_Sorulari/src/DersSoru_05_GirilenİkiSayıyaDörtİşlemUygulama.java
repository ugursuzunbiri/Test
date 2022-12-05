import java.util.*;
public class DersSoru_05_GirilenİkiSayıyaDörtİşlemUygulama {

	public static void main(String[] args) {
		// Girilen iki sayıya dört işlem uygulama
		Scanner a=new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz: ");
		int s1=a.nextInt();
		System.out.println("Lutfen 2. sayiyi giriniz: ");
		int s2=a.nextInt();
		int tplm=s1+s2;
		int cikarma=s1-s2;
		int carpma=s1*s2;
		int bolme=s1/s2;
		System.out.println("Toplami: "+tplm+" Cikarimi: "+cikarma+" Bolumu: "+bolme+" Carpimi: "+carpma);
	}

}
