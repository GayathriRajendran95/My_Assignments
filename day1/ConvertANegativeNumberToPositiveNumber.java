package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {
	int n;
	int number;

	public static void main(String[] args) {
		int number = 40;
		if (number < 0) {
			int n = number * -1;
			System.out.println(n);
		} else {
			System.out.println(number);
		}
	}

}