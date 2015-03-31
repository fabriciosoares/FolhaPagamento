package folhaPagamento;

public class Vendedor extends Funcionario {
	
	private double totalVenda;
	private double percentualComissao;

	// Construtor
	public Vendedor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	// Sets
	public void setPercentualComissao(double percentualComissao) { this.percentualComissao = percentualComissao; }
	
	// Outros Metodos
	public void acumulaVenda(double venda) { 
		this.totalVenda += venda;
	}
	
	@Override
	public double calcularSalario () {
		return super.getSalario() + ((this.totalVenda * percentualComissao) / 100);
	}

	public void iniciaMes() {
		this.totalVenda = 0;
	}

}
