package exercicio1;

import java.util.ArrayList;

public class Porto {
    ArrayList<Navio>  navios; 
    ArrayList<PortaContentores> portaContentores;
    ArrayList<Petroleiro> petroleiros;

    public boolean novoNavio(String matricula, String nome, float comprimento){
        Navio navio = new Navio(matricula, nome, comprimento);
        for(int i = 0; i < navios.size(); i++){
            if(matricula.equals(navios.get(i).getMatricula())){
               System.out.println("Matricula já existe");
                return false;
            }
        }
        navios.add(navio);
        return true;
    }
    public int maxContentores(){
        int resultado = 0;
         for(int i = 0; i < portaContentores.size(); i++){
            resultado += portaContentores.get(i).getNrMaximoContentores();
         }
        return resultado;
    }
    public float capacdidadeTotal(){
        float resultado = 0;
         for(int i = 0; i < portaContentores.size(); i++){
            resultado += portaContentores.get(i).getNrMaximoContentores();
         }
         resultado *= 10;
          for(int i = 0; i < petroleiros.size(); i++){
            resultado += petroleiros.get(i).getCapacidade();
         }
          return resultado;
    }
    
    
    
    
}