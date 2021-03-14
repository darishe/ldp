
package exercicio1;


public class Petroleiro extends Navio{
    private float capacidade;
    
    public Petroleiro(String matricula, String nome, float comprimento, float capacidade){
        super(matricula, nome, comprimento);
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }
    
}
