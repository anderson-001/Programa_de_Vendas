/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import javax.swing.JOptionPane;

/**
 *
 * @author Mr Anderson
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    private String data;
    private String email;
    private String endereco;
    private double telefone;
    private double cfp;
    
    
    private static int contadorCodigo = 1;

public Cliente() {
        System.out.println("Construtor default de Produto");

        codigo = contadorCodigo;

        contadorCodigo++;
 }
     
      public Cliente(String nome,
                   String data,
                   String endereco,
                   String email,
                   double telefone, 
                   double cfp) {
          
          codigo = contadorCodigo;
          contadorCodigo++;
          System.out.println("Construtor com argumentos");
          
          this.nome = nome;
        this.data = data;
        this.cfp = cfp;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        
      }
        
      public void imprimirDados() {
        
        System.out.println( toString() );
    }

        @Override
    public String toString() {
        
        String relatorio = "";
        relatorio += "Código: "+codigo;
        relatorio += "\nNome: "+nome;
        relatorio += "\nData de Cadastro: "+data;
        relatorio += "\nEmail para contato: "+email;        
        relatorio += "\nEndereço do Cliente: "+endereco;
        relatorio += "\nTelefone para contato: "+telefone;
        relatorio += "\nCpf: "+cfp;
        return relatorio;
    }
    public int getCodigo() {
        return codigo;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public double getCfp() {
        return cfp;
    }

    public void setCfp(double cfp) {
        this.cfp = cfp;
    }

    public String getTel() {
        String Tel = null;
return Tel;
    }

    public String getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}