package folhaPagamento;

/*
 * Esta a classe "Seguranca" é uma subclasse da superclasse "Funcionario" porque, como o segurança trabalha
 * em horário noturno, apenas ele tem um percentual fixo aplicado sobre o salário (constante "ADICIONALNOTURNO")
 */

public class Seguranca extends Funcionario {

	final double ADICIONALNOTURNO;
	
	// Construtor
	public Seguranca(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.ADICIONALNOTURNO = 12.5;
	}
	
	@Override
	public double calcularSalario () {
		return super.getSalario() + ((super.getSalario() * this.ADICIONALNOTURNO) / 100);
	}
}
