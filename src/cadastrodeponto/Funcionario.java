package cadastrodeponto;

public class Funcionario{
    private int matricula;
    private String nome;
    private String cpf;
    private String estado_civil;
    private String rg;
    private String endereco;
    private int cep;
    private String telefone;
    private double salario;
    private String email;
	
    public Funcionario(int matricula, String nome, String cpf, String estado_civil, String rg, String endereco, int cep,
			String telefone, double salario, String email) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.estado_civil = estado_civil;
		this.rg = rg;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.salario = salario;
		this.email = email;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
    
    
    
   
}
