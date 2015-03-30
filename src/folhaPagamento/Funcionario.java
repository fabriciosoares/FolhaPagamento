package folhaPagamento;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	// Construtor
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	// Gets
	public String getNome() { return this.nome; }
	public String getCPF() { return this.cpf; }
	public double getSalario() { return this.salario; }
	
	// Sets
	public void setNome(String nome) { this.nome = nome; }
	public void setCPF(String cpf) { this.cpf = cpf; }
	public void setSalario(double salario) { this.salario = salario; }
	
	// Outros Metodos
	public double calcularSalario () {
		return this.salario;
	}
}