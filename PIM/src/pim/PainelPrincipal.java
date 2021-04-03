package pim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PainelPrincipal extends JFrame {

	private JPanel contentPane;
	private String nomeUsuario = "Fulano da Silva";
	private String emailUsuario = "aluno@outlook.com";
	private String senhaUsuario = "aluno010101";
	private double saldoUsuario = 5000.00;
	private double valorBitcoin = 83169.00;
	private double qtdBitUsuario = 4000.00;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelPrincipal frame = new PainelPrincipal();
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
	public PainelPrincipal() {
		setTitle("PAINEL PRINCIPAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemvindoa = new JLabel("Bem-vindo(a)!");
		lblBemvindoa.setForeground(Color.WHITE);
		lblBemvindoa.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemvindoa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBemvindoa.setBounds(155, 11, 123, 21);
		contentPane.add(lblBemvindoa);
		
		JLabel lblEscolhaUmaAcao = new JLabel("(Escolha uma a\u00E7\u00E3o)");
		lblEscolhaUmaAcao.setForeground(Color.WHITE);
		lblEscolhaUmaAcao.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaUmaAcao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEscolhaUmaAcao.setBounds(148, 33, 138, 15);
		contentPane.add(lblEscolhaUmaAcao);
		
		JButton btnRealizarCompra = new JButton("Comprar moeda");
		btnRealizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaCompra(valorBitcoin, saldoUsuario).setVisible(true);
				
			}
		});
		btnRealizarCompra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRealizarCompra.setBounds(50, 83, 144, 29);
		contentPane.add(btnRealizarCompra);
		
		JButton btnRealizarVenda = new JButton("Vender moeda");
		btnRealizarVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRealizarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaVenda(valorBitcoin, qtdBitUsuario).setVisible(true);
				
			}
		});
		btnRealizarVenda.setBounds(50, 134, 144, 29);
		contentPane.add(btnRealizarVenda);
		
		JButton btnVerSaldo = new JButton("Ver saldo");
		btnVerSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaSaldo(saldoUsuario, nomeUsuario, senhaUsuario).setVisible(true);
				
			}
		});
		btnVerSaldo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVerSaldo.setBounds(228, 83, 144, 29);
		contentPane.add(btnVerSaldo);
		
		JButton btnAlterarDados = new JButton("Alterar dados");
		btnAlterarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaAlteraDados(nomeUsuario, emailUsuario, senhaUsuario).setVisible(true);
				
			}
		});
		btnAlterarDados.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterarDados.setBounds(228, 135, 144, 29);
		contentPane.add(btnAlterarDados);
		
		JButton btnHistricoDeOperaes = new JButton("Hist\u00F3rico de opera\u00E7\u00F5es");
		btnHistricoDeOperaes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaHistorico().setVisible(true);
				
			}
		});
		btnHistricoDeOperaes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHistricoDeOperaes.setBounds(130, 187, 173, 29);
		contentPane.add(btnHistricoDeOperaes);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo5.jpg"));
		label.setBounds(0, 0, 434, 262);
		contentPane.add(label);
	}

}
