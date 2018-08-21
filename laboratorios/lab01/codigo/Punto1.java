
import java.util.Arrays;
import java.util.Random;

public class Punto1 {

	public static void main(String[] args) {

		int[] nums = randomArray(100000000);
		int m = nums.length - 1;

		System.out.print("Suma Arreglo ");
		System.out.println(sumaArr(nums, m)); // Explota con un arreglo tan grande (100'000.000)

		System.out.print("Max Arreglo ");
		System.out.println(maxArr(nums, m)); // Explota con un arreglo tan grande (100'000.000)

		System.out.println("Fibo 10 " + fiboWho(10));
		System.out.println("Fibo 20 " + fiboWho(20));
		System.out.println("Fibo 100 " + fiboWho(100)); //Se demora 2^100 eternidades
		System.out.println("Fibo 1000 " + fiboWho(1000)); //Se demora 2^1000 eternidades 

	}

	public static int[] randomArray(int size) { // Dado por el profesor
		int max = 5000;
		int[] array = new int[size];
		Random generator = new Random();
		for (int i = 0; i < size; i++)
			array[i] = generator.nextInt(max);
		return array;
	}

	public static int sumaArr(int[] nums, int m) { // funciona 1.1
		int acum;
		int pr = m;
		if (m == 0) {
			return nums[m];
		} else {
			acum = nums[pr] + sumaArr(nums, pr - 1);
		}
		return acum;

	}

	/*
	 * Para ambos metodos falta poner el arreglo de 10000....para eso hay que
	 * agrandar el stack, mas o menos como hacerlo aparece en la guía.
	 */
	public static int maxArr(int[] nums, int p) { // funciona 1.2 , ver taller4
		int champ;
		int temp = 0;
		champ = nums[p];

		if (p == 0)
			champ = nums[0];
		else
			temp = maxArr(nums, p - 1);
		if (temp > champ)
			champ = temp;

		return champ;
	}

	public static int fiboWho(int n) { // base de 1.3
		if (n <= 1) { // por definición....
			return n;
		} else {
			return fiboWho(n - 1) + fiboWho(n - 2); // sumar sumar sumar de n para abajo
		}
		/*
		este metodo tiene que recibir un termino n, y decir a que valor de
		la secuencia de fibonacci pertence.
		*/
	}
}
