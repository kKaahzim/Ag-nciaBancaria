package classes.entidades;

/**
 * Classe que representa um cachorro.
 * 
 */
public class Cao {
    
    /*
    Atributos:
    Costumam ter dois ou mais indicadores:
    - indicador de acesso: private, public ou protected.
        private permite que apenas metodos dentro da classe acessem o atributo
        public permite que o atributo seja acessivel em qualquer lugar
        protected permite que subclasses acessem o atributo
    - tipo do atributo: 
        tipos primitivos: int, char, float, double, boolean
        tipos classe: qualquer atributo cujo tipo comeca com letra maiscula sera na verdade um objeto de uma classe
           - por exemplo, String eh uma classe em Java
    - outros indicadores: 
        final: atributo não pode ser modificado apos inicializacao (atribuicao no construtor)
        static: atributo eh da CLASSE e nao do objeto. todos objetos compartilham do mesmo atributo estatico
    */
    private final int id;
    private String nome;
    private String raca;
    private double peso;
    
    /**
     * Método construtor.
     * Um construtor eh responsavel por construir, ou seja, instanciar um objeto 
     * dessa classe na memoria. Ele tambem eh responsavel por inicializar os 
     * atributos desse objeto.
     * 
     * @param id
     * @param nome
     * @param raca
     * @param peso 
     */
    public Cao(int id, String nome, String raca, double peso){
        //usamos "this" para indicar a variavel do objeto
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        
    }
    
    public void exibe(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Raca: " + raca);
        System.out.println("Peso: " + peso);
    }
    
    /*
        Getters e setters: controlam o acesso a atributos privados
            - Getters: retornam o valor do atributo
            - Setters: modificam o valor do atributo
    
        Nem todos atributos precisam ter get e set. A regra eh: 
            - Se o atributo precisa ser visualizado fora do escopo da classe, ele precisa de um get
            - Se o atributo precisa ser modificado fora do escopo da classe, ele precisa de um set
    */
    
    //id nao pode ser modificado, entao so temos seu get
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
}
