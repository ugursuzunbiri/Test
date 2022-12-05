import java.util.*;
public class DersSoru_07_GirilenBirinciSayınınİkinciSayıyaGöreModunuAlma {

	public static void main(String[] args) {
		// Girilen birinci sayının ikinci sayıya göre modunu aldıran program.
		Scanner a=new Scanner(System.in);
		System.out.println("Lutfen 1. Sayiyi Giriniz: ");
		int s1=a.nextInt();
		System.out.println("Lutfen 2. Sayiyi Giriniz: ");
		int s2=a.nextInt();
		int mod=s1%s2;
		System.out.println(mod);
	}

}
