package delimitados.tiposcuringa.contravariancia.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	/*
	 * PRINCIPIO GET / PUT
	 */

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);

		List<? extends Number> list = intList;

		// OK! (GET)
		Number x = list.get(0);
		// Erro de compilação! (PUT)
		list.add(20);  
	}
}
