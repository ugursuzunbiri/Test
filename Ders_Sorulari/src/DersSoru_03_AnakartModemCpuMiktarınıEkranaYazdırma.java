import java.util.*;

public class DersSoru_03_AnakartModemCpuMiktarınıEkranaYazdırma {

	public static void main(String[] args) {
		// Alınan malzemelerin miktarını ekrana yazdırma
		Scanner a=new Scanner(System.in);
		System.out.println("Anakart miktarini giriniz: ");
		int anakart=a.nextInt();
		System.out.println("Modem miktarini giriniz: ");
		int modem=a.nextInt();
		System.out.println("Cpu miktarini giriniz: ");
		int cpu=a.nextInt();
		System.out.println(anakart+" Anakart, "+modem+" Modem, "+cpu+" Cpu Aldiniz...");
	}

}
