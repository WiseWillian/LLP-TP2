package entities;

public class Cliente extends Pessoa {
	public Cliente() {
		super();
	}
	
	public Cliente(
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
