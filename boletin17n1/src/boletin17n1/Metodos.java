
package boletin17n1;


public class Metodos {
     public void amosar(int[]lista){
        for(int ele:lista)
            System.out.println(ele);
    }
     
     public void ordenar(int[]num){
        int i,j;
        int aux;
        for(i=0;i<num.length-1;i++){
            for(j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    aux=num[i];
                    num[i]=num[j];
                    num[j]=aux;
                }
            }
        }
    }
      public void ordenarReves(int[]num){
        int i,j;
        int aux;
        for(i=0;i<num.length-1;i++){
            for(j=i+1;j<num.length;j++){
                if(num[i]<num[j]){
                    aux=num[i];
                    num[i]=num[j];
                    num[j]=aux;
                }
            }
        }
    }
}
