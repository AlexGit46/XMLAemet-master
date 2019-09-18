package model;

public class Dia {
	private String fecha;
	private String ico;
	private String periodo;
	private String cielo;
	private String lluvia;
	private int max;
	private int min;
	public Dia() {
		
	}
	public Dia(String fecha, String ico, String periodo, String cielo, String lluvia, int max, int min) {
		super();
		this.fecha = fecha;
		this.ico = ico;
		this.periodo = periodo;
		this.cielo = cielo;
		this.lluvia = lluvia;
		this.max = max;
		this.min = min;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getIco() {
		return ico;
	}
	public void setIco(String ico) {
		this.ico = ico;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getCielo() {
		return cielo;
	}
	public void setCielo(String cielo) {
		this.cielo = cielo;
	}
	public String getLluvia() {
		return lluvia;
	}
	public void setLluvia(String lluvia) {
		this.lluvia = lluvia;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return "Dia [fecha=" + fecha + ", ico=" + ico + ", periodo=" + periodo + ", cielo=" + cielo + ", lluvia="
				+ lluvia + ", max=" + max + ", min=" + min + "]";
	}
	
	
}
