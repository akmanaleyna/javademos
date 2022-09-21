package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Karakter Sayısı : "+ mesaj.length() );
		
		//5.karakteri verie 
		System.out.println("5. eleman: "+ mesaj.charAt(4) );
		
		//sonuna o anlık yazı ekler
		System.out.println(mesaj.concat(" yaşasın."));
		
		//bu karakter ile mi başlıyor diye sorar (true-false cevap gelir)
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("A"));
		
		//bu karakter ile mi bitiyor diye sorar (true-false cevap gelir)
		System.out.println(mesaj.endsWith("."));
		
		//0. ve 4. karakterler arasını yazdırır
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		
		//kaçıncı karakter olduğunu bulmamızı sağlar
		//aramaya baştan başlar
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.indexOf("av"));
		//aramaya sondan başlar
		System.out.println(mesaj.lastIndexOf('a'));	
		
		//karakterleri değiştirir
		System.out.println(mesaj.replace(' ', '-'));
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		//verilen karakterden itibaren metni yazar(bugün-2 -> gün gibi)
		System.out.println(mesaj.substring(2));
		
		//istenilen indexler arasını yazar
		System.out.println(mesaj.substring(2,10));
		
		//boşluklarda itibaren metni dizi ile böler
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//metnin hepsini küçük ve büyük harf yapar 
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
	}

}
