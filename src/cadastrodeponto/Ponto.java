
package cadastrodeponto;

public class Ponto {
    private int matricula;
    private String chegada;
    private String saida;

    public Ponto(int matricula, String chegada, String saida) {
        this.matricula = matricula;
        this.chegada = chegada;
        this.saida = saida;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
    
    
}
