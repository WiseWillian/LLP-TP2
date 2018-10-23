package entities;

import model.SessionHandler;

public class Administrador extends Pessoa {
	public Administrador() {
		super();
	}
	
	public Administrador(
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
	
	@Override
	public void criarPessoa(
		String nome,
		String email,
		String cpf,
		String senha,
		String endereco,
		String telefone,
		String tipo
	) {
		switch(tipo) {
			case "Cliente":
				Cliente cliente = new Cliente(
					nome,
					email,
					cpf,
					senha,
					endereco,
					telefone
				);
				SessionHandler.usuarios.add(cliente);
				break;
			case "Profissional":
				Profissional profissional = new Profissional(
					nome,
					email,
					cpf,
					senha,
					endereco,
					telefone
				);
				SessionHandler.usuarios.add(profissional);
				break;
			case "Administrador":
				Administrador administrador = new Administrador(
					nome,
					email,
					cpf,
					senha,
					endereco,
					telefone
				);
				SessionHandler.usuarios.add(administrador);
				break;
		}
	}
}
