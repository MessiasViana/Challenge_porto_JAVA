package beans;

public class Foto {
	private int idFoto;
	private String dataFoto;
	
	public Foto(String dataFoto) {
		this.dataFoto = dataFoto;
	}

	
	public int getIdFoto() {
		return idFoto;
	}
	
	public void setIdFoto(int idFoto) {
		this.idFoto = idFoto;
	}
	
	public String getDataFoto() {
		return dataFoto;
	}
	
	public void setDataFoto(String dataFoto) {
		this.dataFoto = dataFoto;
	}
	
}
