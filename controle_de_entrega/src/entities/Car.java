package entities;

public class Car {
	private String placaDoCarro;
	private Integer numCarro;
	private Double kmInicial;
	private Double kmFinal;
	
	public Car() {
		
	}
	
	public Car(String placaDoCarro, Integer numCarro, Double kmInicial, Double kmFinal) {
		this.placaDoCarro = placaDoCarro;
		this.numCarro = numCarro;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}

	public String getPlacaDoCarro() {
		return placaDoCarro;
	}

	public void setPlacaDoCarro(String placaDoCarro) {
		this.placaDoCarro = placaDoCarro;
	}

	public Integer getNumCarro() {
		return numCarro;
	}

	public void setNumCarro(Integer numCarro) {
		this.numCarro = numCarro;
	}

	public Double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(Double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public Double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(Double kmFinal) {
		this.kmFinal = kmFinal;
	}
	
	public double totalKmPercorrido() {
		
		return kmFinal - kmInicial;
	}
	
	

}
