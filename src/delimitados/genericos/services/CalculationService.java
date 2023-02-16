package delimitados.genericos.services;

import java.util.List;

public class CalculationService {
	/*
	 * O metodo vai trabalhar com qualquer tipo T,
	 * desde que o T seja qualquer subtipo de Comparable T
	 * ou qualquer super classe de T. 
	 */
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		/*
		 * busca o maior elemento da lista
		 * declara o primeiro elemento como maior 
		 * em seguida compara se os demais são maiores do que o primeiro
		 * caso exista um maior, atualiza a variavel "max"
		 * e segue comparando até o fim da lista.
		 */
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
	
}
