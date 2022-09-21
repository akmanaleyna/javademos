package mukemmelSayı;

public class Main {

	public static void main(String[] args) {
		//6 --> 1,2,3
		//28 --> 1,2,4,7,14
		int number = 6;
		int total = 0;
		//System.out.println(remainder);
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		if (total == number)
			System.out.println("Sayı mükkemmel sayı");
		else
			System.out.println("Sayı mükkemmel sayı değil");
	}

}
