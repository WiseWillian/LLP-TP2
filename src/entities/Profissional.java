package entities;

public class Profissional extends Pessoa{
	public Profissional() {
		super();
	}
	
	public Profissional(
		String username,
		String nome,
		String email,
		String cpf,
		String senha,
		String endereco,
		String telefone
	) {
		super(
			username,
			nome,
			email,
			cpf,
			senha,
			endereco,
			telefone
		);
	}
}
