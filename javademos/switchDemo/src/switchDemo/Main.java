package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel :Geçtiniz");
			break;
		case 'B':
			//System.out.println("Çok Güzel :Geçtiniz");
			//break;
		case 'C':
			System.out.println("İyi :Geçtiniz");
			//Case B ve C aynı çıktıyı verir
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default :
			System.out.println("Geçersiz Not Girdinizi");
		}

	}

}
