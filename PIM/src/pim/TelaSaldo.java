package pim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaSaldo extends JFrame {

	private JPanel contentPane;
	private JTextField txtSaldo;
	private static String nomeUser;
	private static double saldoUser;
	private static String senhaUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSaldo frame = new TelaSaldo(saldoUser, nomeUser, senhaUser);
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
	public TelaSaldo(double saldo, String nome, String senha) {
		
		saldoUser = saldo;
		nomeUser = nome;
		senhaUser = senha;
		
		setTitle("SALDO DO USU\u00C1RIO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 380, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlUsuarioSeu = new JLabel("Ol\u00E1, " + nomeUser + "!");
		lblOlUsuarioSeu.setForeground(Color.CYAN);
		lblOlUsuarioSeu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOlUsuarioSeu.setBounds(21, 24, 172, 22);
		contentPane.add(lblOlUsuarioSeu);
		
		JLabel lblR = new JLabel("Seu saldo \u00E9 R$");
		lblR.setForeground(Color.WHITE);
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblR.setBounds(21, 68, 100, 14);
		contentPane.add(lblR);
		
		txtSaldo = new JTextField();
		txtSaldo.setText(String.valueOf(saldoUser));
		txtSaldo.setEditable(false);
		txtSaldo.setBounds(115, 66, 136, 20);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JLabel lblGostariaDeDepositar = new JLabel("Gostaria de depositar ou sacar um valor?");
		lblGostariaDeDepositar.setForeground(Color.WHITE);
		lblGostariaDeDepositar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGostariaDeDepositar.setBounds(39, 111, 290, 14);
		contentPane.add(lblGostariaDeDepositar);
		
		JButton btnDepsito = new JButton("Dep\u00F3sito");
		btnDepsito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaDeposito().setVisible(true);
				
			}
		});
		btnDepsito.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDepsito.setBounds(75, 151, 89, 30);
		contentPane.add(btnDepsito);
		
		JButton btnSaque = new JButton("Saque");
		btnSaque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaSaque(saldoUser, senhaUser).setVisible(true);
				
			}
		});
		btnSaque.setBounds(190, 152, 89, 30);
		contentPane.add(btnSaque);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo10.jpg"));
		label.setBounds(0, 0, 364, 242);
		contentPane.add(label);
	}

}
