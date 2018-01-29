
package boletin17n2;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Metodos {
    
     public void amosar(Alumno[]lista){
        for(Alumno ele:lista)
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
       public Alumno[] crearArray(){
    

          Alumno[]ele = new Alumno[4];
          String nom;
          int nota;
          
          for(int i =0;i<ele.length;i++){
         nom=JOptionPane.showInputDialog("nome");
          nota=Integer.parseInt(JOptionPane.showInputDialog("nota"));
          ele[i]= new Alumno(nom,nota);
          
          }
        
        return ele;
  
    }
      
      
     public void numeroAS(Alumno[]ele){
         int aprobado=0,suspenso=0;
         for(int c=0;c<ele.length;c++){
         if (ele[c].getNota()>=5){
             aprobado = aprobado+1;
             
         }else {
             suspenso = suspenso+1;
         }
         }
         
         System.out.println("suspensos= "+suspenso+","+" aprobados=  "+aprobado);
     } 
      
     public void notaMedia(Alumno[]ele){
         float media;
         int suma=0,cont=0;
        for(int c=0;c<ele.length;c++){
            suma=suma+ele[c].getNota();
            cont=cont+1;
        } 
         media =(float)suma/cont;
         System.out.println("nota media =  "+media);
     } 
      public void mejorNota(Alumno[]ele){
          int i,j;
        int aux;
          for(int c=0;c<ele.length;c++){
              
          }
      }
}
