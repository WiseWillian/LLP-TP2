package frames;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.SessionHandler;

import entities.Pessoa;

public class CreatePersonFrame extends JFrame implements ActionListener {
	
	private String[] tiposUsuario = { "Cliente", "Profissional", "Administrador" };
	private JTextField campoUsername;
	private JTextField campoNome;
	private JTextField campoEmail;
	private JTextField campoCpf;
	private JTextField campoSenha;
	private JTextField campoEndereco;
	private JTextField campoTelefone;
	private JComboBox<String> campoTipo;
	
	public CreatePersonFrame() {
		super("Criar usuário");
		
		this.campoUsername = new JTextField();
		this.campoNome = new JTextField();
		this.campoEmail = new JTextField();
		this.campoCpf = new JTextField();
		this.campoSenha = new JTextField();
		this.campoEndereco = new JTextField();
		this.campoTelefone = new JTextField();
		this.campoTipo = new JComboBox<String>(this.tiposUsuario);
		
		JLabel labelUsername = new JLabel("Nome de usuário: ");
		JLabel labelNome = new JLabel("Nome: ");
		JLabel labelEmail = new JLabel("Email: ");
		JLabel labelCpf = new JLabel("CPF: ");
		JLabel labelSenha = new JLabel("Senha: ");
		JLabel labelEndereco = new JLabel("Endereco: ");
		JLabel labelTelefone = new JLabel("Telefone: ");
		JLabel labelTipo = new JLabel("Tipo: ");
		
		JButton botaoCriarUsuario = new JButton("Criar");
		
		JPanel jPanelPrincipal = new JPanel(new GridLayout(9,2));
		
		campoTipo.setSelectedItem(0);
		
		botaoCriarUsuario.addActionListener(this);
		
		jPanelPrincipal.add(labelUsername);
		jPanelPrincipal.add(this.campoUsername);
		jPanelPrincipal.add(labelNome);
		jPanelPrincipal.add(this.campoNome);
		jPanelPrincipal.add(labelEmail);
		jPanelPrincipal.add(this.campoEmail);
		jPanelPrincipal.add(labelCpf);
		jPanelPrincipal.add(this.campoCpf);
		jPanelPrincipal.add(labelSenha);
		jPanelPrincipal.add(this.campoSenha);
		jPanelPrincipal.add(labelEndereco);
		jPanelPrincipal.add(this.campoEndereco);
		jPanelPrincipal.add(labelTelefone);
		jPanelPrincipal.add(this.campoTelefone);
		jPanelPrincipal.add(labelTipo);
		jPanelPrincipal.add(this.campoTipo);
		jPanelPrincipal.add(new JLabel()); //Placeholder
		jPanelPrincipal.add(botaoCriarUsuario);
		
		this.setContentPane(jPanelPrincipal);
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean overrideUser = false;
		
		if(SessionHandler.usuarioAtual == null) {
			SessionHandler.usuarioAtual = new Pessoa();
			overrideUser = true;
		}

		SessionHandler.usuarioAtual.criarPessoa(
			this.campoUsername.getText(),
			this.campoNome.getText(),
			this.campoEmail.getText(),
			this.campoCpf.getText(),
			this.campoSenha.getText(),
			this.campoEndereco.getText(),
			this.campoTelefone.getText(),
			this.tiposUsuario[this.campoTipo.getSelectedIndex()]
		);

		if(overrideUser)
			SessionHandler.usuarioAtual = null;

		this.dispose();
	}
}
