
package cadastrodeponto;

public class Ponto {
    private int id_ponto;
    private String hora_chegada;
    private String hora_saida;
    private int fk_matricula;
	
    public Ponto(int id_ponto, String hora_chegada, String hora_saida, int fk_matricula) {
		super();
		this.id_ponto = id_ponto;
		this.hora_chegada = hora_chegada;
		this.hora_saida = hora_saida;
		this.fk_matricula = fk_matricula;
	}

	public int getId_ponto() {
		return id_ponto;
	}

	public void setId_ponto(int id_ponto) {
		this.id_ponto = id_ponto;
	}

	public String getHora_chegada() {
		return hora_chegada;
	}

	public void setHora_chegada(String hora_chegada) {
		this.hora_chegada = hora_chegada;
	}

	public String getHora_saida() {
		return hora_saida;
	}

	public void setHora_saida(String hora_saida) {
		this.hora_saida = hora_saida;
	}

	public int getFk_matricula() {
		return fk_matricula;
	}

	public void setFk_matricula(int fk_matricula) {
		this.fk_matricula = fk_matricula;
	}
    
    
    
    
}
