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

public class TelaSaque extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroConta;
	private JTextField txtValor;
	private JTextField txtSenha;
	private static double saldoUser;
	private static String senhaUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSaque frame = new TelaSaque(saldoUser, senhaUser);
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
	public TelaSaque(double saldo, String senha) {
		
		saldoUser = saldo;
		senhaUser = senha;
		
		setTitle("SAQUE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 315, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreenchaOsCampos = new JLabel("Preencha os campos abaixo:");
		lblPreenchaOsCampos.setForeground(Color.ORANGE);
		lblPreenchaOsCampos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPreenchaOsCampos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreenchaOsCampos.setBounds(30, 23, 239, 23);
		contentPane.add(lblPreenchaOsCampos);
		
		JLabel lblNmeroDaCon = new JLabel("N\u00FAmero da conta:");
		lblNmeroDaCon.setForeground(Color.WHITE);
		lblNmeroDaCon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNmeroDaCon.setBounds(10, 57, 145, 14);
		contentPane.add(lblNmeroDaCon);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setColumns(10);
		txtNumeroConta.setBounds(10, 75, 259, 20);
		contentPane.add(txtNumeroConta);
		
		JLabel lblValor = new JLabel("Valor: R$");
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor.setBounds(10, 115, 63, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(68, 113, 133, 20);
		contentPane.add(txtValor);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Double.parseDouble(txtValor.getText()) > 0 && Double.parseDouble(txtValor.getText()) <= saldoUser) {
					if (txtSenha.getText().equals(senhaUser)) {
						JOptionPane.showMessageDialog(null, "Transação aprovada! (Saque)");
					}
					else {
						JOptionPane.showMessageDialog(null, "Senha incorreta!");
					}
				}
				else if (Double.parseDouble(txtValor.getText()) > saldoUser) {
					JOptionPane.showMessageDialog(null, "Valor insuficiente!");
				}
				else if (Double.parseDouble(txtValor.getText()) <= 0) {
					JOptionPane.showMessageDialog(null, "Valor inválido!");
				}
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConfirmar.setBounds(93, 202, 113, 29);
		contentPane.add(btnConfirmar);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(10, 155, 63, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(55, 153, 214, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo9.jpg"));
		label.setBounds(0, 0, 299, 242);
		contentPane.add(label);
	}

}
