package folhaPagamento;

public class RepositorioFuncionariosArray implements RepositorioFuncionario{
	
	private Funcionario[] funcionarios;
	private int indice;
	
	public RepositorioFuncionariosArray(int tamanho) {
		this.funcionarios = new Funcionario[tamanho];
		this.indice = 0;
	}
	
	public void inserir(Funcionario funcionario) {
		this.funcionarios[this.indice] = funcionario;
		this.indice = this.indice + 1;
	}

	public Funcionario procurar(String cpf) throws FuncionarioNaoEncontradoException {
		int i = this.getIndice(cpf);
		return this.funcionarios[i];
	}

	public void remover(String cpf) throws FuncionarioNaoEncontradoException {
		int i = this.getIndice(cpf);
		this.funcionarios[i] = this.funcionarios[this.indice - 1];
		this.indice = this.indice - 1;
	}

	public boolean existe(String cpf) {
		boolean resposta = true;
		try {
			this.getIndice(cpf);
		} catch (FuncionarioNaoEncontradoException ex) {
			resposta = false;
		}
		return resposta;
	}

	private int getIndice(String cpf) throws FuncionarioNaoEncontradoException {
		int resposta = -1;
		for (int i = 0; i < this.indice; i++) {
			if (this.funcionarios[i].getCPF().equals(cpf)) {
				resposta = i;
			}
		}
		if (resposta == -1) {
			throw new FuncionarioNaoEncontradoException();
		}
		return resposta;
	}
} 