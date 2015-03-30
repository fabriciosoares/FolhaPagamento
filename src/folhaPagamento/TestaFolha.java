package folhaPagamento;

/*
 * (1) Considere uma aplicação de folha de pagamento que possui a relação de todos os funcionários 
 * de uma empresa. Atualmente a aplicação armazena apenas dados sobre os funcionários da empresa. 
 * Considere a classe Funcionario definida na página 2. Agora, você foi contratado para fazer uma 
 * modificação na aplicação de controle de pagamento. Agora, a empresa cresceu e possui diferentes 
 * políticas de salário para diferentes tipos de funcionário, e a folha de pagamento deve considerar 
 * os mesmos. Além dos funcionários que possuem nome, cpf e salário, a empresa tem vendedores, que 
 * possuem o total de vendas realizadas (em reais) e o percentual de comissão (um valor real), e 
 * diretores, que possuem uma gratificação fixa (em reais) sobre o salário. O cálculo do salário 
 * dos funcionários deve ser feito por um método calcularSalario, que no caso do funcionário comum 
 * apenas retorna o salario, para o vendedor retorna a soma do salário ao percentual da comissão 
 * sobre as vendas, e para o gerente retorna a soma do salário a gratificação. Além disso, o 
 * funcionário tem um método iniciaMes que zera o valor das vendas do funcionário. 
 * 
 * (2) Ao implementar a 1a versão da aplicação de folha de pagamento, os desenvolvedores não se 
 * preocuparam em tornar o código de negócio independente dos código de armazenamento de dados. 
 * Considerando a definição da classe RepositorioFuncionariosArray na página 2, implemente uma 
 * interface para a classe repositório, de modo que a classe possa ser desacoplada do 
 * CadastroFuncionarios (também na página 2). O que se espera é que a classe cadastro possa usar 
 * apenas a interface declarada, mudando apenas a declaração do atributo e seu construtor 
 * (linhas 3 e 4), sem mudar mais nenhuma das linhas.
 * 
 * (3) Implemente as classes de exceção FuncionarioNaoEncontradoException, utilizada pela classe 
 * RepositorioFuncionariosArray, e FuncionarioJaCadastradoException, utilizada pela classe 
 * CadastroFuncionarios, vide a página 2.
 * 
 * (4) Descreva um outro exemplo de subclasse para Funcionario ou Vendedor justificando por que 
 * o exemplo é de subclasse. Implemente a subclasse.
 */

public class TestaFolha {

	public static void main(String[] args) throws FuncionarioNaoEncontradoException {
		
		System.out.println();
		System.out.println("QUESTÃO 01:");
		System.out.println("===========");
		System.out.println();

		Funcionario func1 = new Funcionario("Paulo Victor", "11111", 1000);
		Funcionario func2 = new Vendedor("Pará", "22222", 1200);
		Funcionario func3 = new Diretor("Wallace", "33333", 2500);
		
		((Vendedor) func2).iniciaMes();
		((Vendedor) func2).acumulaVenda(200);
		((Vendedor) func2).acumulaVenda(300);
		((Vendedor) func2).acumulaVenda(500);
		((Vendedor) func2).setPercentualComissao(2);
		
		((Diretor) func3).setGratificacao(800);
		
		System.out.println();
		System.out.println("- JANEIRO:");
		System.out.println();
		System.out.print("- " + func1.getNome() + ": R$ ");
		System.out.printf("%.2f", func1.calcularSalario());
		System.out.println();
		System.out.print("- " + func2.getNome() + ": R$ ");
		System.out.printf("%.2f", func2.calcularSalario());
		System.out.println();
		System.out.print("- " + func3.getNome() + ": R$ ");
		System.out.printf("%.2f", func3.calcularSalario());
		System.out.println();
		
		((Vendedor) func2).iniciaMes();
		((Vendedor) func2).acumulaVenda(200);
		((Vendedor) func2).acumulaVenda(200);
		((Vendedor) func2).setPercentualComissao(1.5);
		
		((Diretor) func3).setGratificacao(600);
		
		System.out.println();
		System.out.println("- FEVEREIRO:");
		System.out.println();
		System.out.print("- " + func1.getNome() + ": R$ ");
		System.out.printf("%.2f", func1.calcularSalario());
		System.out.println();
		System.out.print("- " + func2.getNome() + ": R$ ");
		System.out.printf("%.2f", func2.calcularSalario());
		System.out.println();
		System.out.print("- " + func3.getNome() + ": R$ ");
		System.out.printf("%.2f", func3.calcularSalario());
		System.out.println();
		
		// ================================================================================
		
		System.out.println();
		System.out.println("QUESTÃO 02:");
		System.out.println("===========");
		System.out.println();

		Repositorio rep1 = new RepositorioFuncionariosArray(10);
		
		CadastroFuncionarios cadastro = new CadastroFuncionarios(rep1);
		
		rep1.inserir(func1);
		Funcionario func4 = new Funcionario("Samir", "44444", 1000);
		Funcionario func5 = new Funcionario("Cáceres", "55555", 1000);
		rep1.inserir(func4);
		rep1.inserir(func5);
		
		System.out.println(" - Funcionário Procurado: " + cadastro.procurar("55555").getNome());
		
		rep1.inserir(func2);
		Funcionario func6 = new Funcionario("Anderso Pico", "66666", 1000);
		Funcionario func7 = new Funcionario("Gabriel", "77777", 1000);
		rep1.inserir(func6);
		rep1.inserir(func7);
		
		System.out.println(" - Vendedor Procurado: " + cadastro.procurar("77777").getNome());
		
		// ================================================================================
		
		System.out.println();
		System.out.println("QUESTÃO 03:");
		System.out.println("===========");
		System.out.println();
		
		
		
		
	}
	
}