package exercicio1;

/**
 *
 * @author Tiago Santos
 */
public class Petroleiro extends Navio {

    private float capacidade;

    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param capacidade
     */
    public Petroleiro(String matricula, String nome, float comprimento, float capacidade) {
        super(matricula, nome, comprimento);
        this.capacidade = capacidade;
    }

    /**
     *
     * @return
     */
    public float getCapacidade() {
        return capacidade;
    }

    /**
     *
     * @param capacidade
     */
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

}
