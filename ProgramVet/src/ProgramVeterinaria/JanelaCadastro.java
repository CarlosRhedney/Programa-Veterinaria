package ProgramVeterinaria;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JanelaCadastro extends JFrame {

	/**
	 * @autor Carlos Rhedney
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTextField txtRua;
	private JTextField txtCep;
	private JTextField txtN;
	private JButton btnNewButton;
	private JButton btnAlterar;
	private JButton btnConsultar;
	private JButton btnExcluir;
	private JMenu mnSexo;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnNoDizer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frame = new JanelaCadastro();
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
	public JanelaCadastro() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
				janelaPrincipal.setVisible(true);
			}
		});
		setTitle("Cadastro Usuário");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 710, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Entrada campo Nome
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtNome.setText("Nome");
		txtNome.setBounds(27, 55, 360, 31);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		//Entrada campo CPF
		txtCpf = new JTextField();
		txtCpf.setText("CPF");
		txtCpf.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtCpf.setColumns(10);
		txtCpf.setBounds(27, 107, 360, 31);
		contentPane.add(txtCpf);
		
		//Entrada campo Telefone
		txtTelefone = new JTextField();
		txtTelefone.setText("Telefone");
		txtTelefone.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(27, 156, 360, 31);
		contentPane.add(txtTelefone);
		
		//Entrada campo Rua
		txtRua = new JTextField();
		txtRua.setText("Rua");
		txtRua.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtRua.setColumns(10);
		txtRua.setBounds(27, 198, 360, 31);
		contentPane.add(txtRua);
		
		//Entrada campo Cep
		txtCep = new JTextField();
		txtCep.setText("Cep");
		txtCep.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtCep.setColumns(10);
		txtCep.setBounds(27, 240, 360, 31);
		contentPane.add(txtCep);
		
		//Entrada campo Numero
		txtN = new JTextField();
		txtN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtN.setText("N\u00BA ");
		txtN.setBounds(513, 203, 96, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		//Botao Incluir
		btnNewButton = new JButton("Incluir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(27, 356, 141, 55);
		contentPane.add(btnNewButton);
		
		//Botao Alterar
		btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAlterar.setBounds(193, 356, 141, 55);
		contentPane.add(btnAlterar);
		
		//Botao Consultar
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnConsultar.setBounds(359, 356, 141, 55);
		contentPane.add(btnConsultar);
		
		//Botao Excluir
		btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnExcluir.setBounds(525, 356, 141, 55);
		contentPane.add(btnExcluir);
		
		//Menu opcoes de Sexo
		mnSexo = new JMenu("Sexo");
		mnSexo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		mnSexo.setBounds(494, 55, 113, 26);
		contentPane.add(mnSexo);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		mnSexo.add(rdbtnMasculino);
		
		rdbtnFeminino = new JRadioButton("Feminino");
		mnSexo.add(rdbtnFeminino);
		
		rdbtnNoDizer = new JRadioButton("N\u00E3o Dizer");
		mnSexo.add(rdbtnNoDizer);
		
		JLabel lblCadastroUsurio = new JLabel("Cadastro Usu\u00E1rio");
		lblCadastroUsurio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCadastroUsurio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroUsurio.setBounds(258, 11, 176, 25);
		contentPane.add(lblCadastroUsurio);
	}
}
