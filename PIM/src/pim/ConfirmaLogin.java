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

public class ConfirmaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtSenha;
	private String senhaUser = "aluno010101";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmaLogin frame = new ConfirmaLogin();
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
	public ConfirmaLogin() {
		setTitle("VERIFICA\u00C7\u00C3O DE SENHA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteSuaSenha = new JLabel("DIGITE SUA SENHA PARA CONFIRMAR:");
		lblDigiteSuaSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDigiteSuaSenha.setBounds(24, 24, 236, 23);
		contentPane.add(lblDigiteSuaSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(24, 71, 236, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (senhaUser.equals(txtSenha.getText())) {
					JOptionPane.showMessageDialog(null, "Senha correta!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha incorreta!");
				}
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConfirmar.setBounds(84, 116, 116, 30);
		contentPane.add(btnConfirmar);
	}
}
