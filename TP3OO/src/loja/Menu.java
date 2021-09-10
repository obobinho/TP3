package loja;

import java.util.Scanner;
import livraria.*;

public class Menu {
	Login login;
	Vendedor vendedor;
	Cliente cliente;
	Obra obra;
	Venda venda;
	ClubeDoLivro clubLivro;
	
	public static void main(String[] args)
	{
		if (Login.login() == '3')
			return;
		
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
					Vendedor.principal();
					break;
				case '2':
					Cliente.principal();
					break;
				case '3':
					Obra.principal();
					break;
				case '4':
					break;
				case '5':
					break;
				case '6':
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}
		while(opcao != '6');
	}

///////////////////////////////////////////////////////////////////////////////////////////

	public static void menu()
	{
		System.out.println("                     Livraria A la Volonté\n" +
						   "1 Vendedor\n" +
						   "2 Cliente\n" +
						   "3 Obra\n" +
						   "4 Venda\n" +
						   "5 Clube do Livro\n" +
						   "6 Sair\n"+
						   "Venda e Clube do Livro ainda precisam ser implementadas");
	}
}
