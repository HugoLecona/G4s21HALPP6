/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21halpp6;

import java.util.ArrayList;

/**
 *
 * @author lecona
 */
public class G4s21HALPP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> lista = new ArrayList<String>();
        lista.add("Luis");
        lista.add("Fernando");
        lista.add("Francisco");
        lista.add("Jesus");
        lista.add("Jose");
        
        for (int i=0; i < lista.size(); i++){
            System.out.println("Valor en posicion {" + i + "] = " + lista.get(i));
        }

        int a = 0;
        for (String cadena : lista){
            System.out.println("Valor de la lista en posicion {" + a + "} = " + cadena);
            a++;
        }
        
        a = 0;
        lista.forEach(cadena -> {
            System.out.println("Valor de la lista " + cadena);           
        });
        
        lista.stream().forEach(cadena -> {
            System.out.println("Valor de la lista por medio de stream " + cadena);
        });
        
        
            
            
        
    }
    
}
