package software.civíl;
public class Funcionario
{

	private String cpfCnpj;
	private String nomeFuncionario;
	private String carteiraTrabaho;
	private char sexo;
	private String dataNascimento;
	
	/*construtor vazio*/
	public Funcionario()
	{
		cpfCnpj = "";
		nomeFuncionario = "";
		carteiraTrabaho = "";
		sexo = ' ';
		dataNascimento = null;
		
	}
	
	/*construtor*/
	public Funcionario(String cpfCnpj, String nomeFuncionario, String carteiraTrabaho, char sexo, String dataNascimento)
	{
		this.cpfCnpj = cpfCnpj;
		this.nomeFuncionario = nomeFuncionario;
		this.carteiraTrabaho = carteiraTrabaho;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}
	
	/*sets*/
	public void setCpfCnpj(String cpfCnpj)
	{
		this.cpfCnpj = cpfCnpj;
	}
	
	public void setNomeFuncionario(String nomeFuncionario)
	{
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public void setCarteiraTrabalho(String carteiraTrabaho)
	{
		this.carteiraTrabaho = carteiraTrabaho;
	}
	
	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}
	
	public void setDataNascimento(String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}
	
	/*gets*/
	public String getCpfCnpj()
	{
		return this.cpfCnpj;
	}
	
	public String getNomeFuncionario()
	{
		return this.nomeFuncionario;
	}
	
	public String getCarteiraTrabalho()
	{
		return this.carteiraTrabaho;
	}
	
	public char getSexo()
	{
		return this.sexo;
	}
	
	public String getDateNascimento()
	{
		return this.dataNascimento;
	}
}
