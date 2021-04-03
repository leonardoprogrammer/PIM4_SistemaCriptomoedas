package pim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaAlteraDados extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeUser;
	private JTextField txtEmailUser;
	private JButton btnConfirmar;
	private JLabel lblSenha;
	private JTextField txtSenhaUser;
	private static String nomeUser;
	private static String emailUser;
	private static String senhaUser;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlteraDados frame = new TelaAlteraDados(nomeUser, emailUser, senhaUser);
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
	public TelaAlteraDados(String nome, String email, String senha) {
		
		nomeUser = nome;
		emailUser = email;
		senhaUser = senha;
		
		setTitle("DADOS DO USU\u00C1RIO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 375, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(36, 23, 46, 14);
		contentPane.add(lblNome);
		
		txtNomeUser = new JTextField();
		txtNomeUser.setText(nomeUser);
		txtNomeUser.setEditable(false);
		txtNomeUser.setBounds(36, 40, 274, 20);
		contentPane.add(txtNomeUser);
		txtNomeUser.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(36, 76, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmailUser = new JTextField();
		txtEmailUser.setText(emailUser);
		txtEmailUser.setEditable(false);
		txtEmailUser.setBounds(36, 99, 274, 20);
		contentPane.add(txtEmailUser);
		txtEmailUser.setColumns(10);
		
		JButton btnAlterarDados = new JButton("Alterar dados");
		btnAlterarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btnConfirmar.setEnabled(true);
				txtNomeUser.setEditable(true);
				txtEmailUser.setEditable(true);
				lblSenha.setEnabled(true);
				txtSenhaUser.setEnabled(true);
				txtSenhaUser.setEditable(true);
				
				
			}
		});
		btnAlterarDados.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterarDados.setBounds(36, 194, 121, 23);
		contentPane.add(btnAlterarDados);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
				
			}
		});
		btnConfirmar.setEnabled(false);
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConfirmar.setBounds(189, 194, 121, 23);
		contentPane.add(btnConfirmar);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setEnabled(false);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(36, 130, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenhaUser = new JTextField();
		txtSenhaUser.setEditable(false);
		txtSenhaUser.setEnabled(false);
		txtSenhaUser.setBounds(36, 150, 274, 20);
		contentPane.add(txtSenhaUser);
		txtSenhaUser.setColumns(10);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo7.jpg"));
		label.setBounds(0, 0, 359, 242);
		contentPane.add(label);
	}
}
