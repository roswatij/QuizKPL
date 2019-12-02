package id.ac.unpas.QuizKPL;
import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		Hitung hitung = new Hitung();
		int pilihan = 0,num1 = 0,num2 = 0;
		
		System.out.println("1.Tambah");
		System.out.println("2.Kurang");
		System.out.println("3.Bagi");
		System.out.println("4.Kali");
	
		System.out.println("Pilih Perhitungan : ");
		pilihan=sc.nextInt();
		switch(pilihan) {
			case 1:
				System.out.println("Masukan Biliangan Pertama : ");
				num1=sc.nextInt();
				System.out.println("Masukan Biliangan Kedua : ");
				num2=sc.nextInt();
				System.out.println("Hasilnya adalah "+hitung.hitungTambah(num1, num2));
				break;
			case 2:
				System.out.println("Masukan Biliangan Pertama : ");
				num1=sc.nextInt();
				System.out.println("Masukan Biliangan Kedua : ");
				num2=sc.nextInt();
				System.out.println("Hasilnya adalah "+hitung.hitungKurang(num1, num2));
				break;
			case 3:
				System.out.println("Masukan Biliangan Pertama : ");
				num1=sc.nextInt();
				System.out.println("Masukan Biliangan Kedua : ");
				num2=sc.nextInt();
				System.out.println("Hasilnya adalah "+hitung.hitungKali(num1, num2));
				break;
			case 4:
				System.out.println("Masukan Biliangan Pertama : ");
				num1=sc.nextInt();
				System.out.println("Masukan Biliangan Kedua : ");
				num2=sc.nextInt();
				System.out.println("Hasilnya adalah "+hitung.hitungBagi(num1, num2));
				break;
		}
	}
}
