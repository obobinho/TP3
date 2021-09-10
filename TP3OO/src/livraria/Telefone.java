package livraria;

public class Telefone {
	
	private int ddi;
	private int ddd;
	private int num;

	public Telefone(int ddi, int ddd, int num) {
		super();
		this.ddi = ddi;
		this.ddd = ddd;
		this.num = num;
	}

///////////////////////////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return"Número: "+ddi+" "+ddd+" "+num;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////
	
	public int getDdi() {
		return ddi;
	}

	public void setDdi(int ddi) {
		this.ddi = ddi;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
}
