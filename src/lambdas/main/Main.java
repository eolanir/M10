package lambdas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		//Fase 1
		System.out.println("FASE 1");
		
		List<String> names = new ArrayList<String>();
		
		names.add("Foo");
		names.add("Ait");
		names.add("Anna");
		names.add("Ricard");
		names.add("Al");
		names.add("Jean");
		names.add("Ann");
		names.add("Broncos");
		
		
		//Filter by starting character 'A' and length
		List<String> filteredNames = names.stream().filter(s -> s.charAt(0) == 'A' && s.length() == 3).collect(Collectors.toList());
		
		System.out.println(filteredNames.toString());
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(12);
		numbers.add(3);
		numbers.add(51);
		numbers.add(22);
		numbers.add(76);
		
		//String of numbers with 'e' at even and 'o' at odd.
		String numberString = numbers.stream().map(n -> addLetter(n)).collect(Collectors.joining(","));
		
		System.out.println(numberString);

		//Filter by strings containing 'o'
		List<String> filteredOne = names.stream().filter(s -> s.contains("o")).collect(Collectors.toList());
		
		System.out.println(filteredOne.toString());
	
		//Filter by string containing 'o' or more than 5 characters
		List<String> filteredTwo = names.stream().filter(s -> s.contains("o") || s.length() > 5).collect(Collectors.toList());
		
		System.out.println(filteredTwo.toString());
		
		List<String> months = new ArrayList<String>();

		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		//Print with lambda expression
		months.forEach(s -> System.out.println(s));
		
		//Print with method reference
		months.forEach(System.out::println);
		
		
		//Fase 2
		System.out.println("\nFASE 2");
		
		PiValue pi = () -> {return 3.1415;};
		
		System.out.println(pi.getPiValue());
		
		//Fase 3
		System.out.println("\nFASE 3");
		
		StringReverser reverser = (String frase) -> {StringBuilder builder = new StringBuilder(); builder.append(frase); builder.reverse(); return builder.toString();};
		
		System.out.println(reverser.reverse("I am groot."));
	}
	
	public static String addLetter(int i) {
		String txt = "";
		
		if(i % 2 == 0) {
			txt = "e" + i;
		} else {
			txt = "o" + i;
		}
		
		return txt;
	}


}

