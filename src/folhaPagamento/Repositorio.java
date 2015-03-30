package folhaPagamento;

public interface Repositorio {

	void inserir(Funcionario funcionario);
	Funcionario procurar(String cpf) throws FuncionarioNaoEncontradoException;
	void remover(String cpf) throws FuncionarioNaoEncontradoException ;
	boolean existe(String cpf);
	
}