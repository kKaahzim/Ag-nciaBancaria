package classes.calculadora;

/**
 * Classe que define uma calculadora. 
 * 
 */
public class Calculadora {
    
    public Calculadora(){}
    
    /**
     * Metodo privado. Soma dois valores.
     * @param x
     * @param y
     * @return a soma dos valores
     */
    private double soma(double x, double y){
        return x + y;
    }
    
    /**
     * Metodo privado. Subtrai dois valores
     * @param x
     * @param y
     * @return a subtracao dos valores
     */
    private double subtrai(double x, double y){
        return x - y;
    }
    
    /**
     * Calcula uma operacao entre dois atributos. A operacao eh ditada pelo parametro op.
     * O metodo invoca um dos metodos privados definidos a cima com base no operador fornecido.
     * 
     * @param x
     * @param y
     * @param op
     * @return o resultado da operacao
     */
    public double calcula(double x, double y, char op){
        double res;
        
        switch(op){
            case '+': res = soma(x, y); 
                break;
            case '-': res = subtrai(x, y);
                break;
            default: System.out.println("Operacao nao suportada...");
                    res = Double.NEGATIVE_INFINITY;
        }
        
        return res;
    }
    
}
