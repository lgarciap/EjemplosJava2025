import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUIEstudiante {

	private Anio anio;
	private int cantMateria;
	private JFrame frame;
	private JTextField txtMateria;
	private JTextField txtNota;
	private JButton btnAgregar;
	private JPanel pResultados;
	private JButton btnCalcularPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		GUIEstudiante window = new GUIEstudiante();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public GUIEstudiante() {
		initialize();
		anio = new Anio();
		this.cantMateria = 0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MiListener oyente = new MiListener();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pAsignatura = new JPanel();
		pAsignatura.setBorder(new TitledBorder(null, "Agregar Asignatura", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		frame.getContentPane().add(pAsignatura, BorderLayout.NORTH);
		
		JLabel lblMateria = new JLabel("Nombre de la Materia");
		pAsignatura.add(lblMateria);
		
		txtMateria = new JTextField();
		pAsignatura.add(txtMateria);
		txtMateria.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota:");
		pAsignatura.add(lblNota);
		
		txtNota = new JTextField();
		pAsignatura.add(txtNota);
		txtNota.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(oyente);
		pAsignatura.add(btnAgregar);
		
		pResultados = new JPanel();
		pResultados.setBorder(new TitledBorder(null, "Cálculos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 69, 0)));
		frame.getContentPane().add(pResultados, BorderLayout.CENTER);
		
		btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.addActionListener(oyente);
		pResultados.add(btnCalcularPromedio);
	}
	
	private class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btnAgregar) {
				anio.agregarMateria(txtMateria.getText(), Float.parseFloat(txtNota.getText()), cantMateria);
				JOptionPane.showMessageDialog(btnAgregar,"Agregó una materia", null, cantMateria+1, null);
				cantMateria++;
				txtMateria.setText(null);
				txtNota.setText(null);
			}
			if (e.getSource() == btnCalcularPromedio) {
				
			}
		}
		
	}

}
