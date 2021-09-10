package livraria;

public class Endereco {
	
	private int cep;
	private String pais;
	private String estadoProvincia;
	private String cidade;
	private String bairroRua;
	private String quadra;
	private int casa;
	private String complemento;

	public Endereco(int cep, String pais, String estadoProvincia, String cidade,
					String bairroRua, String quadra, int casa, String complemento) {
		super();
		this.cep = cep;
		this.pais = pais;
		this.estadoProvincia = estadoProvincia;
		this.cidade = cidade;
		this.bairroRua = bairroRua;
		this.quadra = quadra;
		this.casa = casa;
		this.complemento = complemento;
	}

///////////////////////////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return"CEP: "+cep+", País: "+pais+", Estado/Província: "+estadoProvincia+
			  ", Cidade: "+cidade+", Bairro/Rua: "+bairroRua+","+"\nQuadra: "+quadra+
			  ", Casa: "+casa+", Complemento: "+complemento;
	}

///////////////////////////////////////////////////////////////////////////////////////////
	
	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstadoProvincia() {
		return estadoProvincia;
	}

	public void setEstadoProvincia(String estadoProvincia) {
		this.estadoProvincia = estadoProvincia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairroRua() {
		return bairroRua;
	}

	public void setBairroRua(String bairroRua) {
		this.bairroRua = bairroRua;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public int getCasa() {
		return casa;
	}

	public void setCasa(int casa) {
		this.casa = casa;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
