package desafios.secao9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/*
		 * 1. Número para string binária... = > 6=>"110"
		 * 2. Reverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011"=> 3
		 */
		Consumer<Object> print = System.out::println;
		
		//Function<Integer, String> toBinaryString = n -> Integer.toBinaryString(n);
		Function<String, String> inverter = n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> fromBinarytoString = n -> Integer.parseInt(n, 2);
		
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(fromBinarytoString)
		.forEach(print);		
		
		
	}

}
