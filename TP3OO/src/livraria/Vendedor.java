package livraria;

import java.util.Scanner;

public class Vendedor extends Pessoa
{

	private double salario;
	private double comissao;

	public Vendedor(String nome,String dataNasc,int rg,String cpf,Endereco endereco,
					Telefone telefone,double salario,double comissao)
	{
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
		this.comissao = comissao;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void principal()
	{
		Vendedor[] vendedor= new Vendedor[11];
		Endereco[] endereco= new Endereco[21];
		Telefone[] telefone= new Telefone[21];
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		char opcao;
		
		carregamento(vendedor, endereco, telefone);
		
		do
		{
			menu();
			opcao=ler.next().charAt(0);
			
			switch (opcao)
			{
				case '1':
				
					break;
				case '2':
					imprime(vendedor, endereco, telefone);
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
		System.out.println("                     Vendedor\n" +
						   "1 Cadastrar\n" +
						   "2 Buscar\n" +
						   "3 Editar\n" +
						   "4 Deletar\n" +
						   "5 Sair\n"+
						   "Cadastrar, editar e deletar ainda precisam ser implementadas");
	}	

///////////////////////////////////////////////////////////////////////////////////////////
	
	public String toString() {
		return "Nome: "+nome+", Data de Nascimento: "+dataNasc+", RG: "+rg+", CPF: "+cpf+
				"\n"+endereco+"\n"+telefone+"\nSalário: "+salario+", Comissão: "+
				comissao+"\n";
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public static void imprime(Vendedor[] vendedor,Endereco[] endereco, 
			Telefone[] telefone)
	{	
		System.out.println("                     Vendedores");
		for(int cont=1;cont < vendedor.length;cont++)
		{
			if(vendedor[cont] != null)
				System.out.println(vendedor[cont]);
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public static void carregamento(Vendedor[] vendedor,Endereco[] endereco, 
			Telefone[] telefone)
	{	
		for(int cont=1; cont <= 2; cont++)
		{
			vendedor[cont] = new Vendedor("vendedor"+(String.valueOf(cont)),
					
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
										
										  2000.00,100.00);
		}	
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
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
