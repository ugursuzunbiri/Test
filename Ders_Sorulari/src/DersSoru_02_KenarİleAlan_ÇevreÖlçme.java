import java.util.*;
public class DersSoru_02_KenarİleAlan_ÇevreÖlçme {

	public static void main(String[] args) {
		// Kenarı Girilen Karenin Çevresini ve Alanını ekrana yazdırma
		Scanner a=new Scanner(System.in);
		System.out.println("Lutfen kenari giriniz:");
		int kenar=a.nextInt();
		int cevre=kenar*4;
		int alan=kenar*kenar;
		System.out.println("Karenin cevresi: "+cevre
				+ "\nKarenin alani: "+alan);
	}
}
