package entities;

import javax.swing.JOptionPane;

import model.SessionHandler;

public class Pessoa {
	private String nome;
	private String email;
	private String cpf;
	private String senha;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
		this.nome = "";
		this.email = "";
		this.cpf = "";
		this.senha = "";
		this.endereco = "";
		this.telefone = "";
	}
	
	public Pessoa(
		String nome,
		String email,
		String cpf,
		String senha,
		String endereco,
		String telefone
	) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
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
			default:
				JOptionPane.showMessageDialog(null, "Você não pode criar esse tipo de usuário. Peça ajuda a um administrador!");
				break;
		}
	}

	@Override
	public String toString() {
		String retorno = "{\n";
		retorno += "\t" + this.nome + "\n";
		retorno += "\t" + this.cpf + "\n";
		retorno += "\t" + this.email + "\n";
		retorno += "\t" + this.endereco + "\n";
		retorno += "\t" + this.telefone + "\n";
		retorno += "}\n";
		return retorno;
	}
	
	public void setNome(String nome) { this.nome = nome; }
	public void setEmail(String email) { this.email = email; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setSenha(String senha) { this.senha = senha; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setTelefone(String telefone) { this.telefone = telefone; }

	public String getNome() { return nome; }
	public String getEmail() { return email; }
	public String getCpf() { return cpf; }
	public String getSenha() { return senha; }
	public String getEndereco() { return endereco; }
	public String getTelefone() { return telefone; }	
}
