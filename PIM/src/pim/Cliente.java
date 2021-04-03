package pim;

public class Cliente {
	private String nome;
	private String email;
	private String senha;
	private double saldo;
	
	// Métodos Públicos
	
	public void editarDados(String editNome, String editEmail, String editSenha) {
		this.setNome(editNome);
		this.setEmail(editEmail);
		this.setSenha(editSenha);
	}
	
	public double verSaldo() {
		return this.saldo;
	}
	
	public void depositarSaldo(double deposito) {
		this.setSaldo(this.getSaldo() + saldo);
	}
	
	public void sacarSaldo(double saque) {
		this.setSaldo(this.getSaldo() - saque);
	}
	
	// Métodos Especiais
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
