package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(1,4,5,6,7,8,9,10,11,11,12,12));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//How to loop the numbers ?
		for(int number:numbers) {
			System.out.println(number);
		}
	}

}
