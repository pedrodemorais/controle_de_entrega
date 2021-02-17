package entities;

public class Car {
	private String placaDoCarro;
	private Integer numCarro;
	private Double kmInicial;
	private Double kmFinal;
	private String nameMotorista;
	
	public Car() {
		
	}
	
	public Car(String placaDoCarro, Integer numCarro, Double kmInicial, Double kmFinal, String nameMotorista) {
		this.placaDoCarro = placaDoCarro;
		this.numCarro = numCarro;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.nameMotorista = nameMotorista;
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
	
	
	
	public String getNameMotorista() {
		return nameMotorista;
	}

	public void setNameMotorista(String nameMotorista) {
		this.nameMotorista = nameMotorista;
	}

	public double totalKmPercorrido() {
		
		return kmFinal - kmInicial;
	}
	
	

}
