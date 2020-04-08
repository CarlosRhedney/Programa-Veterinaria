package ProgramVeterinaria;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JanelaConsultas extends JFrame {

	/**
	 * @autor Carlos Rhedney
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPorte;
	private JTextField txtEspecie;
	private JTextField txtData;
	private JTextField txtDescrioDaEmergencia;
	private JTextField txtHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaEmergencia frame = new JanelaEmergencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaConsultas() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
				janelaPrincipal.setVisible(true);
			}
		});
		setTitle("Consultas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 687, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nova Consulta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(258, 11, 115, 26);
		contentPane.add(lblNewLabel);
		
		txtPorte = new JTextField();
		txtPorte.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtPorte.setText("Nome do Animal");
		txtPorte.setBounds(22, 60, 96, 26);
		contentPane.add(txtPorte);
		txtPorte.setColumns(10);
		
		txtEspecie = new JTextField();
		txtEspecie.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtEspecie.setText("Data");
		txtEspecie.setBounds(199, 60, 96, 26);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtData.setText("Dr(a)");
		txtData.setBounds(22, 124, 96, 26);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		txtDescrioDaEmergencia = new JTextField();
		txtDescrioDaEmergencia.setText("Descri\u00E7\u00E3o da Consulta");
		txtDescrioDaEmergencia.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtDescrioDaEmergencia.setBounds(22, 182, 246, 80);
		contentPane.add(txtDescrioDaEmergencia);
		txtDescrioDaEmergencia.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(81, 285, 89, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(264, 285, 89, 41);
		contentPane.add(btnNewButton_1);
		
		txtHora = new JTextField();
		txtHora.setText("Hora");
		txtHora.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtHora.setColumns(10);
		txtHora.setBounds(362, 63, 96, 26);
		contentPane.add(txtHora);
	}
}