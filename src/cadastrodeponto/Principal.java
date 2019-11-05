package cadastrodeponto;

public class Principal {
	public static void main(String[] args) {
		Conexao con = new Conexao();
		String sql = "insert into funcionario (nome,cpf, estado_civil, rg, endereco,cep, salario, email)" + 
					 "values ('William Faraday', '123.321.123-56', 'casado', '1.231.156', 'rua das pilhas, 567', '12325648', 2654, 'mf@gmail.com')";
		int resultado = con.rodaSQL(sql);
		if (resultado > 0) {
			System.out.println("Cadastrado com sucesso!");
		}else {
			System.out.println("Erro ao cadastrar");
		}
	}

}
