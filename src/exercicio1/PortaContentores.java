package exercicio1;

/**
 *
 * @author Tiago Santos
 */
public class PortaContentores extends Navio {

    private int nrMaximoContentores;

    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param contentores
     */
    public PortaContentores(String matricula, String nome, float comprimento, int contentores) {
        super(matricula, nome, comprimento);
        this.nrMaximoContentores = contentores;

    }

    /**
     *
     * @return
     */
    public int getNrMaximoContentores() {
        return nrMaximoContentores;
    }

    /**
     *
     * @param nrMaximoContentores
     */
    public void setNrMaximoContentores(int nrMaximoContentores) {
        this.nrMaximoContentores = nrMaximoContentores;
    }

}
