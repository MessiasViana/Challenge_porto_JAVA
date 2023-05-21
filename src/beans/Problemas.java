package beans;

public class Problemas {
	private boolean quadroBicicleta;
	private boolean rodaBicicleta;
	private boolean mesaBicicleta;
	private boolean cambioBicicleta;
	
	public Problemas(boolean quadroBicicleta, boolean rodaBicicleta, boolean mesaBicicleta, boolean cambioBicicleta) {
		this.quadroBicicleta = quadroBicicleta;
		this.rodaBicicleta = rodaBicicleta;
		this.mesaBicicleta = mesaBicicleta;
		this.cambioBicicleta = cambioBicicleta;
	}
	
	public boolean isQuadroBicicleta() {
		return quadroBicicleta;
	}
	
	public void setQuadroBicicleta(boolean quadroBicicleta) {
		this.quadroBicicleta = quadroBicicleta;
	}
	
	public boolean isRodaBicicleta() {
		return rodaBicicleta;
	}
	
	public void setRodaBicicleta(boolean rodaBicicleta) {
		this.rodaBicicleta = rodaBicicleta;
	}
	
	public boolean isMesaBicicleta() {
		return mesaBicicleta;
	}
	
	public void setMesaBicicleta(boolean mesaBicicleta) {
		this.mesaBicicleta = mesaBicicleta;
	}
	
	public boolean isCambioBicicleta() {
		return cambioBicicleta;
	}
	
	public void setCambioBicicleta(boolean cambioBicicleta) {
		this.cambioBicicleta = cambioBicicleta;
	}
}
