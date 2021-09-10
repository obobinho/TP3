package livraria;

import java.util.Scanner;

public class Obra {
	
	protected String titulo;
	protected String editora;
	protected int edicao;
	protected String anoPub;
	protected String ling;
	protected String tag;
	protected double valor;
	protected int quantPag;
	protected double peso;
	protected int quant;

	public Obra(String titulo, String editora, int edicao, String anoPub, String ling,
				String tag, double valor, int quantPag, double peso, int quant) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.edicao = edicao;
		this.anoPub = anoPub;
		this.ling = ling;
		this.tag = tag;
		this.valor = valor;
		this.quantPag = quantPag;
		this.peso = peso;
		this.quant = quant;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void principal()
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		char opcao;
		
		do
		{
			menu();
			opcao=ler.next().charAt(0);
			
			switch (opcao)
			{
				case '1':
					Livro.principal();
					break;
				case '2':
					LivroAcademico.principal();
					break;
				case '3':
					Manga.principal();
					break;
				case '4':
					HQ.principal();
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
		System.out.println("                     Obras\n" +
		"1 Livros\n" +
		"2 Livros Acadêmicos\n" +
		"3 Mangás\n" +
		"4 HQs\n" +
		"5 Sair");
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getAnoPub() {
		return anoPub;
	}

	public void setAnoPub(String anoPub) {
		this.anoPub = anoPub;
	}

	public String getLing() {
		return ling;
	}

	public void setLing(String ling) {
		this.ling = ling;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantPag() {
		return quantPag;
	}

	public void setQuantPag(int quantPag) {
		this.quantPag = quantPag;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
}
