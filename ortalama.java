import java.util.Scanner;

public class ortalama {

	public static void main(String[] args) {
		
		
		int mat, fizik, kimya, turkce, tarih, muzik ;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik Dersi Sınav Notunuzu Giriniz : ");
		
		mat = inp.nextInt();
		
		System.out.print("Fizik Dersi Sınav Notunuzu Giriniz : ");
		
		fizik = inp.nextInt();
		
		System.out.print("Kimya Dersi Sınav Notunuzu Giriniz : ");
		
		kimya = inp.nextInt();
		
		System.out.print("Türkçe Dersi Sınav Notunuzu Giriniz : ");
		
		turkce = inp.nextInt();
		
		System.out.print("Tarih Dersi Sınav Notunuzu Giriniz : ");
		
		tarih = inp.nextInt();
		
		System.out.print("Müzik Dersi Sınav Notunuzu Giriniz : ");
		
		muzik = inp.nextInt();
		
		int toplam = mat + fizik + kimya + turkce +tarih + muzik ;
		
		double ort = toplam / 6 ; 
		
		boolean gecti = ort > 60 ;
		
		System.out.print(gecti ? "Sınıfı Geçti" : "Sınıfta Kaldı");
		
       
		
	}

}
