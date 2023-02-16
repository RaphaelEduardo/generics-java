package introducao.generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString {
	
	private List<String> list = new ArrayList<>();
	
	public void addValue(String value) {
		list.add(value);
	}
	
	public String first() {
		// programa��o defensiva para ver se a lista est� vazia!
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		// se lista n�o for vazia...
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
	
}
