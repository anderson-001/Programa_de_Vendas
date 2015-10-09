/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

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
    private String telefone;
    private String cpf;
    
    
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
                   String telefone, 
                   String cpf) {
          
          codigo = contadorCodigo;
          contadorCodigo++;
          System.out.println("Construtor com argumentos");
          
          this.nome = nome;
        this.data = data;
        this.cpf = cpf;
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
        relatorio += "\nCpf: "+cpf;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCfp() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        
return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getcpf() {
        return cpf;
    }

    public String gettelefone() {
     return telefone;
    }
}