
package cadastrodeponto;

public class Gerente extends Funcionario {
    private int id_gerente;

    public Gerente(int matricula, String nome, String cpf, String estadoCivil, String rg, String rua, int numero, String bairro, String cep, String complemento, String uf, String telefone, String celular, String email, String senha, String confirmarSenha) {
        super(matricula, nome, cpf, estadoCivil, rg, rua, numero, bairro, cep, complemento, uf, telefone, celular, email, senha, confirmarSenha);
    }

    public int getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
    }
    
    

}