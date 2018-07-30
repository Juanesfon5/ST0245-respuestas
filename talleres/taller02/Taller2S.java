package Taller__2;

import java.lang.Math;

public class Taller2S {
	//Ejercicio 1	Algoritmo de Euclides
	public static int gcd(int p, int q){
		if (q == 0) 
			return p;
		else 
			return gcd(q, p % q);
	}
		
	
	//Ejercicio 3	SumaGrupo	
	public static boolean SumaGrupo(int start, int[] nums, int target) {
		if (start >= nums.length) 
			return target == 0;
		return SumaGrupo(start + 1, nums, target - nums[start]) || SumaGrupo(start + 1, nums, target);
	}
		
		
	//Ejercicio 4	Combinaciones de letras de una cadena
	public static void combinations(String s) { 
		combinationsAux("", s); 
		}
	
	private static void combinationsAux(String prefix, String s) {  
		if (s.length() > 0) { 
	          System.out.println(prefix + s.charAt(0));   
	          combinationsAux(prefix + s.charAt(0), s.substring(1)); 
	          combinationsAux(prefix,               s.substring(1));        
	        }
	}	
	
}
