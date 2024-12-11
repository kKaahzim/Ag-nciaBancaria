package primeiroprojetojava;

// imports são o equivalente ao #include<> do C
// o formato é pacote.classe
import classes.calculadora.Calculadora;
import classes.entidades.Cao;
import classes.entidades.Pessoa;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal do projeto.
 *
 * Eh nela que colocamos o metodo main(), que sera usado para executar o
 * programa.
 */
public class PrimeiroProjetoJava {

    /**
     * O metodo main eh encarregado de executar toda a logica do programa. Ele
     * eh um metodo estatico, ou seja, nao necessita de um objeto da classe
     * PrimeiroProjetoJava para ser executado. Como o main nao retorna nada, eh
     * void.
     *
     * @param args parametros de execucao que podem ser recebidos por linha de
     * comando (similar ao argc/argv de C)
     */
    public static void main(String[] args) {

        /*
            Parte 1:
             - instanciando objetos da classe Cao, usando seus construtores.
             - lendo valores do teclado para instanciar um terceiro Cao com esses valores, usando a classe Scanner.
             - exibindo seus valores, chamando o metodo exibe()
         */
        Cao c1 = new Cao(1, "Rex", "Pitbull", 19.6);
        Cao c2 = new Cao(2, "Magda", "Border Collie", 15);
        
        // leitura de teclado pode ser feita de varios modos
        // Scanner pode ser usado inclusive para arquivos
        // crio um objeto sc da classe Scanner, e construo ele usando como stream o System.in (o teclado).
        // uso o metodo useLocale para trocar a localizacao para US, para ler doubles com ponto do teclado.
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        
        // lendo dados do terceiro Cao
        System.out.println("Digite o id do cao:");
        int n = sc.nextInt();        
        sc.nextLine(); // limpando o buffer (similar a usar getchar() em C)
        System.out.println("Digite o nome: ");
        String name = sc.nextLine();
        System.out.println("Digite a raca: ");
        String breed = sc.nextLine();        
        System.out.println("Digite o peso: ");
        double weight = sc.nextDouble();
        
        Cao c3 = new Cao(n, name, breed, weight);
        sc.close();
        
        System.out.println("Exibindo informacao sobre os caes: ");
        c1.exibe();
        c2.exibe();
        c3.exibe();

        /*
            Parte 2:
                - exemplificando get e set: 
                    chamando getNome para recuperar o nome de c1
                    chamando setNome para trocar o nome para Scooby Doo
                - Comparacao de String através do metodo .equals() da classe String
                    
        */
        String nome_do_cachorro = c1.getNome();
        c1.setNome("Scooby Doo");

        if (!nome_do_cachorro.equals(c1.getNome())) {
            System.out.println("Nomes diferentes!");
        }

        /*
            Parte 3: ilustrando como atribuicao de objetos eh feita por referencia
                - exibe o c1, antes de editar
                - atribui c1 para c2, o que eh feito atraves de referencia e nao valor (copia)
                - atualiza o nome de c2
                - Reexibe c1, observando que seu nome tambem foi alterado         
        */
        System.out.println("\n\nExibindo o c1:");
        c1.exibe();
        c2 = c1;
        c2.setNome("Chimbinha");

        System.out.println("\n\nReexibindo o c1:");
        c1.exibe();

        /*
            Parte 4: ilustrando o uso de um objeto da classe Calculadora
                - instancia-se um objeto de Calculadora
                - calcula-se a soma dos pesos dos caes c1 e c3
                - se a operacao deu certo, exibe o resultado
        */
        Calculadora calc = new Calculadora();
        double conta = calc.calcula(c1.getPeso(), c3.getPeso(), '+');
        if (conta != Double.NEGATIVE_INFINITY) { // esta checagem eh para garantir que foi escolhido uma opcao valida
            System.out.println("\n\n A soma de 15.4 e 10.6 eh " + conta);
        }

        /*
            Parte 5: ilustrando-se listas com a classe Pessoa
                - instancia um objeto Pessoa
                - pessoa adota c1 e c3, adicionando-os em sua lista
                - exibe-se pessoa e seus caes pelo metodo exibe()
                - pessoa doa o Chimbinha, mostrando que agora ha apenas um elemento na lista
        */
        Pessoa p = new Pessoa(0, "Velma");
        p.adota(c1);
        p.adota(c3);

        p.exibe();
        
        int index = 1;
        System.out.println("\n\nO cao na posicao " + index + " eh o " + p.getCao(index).getNome());

        Cao doado = p.doa(0);

        System.out.println("\n\nDoou o " + doado.getNome() + " e agora exibo: ");
        p.exibe();       
        
    }

}
