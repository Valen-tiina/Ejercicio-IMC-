package visual;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Persona;
import logica.Procesos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ImcGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JTextField txtNombre, txtEdad, txtTalla, txtPeso;
	JButton btnAceptar, btnLimpiar;
	JTextArea textArea;
	Procesos miProceso;

	public ImcGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		miProceso = new Procesos();
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		JLabel lblTitle = new JLabel("Calcula tu IMC");
		lblTitle.setFont(new Font("Javanese Text", Font.PLAIN, 23));
		lblTitle.setBounds(185, 28, 167, 26);
		contentPane.add(lblTitle);

		JLabel nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("Javanese Text", Font.PLAIN, 17));
		nombre.setBounds(23, 79, 72, 26);
		contentPane.add(nombre);

		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Javanese Text", Font.PLAIN, 17));
		lblEdad.setBounds(23, 127, 72, 26);
		contentPane.add(lblEdad);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Javanese Text", Font.PLAIN, 17));
		lblPeso.setBounds(292, 79, 72, 26);
		contentPane.add(lblPeso);

		JLabel lblTalla = new JLabel("Talla:");
		lblTalla.setFont(new Font("Javanese Text", Font.PLAIN, 17));
		lblTalla.setBounds(292, 127, 72, 26);
		contentPane.add(lblTalla);

		txtNombre = new JTextField();
		txtNombre.setBounds(105, 78, 161, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(105, 126, 161, 26);
		contentPane.add(txtEdad);

		txtTalla = new JTextField();
		txtTalla.setColumns(10);
		txtTalla.setBounds(345, 126, 161, 26);
		contentPane.add(txtTalla);

		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(345, 78, 161, 26);
		contentPane.add(txtPeso);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLimpiar.setBounds(130, 173, 85, 21);
		contentPane.add(btnLimpiar);
		btnLimpiar.addActionListener(this);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAceptar.setBounds(290, 173, 85, 21);
		contentPane.add(btnAceptar);
		
		 textArea = new JTextArea();
		textArea.setBounds(23, 207, 496, 126);
		contentPane.add(textArea);
		btnAceptar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			aceptar();
		} else if (e.getSource() == btnLimpiar) {
			limpiar();
		}

	}

	private void limpiar() {

		txtNombre.setText("");
		txtEdad.setText("");
		txtPeso.setText("");
		txtTalla.setText("");
	}

	private void aceptar() {

		Persona miPersona = new Persona();
		miPersona.setNombre(txtNombre.getText());
		miPersona.setEdad(Integer.parseInt(txtEdad.getText()));
		miPersona.setPeso(Double.parseDouble(txtPeso.getText()));
		miPersona.setTalla(Double.parseDouble(txtTalla.getText()));

		String res = miProceso.registro(miPersona);
		textArea.setText(res);
		textArea.setForeground(Color.black);

	}
}
