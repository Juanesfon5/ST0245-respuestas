//Buenas noches para todos, despues de muchos intentos, finalmente obtuve el código para permutar cualquier cosa. 
//Alguna duda, me escriben. Si está muy dificil lo de bits, lean un poco acá: 
//https://es.wikipedia.org/wiki/Operador_a_nivel_de_bits o por acá 
//https://graphics.stanford.edu/~seander/bithacks.html. Espero les ayude.

public static void rec(String s, String a, int mask){    
  int len1 = s.length();
  int len2 = a.length();
  //Si la actual permutacion tiene el mismo tamaño que el string que estamos permutando...
  //Bien :), ya tenemos una solucion... 
  if(len1 == len2){
    //Solo la imprimos.
    for(int i = 0; i < len2; ++i){
      System.out.print(a.charAt(i));
    }
    //Y para que las permutaciones no queden pegadas, hagamos un saltito de linea... :)
    System.out.println();
    return;
  }
  //Bored...
  for(int i = 0; i < s.length(); ++i){
    //Si la letra en la posicion i aun no se ha agregado...
    if((mask & (1 << i)) == 0){
      //No hay problema, La agregamos...
      a += s.charAt(i);
      //Volmamos a empezar, pero como ya tenemos la letra en i, le decimos al programa, This is  "mask | (1 << i)" ...
      rec(s, a, mask | (1 << i));
      //Pero la letra no se puede quedar ahi todo el tiempo.
      a = a.substring(0, a.length() - 1);
    }
  }
}
public static void rec(String s){
  rec(s, "", 0);
}