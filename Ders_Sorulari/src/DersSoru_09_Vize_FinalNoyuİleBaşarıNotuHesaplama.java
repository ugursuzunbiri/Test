import java.util.*;
public class DersSoru_09_Vize_FinalNoyuİleBaşarıNotuHesaplama {

	public static void main(String[] args) {
		// Vize ve final notu girilen öğrencinin başarı notunu bulduran program
		Scanner a=new Scanner(System.in);
		System.out.println("Lutfen Vize Notunu Giriniz: ");
		int vize=a.nextInt();
		System.out.println("Lutfen Final notunu giriniz: ");
		int fınal=a.nextInt();
		int basariNotu=(vize*40/100)+(fınal*60/100);
		System.out.println("Basari Notu: "+basariNotu);
	}

}
