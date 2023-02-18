package delimitados.tiposcuringa.principiogetput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(7, 15, 23, 46, 33, 13, 22);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28, 15.35);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		print(myObjs);
		copy(myDoubles, myObjs);
		print(myObjs);
	}

	/*
	 * O metodo copia os elementos de uma lista menos generica para uma mais generica!
	 */
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number n : source) {
			destiny.add(n);
		}
	}
	
	// metodo generico para imprimir lista
	public static void print(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
