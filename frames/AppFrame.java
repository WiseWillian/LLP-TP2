package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import model.SessionHandler;

public class AppFrame extends JFrame implements ActionListener {
	private DefaultListModel<String> modelo;
	private JList<String> listaDeUsuarios;
	
	public AppFrame() {
		super("Gerenciador de serviços");
		
		this.modelo = new DefaultListModel<String>();
		this.listaDeUsuarios = new JList<String>(this.modelo);
		
		JMenuBar barraDeMenu = new JMenuBar();
		
		JMenu menuPessoas = new JMenu("Pessoas");
		JMenu menuServices = new JMenu("Serviços");
		
		JMenuItem itemRecarregarUsuarios = new JMenuItem("Recarregar usuários");
		JMenuItem itemCriarPessoa = new JMenuItem("Criar Pessoa");
		JMenuItem itemCreateService = new JMenuItem("Criar serviço");

		
		itemRecarregarUsuarios.addActionListener(this);
		
		itemCriarPessoa.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
			    new CreatePersonFrame();
			}
		});

		itemCreateService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateServiceFrame();
			}
		});
		
		menuPessoas.add(itemCriarPessoa);
		menuPessoas.add(itemRecarregarUsuarios);
		menuServices.add(itemCreateService);
		barraDeMenu.add(menuPessoas);
		barraDeMenu.add(menuServices);
		
		this.add(listaDeUsuarios);
		
		this.setJMenuBar(barraDeMenu);
		this.setSize(350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void refreshJlist() {
		this.modelo.removeAllElements();
        
        for(int i = 0; i < SessionHandler.usuarios.size(); i++) {
        	String description = SessionHandler.usuarios.get(i).getNome();
        	description += ", " + SessionHandler.usuarios.get(i).getCpf();
        	description += " (" + SessionHandler.usuarios.get(i).getTelefone() + ")";
        	this.modelo.addElement(description);
        }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.refreshJlist();
	}
}
