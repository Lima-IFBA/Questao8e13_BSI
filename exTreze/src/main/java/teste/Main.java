/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.HashMap;
import teste.model.Produto;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, Produto> mapProduto = new HashMap<>();
        mapProduto.put("ProdutoX", new Produto("Coca",5));
        mapProduto.put("ProdutoY", new Produto("Guarana",4));
        System.out.println(mapProduto.get("ProdutoX").getPrecoUnitario());
        
        Produto p = mapProduto.get("ProdutoX");
        System.out.println(p.getNome());
        
        
    }
    
}
