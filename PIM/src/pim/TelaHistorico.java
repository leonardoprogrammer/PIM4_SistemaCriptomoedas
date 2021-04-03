package pim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaHistorico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHistorico frame = new TelaHistorico();
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
	public TelaHistorico() {
		setTitle("HIST\u00D3RICO DE OPERA\u00C7\u00D5ES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 375, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConfiraAquiSeu = new JLabel("Confira aqui seu hist\u00F3rico de opera\u00E7\u00F5es:");
		lblConfiraAquiSeu.setForeground(Color.ORANGE);
		lblConfiraAquiSeu.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfiraAquiSeu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConfiraAquiSeu.setBounds(35, 11, 278, 21);
		contentPane.add(lblConfiraAquiSeu);
		
		JTextArea txtrCompra = new JTextArea();
		txtrCompra.setEditable(false);
		txtrCompra.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrCompra.setText("[00/00/0000] - Venda (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Venda (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Venda (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Venda (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Venda (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Compra (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Compra (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Compra (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Compra (Bitcoin) - R$ 00,00\r\n[00/00/0000] - Compra (Bitcoin) - R$ 00,00");
		txtrCompra.setBounds(20, 41, 314, 190);
		contentPane.add(txtrCompra);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo6.jpg"));
		label.setBounds(0, 0, 359, 242);
		contentPane.add(label);
	}
}
