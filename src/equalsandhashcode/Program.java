package equalsandhashcode;

public class Program {

	// demonstração de uso: equals e hashcode.
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "marialuiza@gmail.com");
		Client c2 = new Client("Maria", "marialuiza@gmail.com");
	
		// O compilador trata a expressao literal de forma diferente
		String s1 = "test";
		String s2 = "test";
		
		// Oque não acontece aqui
		String s3 = new String("test");
		String s4 = new String("test");
		
		// Comparando nome  e email.
		// equals e hashcode comparam o conteudo dos objetos
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		// compara a referencia de memoria dos objetos
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}
	
}
