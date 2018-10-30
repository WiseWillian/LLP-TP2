package model;

import java.util.ArrayList;

import entities.Administrador;
import entities.Pessoa;

public class SessionHandler {
	public static Pessoa usuarioAtual;
	public static ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();

	public static boolean realizeLogin(String username, String password) {
		for (Pessoa pessoa : usuarios) {
			if(pessoa.getUsername().equals(username) && pessoa.getSenha().equals(password)) {
				SessionHandler.usuarioAtual = pessoa;
				return true;
			}
		}
		return false;
	}

	// Funções para ler os objetos gravados em arquivo

	// Funções para escrever os objetos nos arquivos
}
