package livraria;

import java.util.Scanner;

public class Cliente extends Pessoa {
	
	private String ocup;
	private static int quantCliente;

	public Cliente(String nome,String dataNasc,int rg,String cpf,Endereco endereco,
				   Telefone telefone, String ocup, int quantCliente) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.ocup = ocup;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void principal()
	{
		Cliente[] cliente= new Cliente[21];
		Endereco[] endereco= new Endereco[21];
		Telefone[] telefone= new Telefone[21];
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		char opcao;
		
		carregamento(cliente, endereco, telefone);
		
		do
		{
			menu();
			opcao=ler.next().charAt(0);
			
			switch (opcao)
			{
				case '1':
					
					break;
				case '2':
					imprime(cliente, endereco, telefone);
					break;
				case '3':
					
					break;
				case '4':
					
					break;
				case '5':
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}
		while(opcao != '5');
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public static void menu()
	{
		System.out.println("                     Cliente\n" +
						   "1 Cadastrar\n" +
						   "2 Buscar\n" +
						   "3 Editar\n" +
						   "4 Deletar\n" +
						   "5 Sair\n"+
						   "Cadastrar, editar e deletar ainda precisam ser implementadas");
	}	

///////////////////////////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return "Nome: "+nome+", Data de Nascimento: "+dataNasc+", RG: "+rg+", CPF: "+cpf+
		"\n"+endereco+"\n"+telefone+"\nOcupação: "+ocup+"\n";
	}

///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void imprime(Cliente[] cliente,Endereco[] endereco, 
			Telefone[] telefone)
	{	
		int quant=0;
		
		System.out.println("                     Clientes");
		for(int cont=1;cont < cliente.length; cont++)
		{
			if(cliente[cont] != null)
			{
				System.out.println(cliente[cont]);
				quant++;
			}
		}
		
		Cliente.setQuantCliente(quant);
		
		System.out.println("Quantidade de Clientes: "+Cliente.getQuantCliente());
	}
	
///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void carregamento(Cliente[] cliente,Endereco[] endereco, 
									Telefone[] telefone)
	{	
		for(int cont=1; cont <= 2; cont++)
		{
			cliente[cont] = new Cliente("cliente"+(String.valueOf(cont)),
					
										""+cont*11+"/"+cont*11+"/"+(1997+cont),
					
										cont*1111111,
					
										String.valueOf(cont*1)+
										String.valueOf(cont*1)+
										String.valueOf(cont*111111111),
					
										endereco[cont] = new Endereco(cont*11111111,
										"pais"+cont,"estado"+cont,"cidade"+cont,
										"bairro"+cont,"quadra"+cont,cont,"nenhum"+cont),
								
										telefone[cont] =
										new Telefone(cont*11,cont*11,cont*111111111),
										
										"ocupação"+cont,cont);
		}	
	}

///////////////////////////////////////////////////////////////////////////////////////////

	public String getOcup() {
		return ocup;
	}

	public void setOcup(String ocup) {
		this.ocup = ocup;
	}

	public static int getQuantCliente() {
		return quantCliente;
	}

	public static void setQuantCliente(int quantCliente) {
		Cliente.quantCliente = quantCliente;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	@Override
	public String getDataNasc() {
		return super.getDataNasc();
	}

	@Override
	public void setDataNasc(String dataNasc) {
		super.setDataNasc(dataNasc);
	}

	@Override
	public int getRg() {
		return super.getRg();
	}

	@Override
	public void setRg(int rg) {
		super.setRg(rg);
	}

	@Override
	public String getCpf() {
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}

	@Override
	public Endereco getEndereco() {
		return super.getEndereco();
	}

	@Override
	public void setEndereco(Endereco endereco) {
		super.setEndereco(endereco);
	}

	@Override
	public Telefone getTelefone() {
		return super.getTelefone();
	}

	@Override
	public void setTelefone(Telefone telefone) {
		super.setTelefone(telefone);
	}	
}
