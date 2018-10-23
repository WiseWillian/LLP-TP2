package model;

import java.util.ArrayList;

import entities.Administrador;
import entities.Pessoa;

public class SessionHandler {
	public static Pessoa usuarioAtual = new Administrador();
	public static ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();
}
