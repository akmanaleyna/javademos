package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 2500;
		int sayi3 = 200;
		int enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En Büyük : " + enBuyuk );
		/*
		Benim Çözümüm
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("1. Sayı en büyüktür = " + sayi1);
		}else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("2. Sayı en büyüktür = " + sayi2);
		}else if(sayi3>sayi2 && sayi3>sayi1) {
			System.out.println("3. Sayı en büyüktür = " + sayi3);
		}
		*/
		
	}

}
