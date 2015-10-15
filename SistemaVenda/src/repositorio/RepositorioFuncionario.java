/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.funcionarios;
import java.util.ArrayList;
/**
 *
 * @author Mr Anderson
 */
public class RepositorioFuncionario {
    
    private static ArrayList<funcionarios> Listarfuncionarios = new ArrayList();
    /**
     *
     * @param codigo
     * @return
     */
    public static funcionarios pesquisarfuncionariosPeloCodigo(int codigo) {
        funcionarios funcionarios = null;
 
        
        for (funcionarios funcionarioAtual : Listarfuncionarios) {
            if (funcionarioAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                funcionarios = funcionarioAtual;
                break;
}
            
}    
        
        return funcionarios;
       
    }
    public static void editarfuncionarios(funcionarios Funcionarios) {
        
        for (funcionarios f : Listarfuncionarios) {
            if (f.getCodigo() == Funcionarios.getCodigo()) {
                f = Funcionarios;
                break;
            }
        }
    }

   
}
        
  
