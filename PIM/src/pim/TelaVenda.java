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
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantidade;
	private JTextField txtValorVenda;
	private JTextField txtQuantidadePossui;
	private static double qtdPossui;
	private double qtdAVender;
	private double porcentagem;
	private static double valorBitcoin;
	private JTextField txtValorDaMoeda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVenda frame = new TelaVenda(valorBitcoin, qtdPossui);
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
	public TelaVenda(double valorBIT, double qtdUser) {
		
		valorBitcoin = valorBIT;
		qtdPossui = qtdUser;
		
		setTitle("VENDA DE MOEDA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 375, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreenchaOsCampos = new JLabel("Preencha os campos abaixo para vender:");
		lblPreenchaOsCampos.setForeground(Color.ORANGE);
		lblPreenchaOsCampos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreenchaOsCampos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPreenchaOsCampos.setBounds(29, 22, 301, 24);
		contentPane.add(lblPreenchaOsCampos);
		
		JLabel lblCriptomoeda = new JLabel("Criptomoeda");
		lblCriptomoeda.setForeground(Color.WHITE);
		lblCriptomoeda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCriptomoeda.setBounds(35, 55, 84, 24);
		contentPane.add(lblCriptomoeda);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bitcoin"}));
		comboBox.setBounds(112, 58, 137, 20);
		contentPane.add(comboBox);
		
		JLabel lblQuantidadeASer = new JLabel("Quantidade a vender: R$");
		lblQuantidadeASer.setForeground(Color.WHITE);
		lblQuantidadeASer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantidadeASer.setBounds(29, 150, 163, 20);
		contentPane.add(lblQuantidadeASer);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setToolTipText("");
		txtQuantidade.setBounds(175, 150, 155, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblValorCorrespondente = new JLabel("Porcentagem:");
		lblValorCorrespondente.setForeground(Color.WHITE);
		lblValorCorrespondente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorCorrespondente.setBounds(29, 180, 90, 20);
		contentPane.add(lblValorCorrespondente);
		
		txtValorVenda = new JTextField();
		txtValorVenda.setEditable(false);
		txtValorVenda.setBounds(112, 180, 163, 20);
		contentPane.add(txtValorVenda);
		txtValorVenda.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				qtdAVender = Double.parseDouble(txtQuantidade.getText());
				
				if (qtdAVender == 0 || qtdAVender < 0) {
					JOptionPane.showMessageDialog(null, "Digite um valor válido!");
				}
				else if (qtdAVender <= qtdPossui) {
					
					JOptionPane.showMessageDialog(null, "Transação aprovada! (Venda)");
				}
				else if (qtdAVender > qtdPossui) {
					JOptionPane.showMessageDialog(null, "Você não possui esse valor!");
				}
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmar.setBounds(128, 214, 103, 25);
		contentPane.add(btnConfirmar);
		
		JLabel lblVocPossui = new JLabel("Voc\u00EA possui: R$");
		lblVocPossui.setForeground(Color.WHITE);
		lblVocPossui.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVocPossui.setBounds(29, 115, 114, 22);
		contentPane.add(lblVocPossui);
		
		txtQuantidadePossui = new JTextField();
		txtQuantidadePossui.setText(String.valueOf(qtdPossui));
		txtQuantidadePossui.setEditable(false);
		txtQuantidadePossui.setBounds(128, 117, 131, 20);
		contentPane.add(txtQuantidadePossui);
		txtQuantidadePossui.setColumns(10);
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				qtdAVender = Double.parseDouble(txtQuantidade.getText());
				porcentagem = (qtdAVender / valorBitcoin) * 100;
				txtValorVenda.setText(String.valueOf(porcentagem));
				
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(279, 177, 51, 24);
		contentPane.add(button);
		
		JLabel lblValorDaMoeda = new JLabel("Valor da moeda:");
		lblValorDaMoeda.setForeground(Color.WHITE);
		lblValorDaMoeda.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblValorDaMoeda.setBounds(29, 85, 103, 14);
		contentPane.add(lblValorDaMoeda);
		
		JLabel lblR = new JLabel("R$");
		lblR.setForeground(Color.WHITE);
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblR.setBounds(128, 85, 28, 14);
		contentPane.add(lblR);
		
		txtValorDaMoeda = new JTextField();
		txtValorDaMoeda.setEditable(false);
		txtValorDaMoeda.setText(String.valueOf(valorBitcoin));
		txtValorDaMoeda.setBounds(145, 83, 114, 20);
		contentPane.add(txtValorDaMoeda);
		txtValorDaMoeda.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo8.jpg"));
		label.setBounds(0, 0, 359, 262);
		contentPane.add(label);
	}
}
