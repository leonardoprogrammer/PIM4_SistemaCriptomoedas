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

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setTitle("CADASTRO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 375, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacaSeuCadastro = new JLabel("Fa\u00E7a seu cadastro:");
		lblFacaSeuCadastro.setForeground(Color.WHITE);
		lblFacaSeuCadastro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFacaSeuCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacaSeuCadastro.setBounds(106, 11, 147, 23);
		contentPane.add(lblFacaSeuCadastro);
		
		JLabel lblNomeCompleto = new JLabel("Nome completo");
		lblNomeCompleto.setForeground(Color.WHITE);
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeCompleto.setBounds(20, 45, 113, 14);
		contentPane.add(lblNomeCompleto);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 63, 311, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(20, 91, 113, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(20, 107, 311, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(20, 138, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(20, 154, 311, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnFinalizarCadastro = new JButton("Finalizar cadastro");
		btnFinalizarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Cadastro finalizado!");
				
			}
		});
		btnFinalizarCadastro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFinalizarCadastro.setBounds(106, 198, 147, 29);
		contentPane.add(btnFinalizarCadastro);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Desktop\\Leonardo\\teladefundo6.jpg"));
		label.setBounds(0, 0, 359, 242);
		contentPane.add(label);
	}

}
