
package boletin17n1;


public class Boletin17n1 {


    public static void main(String[] args) {
        int numero;
        int[]numeros= new int[6];
          for (int x=0;x<numeros.length;x++)
  numeros[x] = (int) (Math.random()*60)+1;
     
      numero = (int) (Math.random() * 60) + 1;
         Metodos m = new Metodos();
         m.amosar(numeros);
         System.out.println("lista de numeros ordenados");
        m.ordenar(numeros);
        m.amosar(numeros);
         System.out.println("lista de numeros ordenados al reves");
       m.ordenarReves(numeros);
        m.amosar(numeros);
        
        
        
    }
    
}
