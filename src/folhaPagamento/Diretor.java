package folhaPagamento;

public class Diretor extends Funcionario {
	
	private double gratificacao;

	// Construtor
	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	// Sets
	public void setGratificacao(double gratificacao) { this.gratificacao = gratificacao; }
	
	// Outros Metodos
	public double calcularSalario () {
		return super.getSalario() + this.gratificacao;
	}

}
