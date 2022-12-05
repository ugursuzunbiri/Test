import java.util.*;
public class DersSoru_06_GirilenİkiSayınınKare_KüpünüBulma {

	public static void main(String[] args) {
		// Girilen sayının kare ve küpünü yazdıran program
		Scanner a=new Scanner(System.in);
		System.out.println("Lutfen sayiyi giriniz: ");
		int sayi=a.nextInt();
		int kare=sayi*sayi;
		int kup=sayi*sayi*sayi;
		System.out.println("Sayinin Karesi: "+kare+" Sayinin Kupu: "+kup);
	}

}
