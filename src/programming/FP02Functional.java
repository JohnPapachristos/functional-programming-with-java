package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12,12,1,4,5,6,7,8,9,10,11,11));
		printEvenNumbersInListFunctionalPart1(List.of(12,12,1,4,5,6,7,8,9,10,11,11));
		printEvenNumbersInListFunctionalPart2(List.of(12,12,1,4,5,6,7,8,9,10,11,11));
		printEvenNumbersInListFunctionalPart3(List.of(12,12,1,4,5,6,7,8,9,10,11,11));
		printSquaresOfEvenNumbersInListFunctional(List.of(12,12,1,4,5,6,7,8,9,10,11,11));
		
	}

	private static void print(int number) {
		System.out.println(number);
	}
	
	private static void printEven(int number) {
		if(number % 2 ==0) {
			System.out.println(number);
		}
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//What to do ?
		//[1,4,5,6,7,8,9,10,11,11,12,12]
		//1
		//4
		
		numbers.stream()
			.forEach(FP02Functional::print);//Method reference
		
		//or
		
		numbers.stream()
		.forEach(System.out::println);
		
		//or
		
	}
	
	private static void printEvenNumbersInListFunctionalPart1(List<Integer> numbers) {
		
		numbers.stream()
		.forEach(FP02Functional::printEven);
	
		
	}
	
	private static void printEvenNumbersInListFunctionalPart2(List<Integer> numbers) {

		numbers.stream().filter(FP02Functional::isEven)
		.forEach(System.out::println);

	}

	private static void printEvenNumbersInListFunctionalPart3(List<Integer> numbers) {

		numbers.stream().filter(number -> number % 2 == 0)
		.forEach(System.out::println);

	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number -> number % 2 == 0) // it filters only the true values, is our check on what to accept and what not
		.map(number -> number * number) //It maps the number into number * number
		.forEach(System.out::println);

	}
}
