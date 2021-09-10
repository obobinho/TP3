package livraria;

public class Venda {

	private int idVenda;
	private int quantItem;
	private int quantVenda;
	private double valorTotal;
	private Cliente client;
	private Obra obra;

	public Venda(int idVenda, int quantItem, int quantVenda, double valorTotal,
				Cliente client, Obra obra) {
		super();
		this.idVenda = idVenda;
		this.quantItem = quantItem;
		this.quantVenda = quantVenda;
		this.valorTotal = valorTotal;
		this.client = client;
		this.obra = obra;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public int getQuantItem() {
		return quantItem;
	}

	public void setQuantItem(int quantItem) {
		this.quantItem = quantItem;
	}

	public int getQuantVenda() {
		return quantVenda;
	}

	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
}
