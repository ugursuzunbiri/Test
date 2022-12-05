import java.util.*;
public class DersSoru_08_BrütMaaşı_SatışSayısınaGöreNetMaaşBulma {

	public static void main(String[] args) {
		// Brüt maaş ve satış miktarı girilen personelin net maaşını bulduran program
		Scanner a=new Scanner(System.in);
		System.out.println("Maasi Giriniz: ");
		int brut=a.nextInt();
		System.out.println("Satis Sayisini Giriniz; ");
		int sSayisi=a.nextInt();
		int netMaas=brut+sSayisi*100;
		System.out.println(netMaas);
	}

}
