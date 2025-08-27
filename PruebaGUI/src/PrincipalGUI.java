import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PrincipalGUI {

	private JFrame ventanita;
	private JTextField txtUsuario;
	private JLabel lblPass;
	private JButton btnLogin;
	private JTextField txtPass;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PrincipalGUI window = new PrincipalGUI();
		window.ventanita.setVisible(true);		
	}

	/**
	 * Create the application.
	 */
	public PrincipalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Listener sapo = new Listener();
		ventanita = new JFrame();
		ventanita.setBounds(100, 100, 450, 300);
		ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanita.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblUsuario = new JLabel("Nombre de usuario:");
		ventanita.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		ventanita.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblPass = new JLabel("Contraseña:");
		ventanita.getContentPane().add(lblPass);
		
		txtPass = new JTextField();
		ventanita.getContentPane().add(txtPass);
		txtPass.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(sapo);
		ventanita.getContentPane().add(btnLogin);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(sapo);
		ventanita.getContentPane().add(btnCancel);
	}

	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btnLogin) {
				String usuario = txtUsuario.getText();
				System.out.println("Presioné el Login, Tu usuario es: "+usuario);
				btnLogin.setEnabled(false);
			}
			if (e.getSource() == btnCancel) {
				System.out.println("Presioné Cancel");
			}
		}
		
	}
}
