package beans;

public class Bicicleta {
	private int idBicicleta;
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String tipoBicicleta;
	
	
	public Bicicleta(String marca, String modelo, String anoFabricacao, String tipoBicicleta) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.tipoBicicleta = tipoBicicleta;
	}

	public int getIdBicicleta() {
		return idBicicleta;
	}
	
	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	
	
}
