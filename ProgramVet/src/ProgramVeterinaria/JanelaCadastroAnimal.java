package ProgramVeterinaria;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class JanelaCadastroAnimal extends JFrame {

	/**
	 * @autor Carlos Rhedney
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NomeAnimal;
	private JTextField TipoAnimal;
	private JTextField RaçaAnimal;
	private JTextField Observaçoes;
	private JTextField Porte;
	private JTextField Peso;
	private JTextField DTNascimento;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroAnimal frame = new JanelaCadastroAnimal();
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
	public JanelaCadastroAnimal() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
				janelaPrincipal.setVisible(true);
			}
		});
		setBackground(UIManager.getColor("Button.background"));
		setTitle("Cadastro Animal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 708, 442);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//titulo da pagina
		JLabel TituloPagina = new JLabel("Cadastro Animal");
		TituloPagina.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		TituloPagina.setBounds(240, 11, 135, 23);
		contentPane.add(TituloPagina);
		
		//entrada do nome do animal
		NomeAnimal = new JTextField();
		NomeAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		NomeAnimal.setText("Nome do Animal");
		NomeAnimal.setBounds(28, 45, 186, 20);
		contentPane.add(NomeAnimal);
		NomeAnimal.setColumns(10);
		
		//entrada do tipo do animal
		TipoAnimal = new JTextField();
		TipoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TipoAnimal.setText("Tipo do Animal");
		TipoAnimal.setBounds(28, 76, 186, 20);
		contentPane.add(TipoAnimal);
		TipoAnimal.setColumns(10);
		
		//entrada da raça do animal
		RaçaAnimal = new JTextField();
		RaçaAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		RaçaAnimal.setText("Ra\u00E7a do Animal");
		RaçaAnimal.setBounds(28, 107, 186, 20);
		contentPane.add(RaçaAnimal);
		RaçaAnimal.setColumns(10);
		
		//Observaçoes do animal
		Observaçoes = new JTextField();
		Observaçoes.setFont(new Font("Tahoma", Font.ITALIC, 11));
		Observaçoes.setText("Observa\u00E7\u00F5es(alergias,deficiencias...)");
		Observaçoes.setBounds(28, 164, 231, 98);
		contentPane.add(Observaçoes);
		Observaçoes.setColumns(10);
		
		//porte do animal
		Porte = new JTextField();
		Porte.setFont(new Font("Tahoma", Font.ITALIC, 11));
		Porte.setText("Porte");
		Porte.setBounds(379, 45, 96, 20);
		contentPane.add(Porte);
		Porte.setColumns(10);
		
		//peso do animal
		Peso = new JTextField();
		Peso.setText("Peso(kg)");
		Peso.setFont(new Font("Tahoma", Font.ITALIC, 11));
		Peso.setBounds(379, 76, 96, 20);
		contentPane.add(Peso);
		Peso.setColumns(10);
		
		//data de nascimento do animal
		DTNascimento = new JTextField();
		DTNascimento.setText("Data de Nascimento");
		DTNascimento.setFont(new Font("Tahoma", Font.ITALIC, 11));
		DTNascimento.setBounds(378, 107, 109, 20);
		contentPane.add(DTNascimento);
		DTNascimento.setColumns(10);
		
		//botao incluir
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(49, 298, 89, 49);
		contentPane.add(btnNewButton);
		
		//botao alterar
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(170, 298, 89, 49);
		contentPane.add(btnNewButton_1);
		
		//botaro consultar
		JButton btnNewButton_2 = new JButton("Consultar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_2.setBounds(301, 298, 89, 49);
		contentPane.add(btnNewButton_2);
		
		//botaro excluir
		JButton btnNewButton_3 = new JButton("Excluir");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_3.setBounds(429, 298, 89, 49);
		contentPane.add(btnNewButton_3);
		
		//botao seleção Macho
		JRadioButton SexoMacho = new JRadioButton("Macho");
		SexoMacho.setFont(new Font("Tahoma", Font.ITALIC, 11));
		SexoMacho.setBounds(29, 134, 109, 23);
		contentPane.add(SexoMacho);
		
		//botao seleçao Femea
		JRadioButton SexoFemea = new JRadioButton("Femea");
		SexoFemea.setFont(new Font("Tahoma", Font.ITALIC, 11));
		SexoFemea.setBounds(137, 134, 109, 23);
		contentPane.add(SexoFemea);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(JanelaCadastroAnimal.class.getResource("/ProgramVeterinaria/img/Capa3.png")));
		label.setBounds(379, 138, 166, 124);
		contentPane.add(label);
	}
}
