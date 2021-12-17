/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.HashMap;
import teste.model.Conta;

/**
 *
 * @author pc
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, Conta> map = new HashMap<>(); 
        Conta c = new Conta("Gustavo");
        map.put("Gustavo", c);
        System.out.println(map.get("Gustavo").getTitular());
    }
    
}
