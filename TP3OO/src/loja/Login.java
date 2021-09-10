package loja;

import java.util.*;

public class Login
{
	static String usuario, senha;
	
	public static char login()
	{
		char opcao='\0';
		
		do
		{
			if(usuario == null || opcao == '2')
			{
				cadastro();
				opcao='\0';
			}

			if(usuario != null)
				opcao=entrar();
		}
		while(opcao == '2');
		
		return opcao;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////

	public static void cadastro()
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("                     Livraria A la Volont�\n" +
						   "Cadastro de login");
		
		do
		{
			System.out.println("Novo usu�rio: ");
			usuario=ler.nextLine();
			
			if(usuario.trim().isEmpty())
				System.out.println("Usu�rio vazio! Digite novamente.");
		}
		while(usuario.trim().isEmpty());
		
		do
		{
			System.out.println("Nova senha: ");
			senha=ler.nextLine();
			
			if(senha.trim().isEmpty()) 
				System.out.println("Senha vazia! Digite novamente.");
		}
		while(senha.trim().isEmpty());
	}

///////////////////////////////////////////////////////////////////////////////////////////

	public static char entrar()
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String logar;
		char opcao='\0';
		
		System.out.println("                     Livraria A la Volont�\n");
		System.out.println("Login\n" +
						   "Usu�rio: ");
		logar=ler.nextLine();
			
		if(!logar.equals(usuario))
		{
			System.out.println("Usu�rio inv�lido!\n" +
							   "1 - Tentar novamente\n" +
							   "2 - Resetar login\n" +
							   "3 - Sair do programa");
			opcao=ler.next().charAt(0);
			ler.nextLine();
			
			if(opcao < (char)49 || opcao > (char)51)
			{
				System.out.println("Op��o Inv�lida");
				opcao='\0';
			}
		}

		
		if(logar.equals(usuario))
		{
			System.out.println("Senha: ");
			logar=ler.nextLine();
				
			if(!logar.equals(senha))
			{
				opcao='\0';
				System.out.println("Senha inv�lida!\n" +
								   "1 - Tentar novamente\n" +
								   "2 - Resetar login\n" +
								   "3 - Sair do programa");
				opcao=ler.next().charAt(0);
				ler.nextLine();

				if(opcao < (char)49 || opcao > (char)51)
				{
					System.out.println("Op��o Inv�lida");
					opcao='\0';
				}
			}
		}
		
		return opcao;
	}
}
