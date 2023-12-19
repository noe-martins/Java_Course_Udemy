package application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMapDemo1 {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		/*
		 * ADICIONAR VALOR EM UM "Map"
		 * 
		 * put(K,V) --> K (CHAVE) | V (VALOR)
		 */
		cookies.put("username", "maria");
		cookies.put("phone", "988770011");
		cookies.put("email", "maria@gmail.com");
		
		
		/*
		 * IMPRIMIR CHAVES DE UM "Map"
		 * PEGAR O CONTEÚDO DE UMA CHAVE
		 * 
		 * keySet() --> RETORNA UM Set<K>
		 * get(key) --> RETORNA O CONTEÚDO DE UMA CHAVE(Value)
		 */
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		
		/*
		 * REMOVENDO UMA CHAVE
		 * 
		 * remove(key)
		 */
		cookies.remove("email");
		System.out.println("--------------------");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		
		/*
		 * VERIFICAR DE EXISTE UMA CHAVE NO "Map"
		 * 
		 * containsKey(key) --> RETORNA UM boolean DIZENDO SE CONTÉM OU NÃO A CHAVE ESPECIFICADA
		 */
		System.out.println("--------------------");
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		
		/*
		 * IMPRIMINDO O TAMANHO DO "Map"
		 * 
		 * size() --> RETORNA UM INTEIRO COM O TAMANHO DA ESTRUTURA
		 */
		System.out.println("--------------------");
		System.out.println("Map size: " + cookies.size());
	}

}
