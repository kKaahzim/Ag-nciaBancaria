package classes.entidades;

import java.util.ArrayList;

/**
 * Classe que representa uma pessoa.
 *  
 */
public class Pessoa {
    
    /*
        Uma pessoa aqui eh definida somente pelo seu id e nome.
        Uma pessoa pode adotar caes, cujas referencias serao guardadas dentro de 
         uma lista. Nos usamos aqui um objeto da classe ArrayList. Ela implementa 
         uma lista usando um Array (ou seja, um vetor) dinamico. A medida que eh 
         necessario, o ArrayList aloca mais posicoes na memoria.
        
    */
    private final int id;
    private String nome;
    private ArrayList<Cao> caes;
    
    /**
     *  Método construtor.
     * Atribui os parametros nome e id para o nome e id de Pessoa.
     * Inicializa a lista como um objeto lista vazio.
     * 
     * @param id 
     * @param nome 
     */
    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
        caes = new ArrayList<>();
    }
    
    /**
     * Adota um cao.
     * Adiciona o cao passado como parametro na lista caes.
     * 
     * @param c 
     */
    public void adota(Cao c){
        caes.add(c);
    }    
    
    /**
     * Doa um cao.Remove o cao que esta na posicao index da lista.
     * 
     * @param index 
     * @return o Cao removido
     */
    public Cao doa(int index){
        return caes.remove(index);
    }
    
    /**
     * Recupera um cao da lista, se remove-lo.
     * @param index
     * @return o Cao que esta na posicao index
     */
    public Cao getCao(int index){
        return caes.get(index);
    }
    
    public void exibe(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Mostrando caes adotados: ");
        for(Cao c : caes){ // para cada Cao c, na lista caes
            c.exibe();
        }
        
        /*
        
        Outra maneira de se fazer o mesmo for, com for classico de C:
        
        for(int i = 0; i < caes.size(); i++){
            Cao c = caes.get(i);
            c.exibe();
            //caes.get(i).exibe(); - versao em uma linha so 
        }
        */
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
