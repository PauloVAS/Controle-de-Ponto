
package cadastrodeponto;

public class Gerente extends Funcionario {
    private String tipo_gerente;

	public Gerente(int matricula, String nome, String cpf, String estado_civil, String rg, String endereco, int cep,
			String telefone, double salario, String email, String tipo_gerente) {
		super(matricula, nome, cpf, estado_civil, rg, endereco, cep, telefone, salario, email);
		this.tipo_gerente = tipo_gerente;
	}

	public String getTipo_gerente() {
		return tipo_gerente;
	}

	public void setTipo_gerente(String tipo_gerente) {
		this.tipo_gerente = tipo_gerente;
	}
    
    

    
    

}