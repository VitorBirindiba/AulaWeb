package Lista;

import java.lang.reflect.Method;

public class Solution {

	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		Integer[] intArray = {1, 2, 3 };
		String[] stringArray = {"Hello", "world", "ou não"};
		
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		
		int count = 0;
		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();
			System.out.println("=====" + name);
			if (name.equals("printArray"));
			count++;
						
		}
		
		if (count >1) {
			System.out.println("método sobrecarregado não permitido");
		}
		
	}

}
