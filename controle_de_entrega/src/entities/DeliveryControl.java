package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DeliveryControl {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dateSaida;
	private Date dateChegada;
	
	private List<Order> order = new ArrayList<>();
	private Car car;
	
	public DeliveryControl() {
		
	}
	
	public DeliveryControl(Date dateSaida, Date dateChegada, Car car) {
		this.dateSaida = dateSaida;
		this.dateChegada = dateChegada;
		this.car = car;
	}

	public Date getDateSaida() {
		return dateSaida;
	}
	
	public void setDateSaida(Date dateSaida) {
		this.dateSaida = dateSaida;
	}
	public Date getDateChegada() {
		return dateChegada;
	}
	public void setDateChegada(Date dateChegada) {
		this.dateChegada = dateChegada;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Order> getOrder() {
		return order;
	}
	
	public void addOrder (Order order) {
		this.order.add(order);
		
	}
	
	public void imprimeLista() {
		for(Order x: order) {
			System.out.println(x);
			
		}
	}

	@Override
	public String toString() {
		return " "
				+ "Data Saída:   " 
				+ sdf.format(dateSaida) 
				+ "\n Data Chegada: " 
				+ sdf.format(dateChegada)
				+ order
				+ " Carro: " + car;
	}
	
	
	
	

}
