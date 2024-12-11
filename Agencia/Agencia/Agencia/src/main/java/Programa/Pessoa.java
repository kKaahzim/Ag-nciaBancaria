package Programa;

import Utilitario.Utils;


public class Pessoa {
    
    private static int counter = 1;
   
    private int numeroPessoa ;
    private String nome;
    private String CPF;
    private String email;
    
    public Pessoa() {}

    public Pessoa(String nome, String CPF, String email) {
        this.numeroPessoa = Pessoa.counter;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        counter += 1;
    }
    
      public int getNumeroPessoa() {
        return this.numeroPessoa;
    }
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){
        return "\nNome: " + this.getNome() +
               "\nCPF: " + this.getCPF() +
               "\nEmail: " + this.getEmail();
    }
    

}
