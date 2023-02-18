package tiposcuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// demonstração de tipos curinga
		List<?> x = new ArrayList<Object>();
		List<Integer> y = new ArrayList<Integer>();
		x = y;

		List<Integer> z = Arrays.asList(28, 18, 8);
		printList(z);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
