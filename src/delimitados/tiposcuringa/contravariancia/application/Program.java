package delimitados.tiposcuringa.contravariancia.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	/*
	 * PRINCIPIO GET / PUT 
	 * Contravariância
	 */

	public static void main(String[] args) {

		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		// OK (PUT)
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		
		 // erro de compilacao (GET)
		// Number x = myNums.get(0);
	}
}
