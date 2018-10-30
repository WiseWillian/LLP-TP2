package frames;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.SessionHandler;

public class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JTextField passwordField;
    
    public LoginFrame() {
        super("Realizar login");

        this.usernameField = new JTextField();
        this.passwordField = new JTextField();

        JLabel usernameLabel = new JLabel("Nome de usuário:");
        JLabel passwordLabel = new JLabel("Senha");

        JButton loginButton = new JButton("Logar");
        JButton registerButton = new JButton("Registrar");

        JPanel mainJPanel = new JPanel(new GridLayout(3,2));

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);

        mainJPanel.add(usernameLabel);
        mainJPanel.add(this.usernameField);
        mainJPanel.add(passwordLabel);
        mainJPanel.add(this.passwordField);
        mainJPanel.add(registerButton);
        mainJPanel.add(loginButton);

        this.setContentPane(mainJPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 100);
        this.setVisible(true);
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
            case "Logar":
                String username = this.usernameField.getText();
                String password = this.passwordField.getText();
                boolean fallback = SessionHandler.realizeLogin(username, password);
                if(fallback) {
                    new AppFrame();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "A tentativa de login não teve sucesso, verifique as credenciais e tente novamente!");
                }
                break;
            case "Registrar":
                new CreatePersonFrame();
                break;
        }
	}
}