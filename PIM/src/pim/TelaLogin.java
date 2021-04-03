package pim;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(76, 110, 223, 20);
		contentPane.add(passwordField);
		
		JLabel lblFacaSeuLogin = new JLabel("Bem-vindo(a)! Fa\u00E7a seu login:");
		lblFacaSeuLogin.setForeground(Color.WHITE);
		lblFacaSeuLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFacaSeuLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacaSeuLogin.setBounds(87, 11, 198, 25);
		contentPane.add(lblFacaSeuLogin);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(20, 68, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(76, 66, 223, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(20, 112, 46, 14);
		contentPane.add(lblSenha);
		
		JButton btnCadastrarse = new JButton("Cadastrar-se");
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaCadastro().setVisible(true);
				
			}
		});
		btnCadastrarse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrarse.setBounds(80, 162, 104, 25);
		contentPane.add(btnCadastrarse);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (checkLogin(txtEmail.getText(), new String(passwordField.getPassword()))) {
					new PainelPrincipal().setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados incorretos!");
				}
				
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEntrar.setBounds(194, 162, 104, 24);
		contentPane.add(btnEntrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo4.jpg"));
		label.setBounds(0, 0, 359, 212);
		contentPane.add(label);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("aluno@outlook.com") && senha.equals("aluno010101");
	}
}
