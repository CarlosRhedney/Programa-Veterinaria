package ProgramVeterinaria;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {

	/**
	 * @autor Carlos Rhedney
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				JanelaLogin janelaLogin = new JanelaLogin();
				janelaLogin.setVisible(true);
			}
		});
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel labelCapa = new JLabel("");
		labelCapa.setFont(new Font("DFKai-SB", Font.BOLD | Font.ITALIC, 18));
		labelCapa.setBackground(new Color(255, 255, 255));
		labelCapa.setHorizontalAlignment(SwingConstants.CENTER);
		labelCapa.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/ProgramVeterinaria/img/Capa2.jpg")));
		labelCapa.setBounds(0, 52, 694, 380);
		contentPane.add(labelCapa);
		
		//menu com os botoes
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 684, 40);
		contentPane.add(menuBar);
		// botao cadastro
		JButton btnCadastrar = new JButton("Cadastro");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JanelaCadastro frame = new JanelaCadastro();
				frame.setVisible(true);
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		menuBar.add(btnCadastrar);
		
		JButton btnCadastroanimal = new JButton("CadastroAnimal");
		btnCadastroanimal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JanelaCadastroAnimal frame = new JanelaCadastroAnimal();
				frame.setVisible(true);
			}
		});
		btnCadastroanimal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		menuBar.add(btnCadastroanimal);
		
		// botao emergencia
		JButton btnEmergncia = new JButton("Emerg\u00EAncia");
		btnEmergncia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JanelaEmergencia frame = new JanelaEmergencia();
				frame.setVisible(true);
			}
		});
		btnEmergncia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		menuBar.add(btnEmergncia);
		
		// botao consultas
		JButton btnNewButton = new JButton("Consultas");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JanelaConsultas frame = new JanelaConsultas();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		menuBar.add(btnNewButton);
		
		// botao sobre
		JButton btnNewButton_1 = new JButton("Sobre");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JanelaSobre frame = new JanelaSobre();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		menuBar.add(btnNewButton_1);
	}
}
