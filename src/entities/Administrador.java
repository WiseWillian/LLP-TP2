package entities;

import model.SessionHandler;

public class Administrador extends Pessoa {
	public Administrador() {
		super();
	}
	
	public Administrador(
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
	
	@Override
	public void criarPessoa(
		String username,
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
					username,
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
					username,
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
					username,
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
