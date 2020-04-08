package ProgramVeterinaria;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JanelaLogin extends JFrame {

	/**
	 * @autor Carlos Rhedney
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblSenha;
	private JPasswordField pwdSenha;
	private String usuario = "usuario", key = "12345";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaLogin frame = new JanelaLogin();
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
	private void login() {
		// Verificando se o usuario ea senha digitada é a mesma estabelecida
		if(usuario.equals(textField.getText()) && key.equals(new String(pwdSenha.getPassword()))) {
			JanelaPrincipal JanelaPrincipal = new JanelaPrincipal();
			JanelaPrincipal.setVisible(true);
			this.dispose();
		}else {
			JOptionPane.showMessageDialog(null, "Usuário e ou senha inválido(s)!");
		}
	}
	public JanelaLogin() {
		setResizable(false);
		// Janela de Login
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(JanelaLogin.class.getResource("/ProgramVeterinaria/img/Capa.png")));
		label.setBounds(99, 0, 424, 86);
		contentPane.add(label);
		// Campo de inserção  de nome
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		textField.setBounds(209, 164, 242, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		// Imagem e descrição "NOME"
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setIcon(new ImageIcon(JanelaLogin.class.getResource("/ProgramVeterinaria/img/identificador.png")));
		lblUsurio.setBounds(209, 135, 89, 30);
		contentPane.add(lblUsurio);
		// Imagem e descrição "SENHA"
		lblSenha = new JLabel("Senha:");
		lblSenha.setIcon(new ImageIcon(JanelaLogin.class.getResource("/ProgramVeterinaria/img/senha.png")));
		lblSenha.setBounds(209, 205, 89, 29);
		contentPane.add(lblSenha);
		// Botão Entrar
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login();
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnEntrar.setBounds(161, 331, 137, 39);
		contentPane.add(btnEntrar);
		// Botão Sair
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnSair.setBounds(349, 331, 137, 39);
		contentPane.add(btnSair);
		// Simbolo de login na lateral esquerda
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JanelaLogin.class.getResource("/ProgramVeterinaria/img/login.png")));
		lblNewLabel.setBounds(10, 112, 137, 205);
		contentPane.add(lblNewLabel);
		// Campo de inserçao de senha
		pwdSenha = new JPasswordField();
		pwdSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		pwdSenha.setBounds(209, 235, 242, 30);
		contentPane.add(pwdSenha);
		// escrita no centro "Efetuar Login"
		JLabel lblEfetuarLogin = new JLabel("Efetuar Login");
		lblEfetuarLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfetuarLogin.setFont(new Font("Sakkal Majalla", Font.ITALIC, 50));
		lblEfetuarLogin.setBounds(209, 88, 242, 39);
		contentPane.add(lblEfetuarLogin);
	}
}
