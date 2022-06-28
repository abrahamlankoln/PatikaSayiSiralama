import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		Scanner deger = new Scanner(System.in);
		System.out.println("lutfen ilk sayiyi giriniz: ");
		a = deger.nextInt();
		System.out.println("lutfen ikinci sayiyi giriniz: ");
		b = deger.nextInt();
		System.out.println("lutfen ucuncu sayiyi giriniz: ");
		c = deger.nextInt();
		if (a > b && a > c && b > c) {
			System.out.println("siralama: a>b>c");
		}
		if (a > b && a > c && c > b) {
			System.out.println("siralama: a>b>c");
		}
		if (b > a && b > c && a > c) {
			System.out.println("siralama: b>a>c");
		}
		if (b > a && b > c && c > a) {
			System.out.println("siralama: b>c>a");
		}
		if (c > a && c > b && a > b) {
			System.out.println("siralama: c>a>b");
		}
		if (c > a && c > b && b > a) {
			System.out.println("siralama: c>b>a");
		}
	}

}
