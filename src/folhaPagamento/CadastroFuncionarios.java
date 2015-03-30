package folhaPagamento;

public class CadastroFuncionarios {
	
	private Repositorio funcionarios;
	
	public CadastroFuncionarios(Repositorio funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		if (!funcionarios.existe(funcionario.getCPF()))
			funcionarios.inserir(funcionario);
		else
			throw new FuncionarioJaCadastradoException();
	}

	public Funcionario procurar(String cpf) throws FuncionarioNaoEncontradoException {
		return funcionarios.procurar(cpf);
	}

	public void remover(String cpf) throws FuncionarioNaoEncontradoException { 
		 funcionarios.remover(cpf);
	}
}