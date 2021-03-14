
package exercicio1;

public class PortaContentores extends Navio {
    private int nrMaximoContentores;
    
    public PortaContentores(String matricula, String nome, float comprimento, int contentores){
        super(matricula, nome, comprimento);
        this.nrMaximoContentores = contentores;
        
    }

    public int getNrMaximoContentores() {
        return nrMaximoContentores;
    }
    public void setNrMaximoContentores(int nrMaximoContentores) {
        this.nrMaximoContentores = nrMaximoContentores;
    }

    
}
