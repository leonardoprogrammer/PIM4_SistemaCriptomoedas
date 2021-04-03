package pim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaDeposito extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroCartao;
	private JTextField txtCodigo;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeposito frame = new TelaDeposito();
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
	public TelaDeposito() {
		setTitle("DEP\u00D3SITO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 315, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreenchaOsCampos = new JLabel("Preencha os campos abaixo:");
		lblPreenchaOsCampos.setForeground(Color.WHITE);
		lblPreenchaOsCampos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreenchaOsCampos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPreenchaOsCampos.setBounds(30, 23, 239, 23);
		contentPane.add(lblPreenchaOsCampos);
		
		JLabel lblNmeroDoCarto = new JLabel("N\u00FAmero do cart\u00E3o:");
		lblNmeroDoCarto.setForeground(Color.WHITE);
		lblNmeroDoCarto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNmeroDoCarto.setBounds(10, 57, 145, 14);
		contentPane.add(lblNmeroDoCarto);
		
		txtNumeroCartao = new JTextField();
		txtNumeroCartao.setBounds(10, 75, 259, 20);
		contentPane.add(txtNumeroCartao);
		txtNumeroCartao.setColumns(10);
		
		JLabel lblCdigoDeSegurana = new JLabel("C\u00F3digo de seguran\u00E7a:");
		lblCdigoDeSegurana.setForeground(Color.WHITE);
		lblCdigoDeSegurana.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCdigoDeSegurana.setBounds(10, 106, 145, 14);
		contentPane.add(lblCdigoDeSegurana);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(10, 124, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor: R$");
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor.setBounds(10, 160, 63, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(68, 158, 133, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Double.parseDouble(txtValor.getText()) <= 0) {
					JOptionPane.showMessageDialog(null, "Insira um valor válido!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Transação aprovada! (Depósito)");
				}
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConfirmar.setBounds(93, 202, 113, 29);
		contentPane.add(btnConfirmar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo9.jpg"));
		label.setBounds(0, 0, 299, 242);
		contentPane.add(label);
	}

}
