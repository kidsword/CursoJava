package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {

		Map<Integer, String> usuarios =  new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		usuarios.put(5, "Ronaldo");
		
		msg(usuarios.size());
		msg(usuarios.isEmpty());
		msg(usuarios.keySet());
		msg(usuarios.values());
		msg(usuarios.entrySet());		
		
		msg(usuarios.containsKey(3));
		msg(usuarios.containsKey(30));
		msg(usuarios.containsValue("Rebeca"));
		
		msg(usuarios.get(4));
		msg(usuarios.remove(1));
		msg(usuarios.remove(4, "Gui"));
		
		for(int key: usuarios.keySet())
			msg(key);
		
		for(var value: usuarios.values())
			msg(value);
		
		for(var usu: usuarios.entrySet())
			msg(usu.getKey() + " ===> " + usu.getValue());			
				

	}
	static void msg(Object obj) {
		System.out.println(obj);
	}
}
