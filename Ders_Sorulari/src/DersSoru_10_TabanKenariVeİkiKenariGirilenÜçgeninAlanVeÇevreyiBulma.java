import java.util.*;
public class DersSoru_10_TabanKenariVeİkiKenariGirilenÜçgeninAlanVeÇevreyiBulma {

	public static void main(String[] args) {
		// Taban kenarı, diğer iki kenarı ve yüksekliği girilen üçgenin çevre ve alanını bulduran program
		Scanner a=new Scanner(System.in);
		System.out.println("Taban Kenari Giriniz: ");
		int taban=a.nextInt();
		System.out.println("Kenari Giriniz: ");
		int kenar1=a.nextInt();
		System.out.println("Kenari Giriniz: ");
		int kenar2=a.nextInt();
		System.out.println("Yukseklik Giriniz: ");
		int yükseklik=a.nextInt();
		int cevre=taban+kenar1+kenar2;
		int alan=taban*yükseklik/2;
		System.out.println("Ucgenin Cevresi: "+cevre+" Ucgenin Alani: "+alan);
	}

}
