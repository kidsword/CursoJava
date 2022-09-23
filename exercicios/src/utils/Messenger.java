package utils;

public class Messenger {
	public static void msg(Object obj) {
		System.out.println(obj);
	}
	public static void msgf(String msg, Object... args) {
		System.out.printf(msg, args);
		System.out.println();
	}
}
