/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Cliente;
import dados.Produto;
import java.util.ArrayList;


/**
 *
 * @author Mr Anderson
 */
public class RepositorioCliente {
    private static ArrayList<Cliente> listaClientes = new ArrayList();
    
    
    public static void inicializandoDados() {
        
        // criando os objetos diretamente
        Cliente c1 = new Cliente("José Anderson", "05/10/1994" , "Anderson@.. " , "Rua... " , 992280000, 555555555);
        
        listaClientes.add(c1);
        
    }
    public static void adicionarCliente (Cliente c) {
        
        listaClientes.add(c);
    }
   public static boolean temEspaco() {
        return listaClientes != null; 
    }
    
     
    public static Cliente pesquisarClientePeloCodigo(int codigo) {
        Cliente cliente = null;
 
        
        for (Cliente clienteAtual : listaClientes) {
            if (clienteAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                cliente = clienteAtual;
                break;
    }
            
}    
        
        return cliente;
    }
    public static void editarCliente(Cliente cliente) {
        
        for (Cliente c : listaClientes) {
            if (c.getCodigo() == cliente.getCodigo()) {
                c = cliente;
                break;
            }
        }
    }
}