package entities;

public class Profissional extends Pessoa{
	public Profissional() {
		super();
	}
	
	public Profissional(
		String nome,
		String email,
		String cpf,
		String senha,
		String endereco,
		String telefone
	) {
		super(
			nome,
			email,
			cpf,
			senha,
			endereco,
			telefone
		);
	}
}
