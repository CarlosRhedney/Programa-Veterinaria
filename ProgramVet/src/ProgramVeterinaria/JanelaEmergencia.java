package ProgramVeterinaria;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaEmergencia extends JFrame {

	/**
	 * @autor Carlos Rhedney
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPorte;
	private JTextField txtEspecie;
	private JTextField txtData;
	private JTextField txtHora;
	private JTextField txtDescrioDaEmergencia;

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
	public JanelaEmergencia() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
				janelaPrincipal.setVisible(true);
			}
		});
		setTitle("Emergência");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 687, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Emerg\u00EAncias");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(267, 11, 115, 26);
		contentPane.add(lblNewLabel);
		
		txtPorte = new JTextField();
		txtPorte.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtPorte.setText("Porte");
		txtPorte.setBounds(22, 60, 96, 26);
		contentPane.add(txtPorte);
		txtPorte.setColumns(10);
		
		txtEspecie = new JTextField();
		txtEspecie.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtEspecie.setText("Especie");
		txtEspecie.setBounds(199, 60, 96, 26);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtData.setText("Data");
		txtData.setBounds(22, 124, 96, 26);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		txtHora = new JTextField();
		txtHora.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtHora.setText("Hora");
		txtHora.setBounds(199, 124, 96, 26);
		contentPane.add(txtHora);
		txtHora.setColumns(10);
		
		txtDescrioDaEmergencia = new JTextField();
		txtDescrioDaEmergencia.setText("Descri\u00E7\u00E3o da emergencia");
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Baixa");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnNewRadioButton.setBounds(413, 92, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Media");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnNewRadioButton_1.setBounds(413, 118, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Alta");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnNewRadioButton_2.setBounds(413, 144, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Gravidade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(413, 69, 109, 14);
		contentPane.add(lblNewLabel_1);
	}

}