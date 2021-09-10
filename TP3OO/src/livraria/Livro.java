package livraria;

import java.util.Scanner;

public class Livro extends Obra {

	private String autor;

	public Livro(String titulo,String autor,String editora,int edicao,String anoPub,
				 String ling,String tag,double valor,int quantPag,double peso,int quant)
	{
		super(titulo, editora, edicao, anoPub, ling, tag, valor, quantPag, peso,
			  quant);
		this.autor = autor;
	}

///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void principal()
	{
		Livro[] livro= new Livro[21];
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		char opcao;
		
		carregamento(livro);
		
		do
		{
			menu();
			opcao=ler.next().charAt(0);
			
			switch (opcao)
			{
				case '1':
				
					break;
				case '2':
					imprime(livro);
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
		System.out.println("                     Livros\n" +
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
		return "Título: "+titulo+", Autor: "+autor+", Editora: "+editora+
			   ", Edição: "+edicao+", Ano de Publicação: "+anoPub+",\n"+"Língua: "+ling+
			   ", Tag: "+tag+", Valor: R$ "+valor+", Quantidade de Página: "+quantPag+
			   ", Peso: "+peso+"g,"+"\n"+"Quantidade: "+quant+"\n";
	}

///////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void imprime(Livro[] livro)
	{
		System.out.println("                     Livros");
		for(int cont=1;cont < livro.length; cont++)
		{
			if(livro[cont] != null)
				System.out.println(livro[cont]);
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void carregamento(Livro[] livro)
	{
		for(int cont=1; cont <= 5; cont++)
		{
			livro[cont] = new Livro("livro"+cont,"autor"+cont,"editora"+cont,cont*1,
									""+(1997+cont),"lingua"+cont,"tag"+cont,cont*11.11,
									cont*11,cont*1.111,cont);
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////////////	

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String getTitulo() {
		return super.getTitulo();
	}

	@Override
	public void setTitulo(String titulo) {
		super.setTitulo(titulo);
	}

	@Override
	public String getEditora() {
		return super.getEditora();
	}

	@Override
	public void setEditora(String editora) {
		super.setEditora(editora);
	}

	@Override
	public int getEdicao() {
		return super.getEdicao();
	}

	@Override
	public void setEdicao(int edicao) {
		super.setEdicao(edicao);
	}

	@Override
	public String getAnoPub() {
		return super.getAnoPub();
	}

	@Override
	public void setAnoPub(String anoPub) {
		super.setAnoPub(anoPub);
	}

	@Override
	public String getLing() {
		return super.getLing();
	}

	@Override
	public void setLing(String ling) {
		super.setLing(ling);
	}

	@Override
	public String getTag() {
		return super.getTag();
	}

	@Override
	public void setTag(String tag) {
		super.setTag(tag);
	}

	@Override
	public double getValor() {
		return super.getValor();
	}

	@Override
	public void setValor(double valor) {
		super.setValor(valor);
	}

	@Override
	public int getQuantPag() {
		return super.getQuantPag();
	}

	@Override
	public void setQuantPag(int quantPag) {
		super.setQuantPag(quantPag);
	}

	@Override
	public double getPeso() {
		return super.getPeso();
	}

	@Override
	public void setPeso(double peso) {
		super.setPeso(peso);
	}

	@Override
	public int getQuant() {
		return super.getQuant();
	}

	@Override
	public void setQuant(int quant) {
		super.setQuant(quant);
	}


}
