package aula03;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String novoArray[] = new String[5];
		novoArray[0]= "vitor";
		novoArray[1]= "luciana";
		novoArray[2]= "alice";
		novoArray[3]= "dudu";
		novoArray[4]= "flora";
		
		
		System.out.println(Arrays.toString(novoArray));
		
		Arrays.sort(novoArray);
		
		System.out.println(Arrays.toString(novoArray));
		
		System.out.println("a[" + Arrays.binarySearch(novoArray,0  ) + "]");
		//System.out.println(novoArray[1]);
		//System.out.println(novoArray[2]);
		//System.out.println(novoArray[3]);
		//System.out.println(novoArray[4]);
		
		//for (String i : novoArray) {
			//System.out.println(i); }
			
		}
		
				

	}


