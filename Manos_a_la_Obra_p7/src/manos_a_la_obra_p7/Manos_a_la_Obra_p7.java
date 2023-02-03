/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos_a_la_obra_p7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author droa
 */
public class Manos_a_la_Obra_p7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        
        int x = 20;
        
        try{
            boolean aux; // se puede hacer una excepción.... no usarlo en otas palabras.
            aux=numerosA.add(x);
        }catch(Exception e){
            System.out.println("Elemento no Adicionado");
        }
        System.out.println();    // Devuel true cuando se adiciona el elemento. Ideal para para usarlo con un try y catch.
       
        for (int i=0;i < 5; i++){
            try{
               numerosA.add(x+i);
            }catch(Exception e ){
                System.out.println("No se adicionó el elemento "+(numerosA.size()-1));
            }
        }
        
        
        //int x = 30;
        //System.out.println(numerosA.add(x));  
        
        
        
        // CONJUNTOS
         HashSet<Integer> numerosB = new HashSet();
   
        Integer y = 20;
        numerosB.add(y);
        
        for (int i=0;i < 5; i++){
            try{
               numerosB.add(y+i);
            }catch(Exception e ){
                System.out.println("No se adicionó el elemento "+(numerosB.size()-1));
            }
        }

        // MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        
        for (int i=0;i < 5; i++){
            try{
               alumnos.put((dni+i),"Pepe_"+i);
            }catch(Exception e ){
                System.out.println("No se adicionó el elemento "+(alumnos.size()-1));
                
            }
        }
        
        // Imprimier Colecciones
        
        System.out.println("Imprimiento Colecciones ... ");
        System.out.println("ArrayLIst: ");
        System.out.println(numerosA.toString());
        
        System.out.println("HashSet: ");
        System.out.println(numerosB.toString());
        
        System.out.println("HashMap: ");        
        System.out.println("Con ToString:");
        System.out.println(alumnos.toString()); // no muestra hashcodes
        // Mentores
        System.out.println("Con Iterator:"); 
        Iterator<Map.Entry<Integer,String>> it = alumnos.entrySet().iterator();        
        System.out.print("{");
        while(it.hasNext()){
            Map.Entry<Integer,String> auxIt = it.next();
            System.out.print(" "+auxIt.hashCode()+":"+auxIt.getKey()+"="+auxIt.getValue()+",");          
        }
        System.out.println("}");
        // Jorge Opción ??
        System.out.println("Con ForEach:");
        System.out.print("{");
        for(Map.Entry<Integer, String> aux : alumnos.entrySet()){  
              
            System.out.print(" "+aux.hashCode()+":"+aux.getKey()+"="+aux.getValue()+",");
        }
        System.out.println("}");   
        
    }
   
    
}
