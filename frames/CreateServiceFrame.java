package frames;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.SessionHandler;

import entities.Service;

public class CreateServiceFrame extends JFrame implements ActionListener {
    private JTextField serviceNameField;

    public CreateServiceFrame() {
        super("Criar serviço");

        this.serviceNameField = new JTextField();

        JLabel placeholder = new JLabel("");
        JLabel labelServiceName = new JLabel("Nome do serviço");

        JButton createServiceButton = new JButton("Criar");
    
        JPanel mainJPanel = new JPanel(new GridLayout(2,2));

        createServiceButton.addActionListener(this);

        mainJPanel.add(labelServiceName);
        mainJPanel.add(this.serviceNameField);
        mainJPanel.add(placeholder);
        mainJPanel.add(createServiceButton);

        this.setContentPane(mainJPanel);

        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		boolean overrideUser = false;
		
		SessionHandler.services.add(new Service(
            this.serviceNameField.getText(),
            false
        ));

		this.dispose();
	}
}