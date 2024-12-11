package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;
    
    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }
    
    
    public static void operacoes(){
    
    System.out.println("-------------------------------------------------------");
    System.out.println("-------------Seja bem vindo a nossa Agencia------------");
    System.out.println("-------------------------------------------------------");
    System.out.println("-------------------Selecione uma Opcao-----------------");
    System.out.println("-------------------------------------------------------");
    System.out.println("        OPCAO 1 - Criar conta      ");
    System.out.println("        OPCAO 2 - Depositar        ");
    System.out.println("        OPCAO 3 - Sacar            ");
    System.out.println("        OPCAO 4 - Listar           ");
    System.out.println("        OPCAO 5 - Sair             ");
    
    
    
    int operacao = input.nextInt();
    
    switch(operacao) {
        case 1: 
            criarConta();
            break;
        case 2: 
            depositar();
            break;
        case 3: 
            sacar();
            break;
        case 4: 
            listar();
            break;
        case 5: 
            System.out.println("Obrigado por usar nosso sistema!");
            System.exit(0);
            
        default:
            System.out.println("Opcao invalida!");
            operacoes();
            break;
            
         
    }
    

    
    
    }
    
    public static void criarConta(){
        
        System.out.println("\nNome: ");
        String nome = input.next();
        
        System.out.println("\nCPF: ");
        String cpf = input.next();
        
        System.out.println("\nEmail: ");
        String email = input.next();
        
        Pessoa pessoa = new Pessoa(nome, cpf, email);
        
        Conta conta = new Conta(pessoa);
        
        contasBancarias.add(conta);
        System.out.println("Sua conta foi criada com sucesso!");
        
        operacoes();
        
    }
    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contasBancarias.size() > 0) {
            for(Conta contaa : contasBancarias) {
                if(contaa.getNumeroConta() == numeroConta) {
                    conta = contaa;
                }
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Valor que deseja depositar: ");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor depositado com exito!");
        }else {
            System.out.println("Conta nao encontrada");
        }
        operacoes();

    }

    public static void sacar() {
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Valor que deseja sacar: ");
            Double valorSaque = input.nextDouble();

            conta.sacar(valorSaque);
            //System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Conta nao encontrada");
        }

        operacoes();

    }
    public static void listar() {
        if(contasBancarias.size() > 0) {
            for(Conta conta: contasBancarias) {
               conta.exibe();
            }
        }else {
            System.out.println(" Nao existe contas cadastradas ");
        }

        operacoes();


    }

}
