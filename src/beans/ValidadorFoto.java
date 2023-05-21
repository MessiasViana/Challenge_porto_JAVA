package beans;

public class ValidadorFoto {
	private int tamanhoFotoX;
	private int tamanhoFotoY;
	private boolean qualidadeFoto;
	
	
	public ValidadorFoto(int tamanhoFotoX, int tamanhoFotoY, boolean qualidadeFoto) {
		super();
		this.tamanhoFotoX = tamanhoFotoX;
		this.tamanhoFotoY = tamanhoFotoY;
		this.qualidadeFoto = qualidadeFoto;
	}

	public String validarFoto() {
		if(!qualidadeFoto) {
			return "Qualidade da foto está baixa";
		}
		if(tamanhoFotoX < 1024 && tamanhoFotoY < 1024) {
			return "Tamanho da imagem abaixo do requirido";
		}
		
		return "Foto validada";
	}
	
	
	
	public int getTamanhoFotoX() {
		return tamanhoFotoX;
	}

	public void setTamanhoFotoX(int tamanhoFotoX) {
		this.tamanhoFotoX = tamanhoFotoX;
	}

	public int getTamanhoFotoY() {
		return tamanhoFotoY;
	}

	public void setTamanhoFotoY(int tamanhoFotoY) {
		this.tamanhoFotoY = tamanhoFotoY;
	}

	public boolean isQualidadeFoto() {
		return qualidadeFoto;
	}
	
	public void setQualidadeFoto(boolean qualidadeFoto) {
		this.qualidadeFoto = qualidadeFoto;
	}
}
