package pim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.List;
import java.awt.Scrollbar;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaCompra extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorDaMoeda;
	private JTextField txtValorAComprar;
	private JTextField txtPorcentagem;
	private static double valorBitcoin;
	private double porcentagem;
	private double valorB;
	private double calcPorcentagem;
	private static double saldoUser;
	private double valorCompra;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompra frame = new TelaCompra(valorBitcoin, saldoUser);
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
	public TelaCompra(double valorBIT, double saldo) {
		
		valorBitcoin = valorBIT;
		saldoUser = saldo;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("COMPRA DE MOEDA");
		setBounds(100, 100, 375, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblComprarMoeda = new JLabel("Preencha os campos abaixo para comprar:");
		lblComprarMoeda.setForeground(Color.WHITE);
		lblComprarMoeda.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprarMoeda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblComprarMoeda.setBounds(21, 22, 317, 25);
		contentPane.add(lblComprarMoeda);
		
		JLabel lblValorDaMoeda = new JLabel("Valor da moeda: R$");
		lblValorDaMoeda.setForeground(Color.WHITE);
		lblValorDaMoeda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorDaMoeda.setBounds(34, 102, 118, 14);
		contentPane.add(lblValorDaMoeda);
		
		JLabel lblCriptomoeda = new JLabel("Criptomoeda");
		lblCriptomoeda.setForeground(Color.WHITE);
		lblCriptomoeda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCriptomoeda.setBounds(34, 76, 86, 20);
		contentPane.add(lblCriptomoeda);
		
		txtValorDaMoeda = new JTextField();
		txtValorDaMoeda.setText(String.valueOf(valorBitcoin));
		txtValorDaMoeda.setEditable(false);
		txtValorDaMoeda.setBounds(146, 100, 103, 20);
		contentPane.add(txtValorDaMoeda);
		txtValorDaMoeda.setColumns(10);
		
		JLabel lblValorAComprar = new JLabel("Valor a comprar: R$");
		lblValorAComprar.setForeground(Color.WHITE);
		lblValorAComprar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorAComprar.setBounds(34, 145, 137, 20);
		contentPane.add(lblValorAComprar);
		
		txtValorAComprar = new JTextField();
		txtValorAComprar.setBounds(163, 146, 118, 20);
		contentPane.add(txtValorAComprar);
		txtValorAComprar.setColumns(10);
		
		JLabel lblPorcentagem = new JLabel("Porcentagem:");
		lblPorcentagem.setForeground(Color.WHITE);
		lblPorcentagem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPorcentagem.setBounds(34, 168, 86, 20);
		contentPane.add(lblPorcentagem);
		
		txtPorcentagem = new JTextField();
		txtPorcentagem.setEditable(false);
		txtPorcentagem.setBounds(118, 169, 163, 20);
		contentPane.add(txtPorcentagem);
		txtPorcentagem.setColumns(10);
		
		JButton btnComprar = new JButton("Confirmar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valorCompra = Double.parseDouble(txtValorAComprar.getText());
				
				if (saldoUser >= valorCompra) {
					JOptionPane.showMessageDialog(null, "Transação aprovada! (Compra)");
				}
				else if (saldoUser < valorCompra) {
					JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
				}
				
			}
		});
		btnComprar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnComprar.setBounds(128, 214, 103, 25);
		contentPane.add(btnComprar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bitcoin"}));
		comboBox.setBounds(112, 76, 137, 20);
		contentPane.add(comboBox);
		
		JButton btnAtualizar = new JButton("%");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valorB = Double.parseDouble(txtValorAComprar.getText());
				calcPorcentagem = (valorB / valorBitcoin) * 100;
				txtPorcentagem.setText(String.valueOf(calcPorcentagem));
				
			}
		});
		btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAtualizar.setBounds(291, 152, 58, 30);
		contentPane.add(btnAtualizar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo8.jpg"));
		label.setBounds(0, 0, 359, 262);
		contentPane.add(label);
	}
}
