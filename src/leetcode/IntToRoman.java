package leetcode;
import java.util.ArrayList;
import java.util.List;

public class IntToRoman {
	public static void main(String[] args) {
		System.out.println(conRoman(17));
	}

	public static String conRoman(int n) {
		final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder sb = new StringBuilder();
		if (n < 0) {
			return null;
		}
		for (int i = 0; i < values.length; i++) {
			if (n >=values[i]) {
				n = n - values[i];
				sb.append(symbols[i]);
			}

		}
		return sb.toString();
	}

}
