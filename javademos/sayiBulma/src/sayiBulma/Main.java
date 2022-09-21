package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 3;
		boolean buldum = false;
		for (int sayi:sayilar) {
			if(sayi == aranacak)
				buldum = true;
				break;
		}
		
		if(buldum)
			System.out.println("Sayı Var");
		else 
			System.out.println("Sayi Yok");
	}

}
