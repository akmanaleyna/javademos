package recapDemo2;

public class Main {

	public static void main(String[] args) {
		//double[] myList = new double[7];
		double[] myList = {1.2,1.3,4.3,5.6,6.3};
		double total=0;
		double max = myList[0];
		for(double number:myList) {
			System.out.println(number);
			total = total + number;
			if(number > max) 
				max = number;
		}
		System.out.println("Toplam : " + total);
		System.out.println("En Büyük Sayı : " + max);
	}

}
