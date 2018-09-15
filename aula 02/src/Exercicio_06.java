
public class Exercicio_06 {

	public static void main(String[] args) {
		
		boolean var1 = true;
		boolean var2 = true;
		boolean var3 = false;
		boolean var4 = false;
		
		System.out.println(var1 && var2); //as duas precisam ser true
		System.out.println(var1 && var3);
		System.out.println(var1 && var4);
		System.out.println(var1 || var2); //só uma( ou as duas) podem ser true 
		System.out.println(var1 || var3);
		System.out.println(var1 || var4);
		System.out.println(var1 ^ var2);  
		System.out.println(var1 ^ var3);
		System.out.println(var1 ^ var4);
		

	}

}
