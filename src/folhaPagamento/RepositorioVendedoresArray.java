package folhaPagamento;

public class RepositorioVendedoresArray implements RepositorioFuncionario {
	
	private Vendedor[] vendedores;
	private int indice;
	
	public RepositorioVendedoresArray(int tamanho) {
		this.vendedores = new Vendedor[tamanho];
		this.indice = 0;
	}
	
	public void inserir(Funcionario vendedor) {
		this.vendedores[this.indice] = (Vendedor) vendedor;
		this.indice = this.indice + 1;
	}

	public Vendedor procurar(String cpf) throws FuncionarioNaoEncontradoException {
		int i = this.getIndice(cpf);
		return this.vendedores[i];
	}

	public void remover(String cpf) throws FuncionarioNaoEncontradoException {
		int i = this.getIndice(cpf);
		this.vendedores[i] = this.vendedores[this.indice - 1];
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
			if (this.vendedores[i].getCPF().equals(cpf)) {
				resposta = i;
			}
		}
		if (resposta == -1) {
			throw new FuncionarioNaoEncontradoException();
		}
		return resposta;
	}
} 