package utils;

import java.util.function.Consumer;


public class Messenger {
	
	static Consumer<Object> pln = obj -> System.out.println(obj);
	
	public static void msg(Object obj) {
		pln.accept(obj);
	}
			
			
	public static void msgf(String msg, Object... args) {
		System.out.printf(msg, args);
		System.out.println();
	}
}
