package livraria;

public class ClubeDoLivro {

	private String comida;
	private String bebida;
	private Cliente cliente[];
	private Obra obra[];

	public ClubeDoLivro(String comida, String bebida, Cliente[] cliente, Obra[] obra) {
		super();
		this.comida = comida;
		this.bebida = bebida;
		this.cliente = cliente;
		this.obra = obra;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public Cliente[] getCliente() {
		return cliente;
	}

	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}

	public Obra[] getObra() {
		return obra;
	}

	public void setObra(Obra[] obra) {
		this.obra = obra;
	}

}
