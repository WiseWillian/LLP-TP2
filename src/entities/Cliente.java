package entities;

public class Cliente extends Pessoa {
	public Cliente() {
		super();
	}
	
	public Cliente(
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
