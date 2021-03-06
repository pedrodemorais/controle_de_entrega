package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Car;
import entities.DeliveryControl;
import entities.Distrit;
import entities.Order;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Date dateExit;
		Date dateArrival;
		String dateExit1;
		String dateArrival1;
		String placaDoCarro;
		String nameMotorista;
		
		int numCarro;
		double kmInicial;
		double kmFinal;
		
		Integer numOfOrder;
		Double valueOfOrder;
		String nameSellerOrder; 
		String nameClientOrder;
		String bairro;
		Distrit distrit;
		DeliveryControl deliveryControl;
		
		//Lendo dados do Controle de Entrega
		
		System.out.print("Data da Sa�da - dd/mm/yyyy: ");
		dateExit = sdf.parse(dateExit1 = input.nextLine());
		sdf.format(dateExit);
		
		System.out.print("Data da Chegada - dd/mm/yyyy: ");
		dateArrival = sdf.parse(dateArrival1 = input.nextLine());
		sdf.format(dateArrival);
		
		//Lendo dados do Ve�culo
		System.out.print("Placa do Carro: ");
		placaDoCarro = input.nextLine();
		
		System.out.print("N�mero do Carro: ");
		numCarro = input.nextInt();
		
		System.out.print("Km Inicial: ");
		kmInicial = input.nextDouble();
		
		System.out.print("Km Final: ");
		kmFinal = input.nextDouble();
		input.nextLine();

		System.out.print("Motorista: ");
		nameMotorista = input.nextLine();
		
		Car car = new Car(placaDoCarro, numCarro,kmInicial ,kmFinal,nameMotorista );
		deliveryControl = new DeliveryControl(dateExit, dateExit, car);
		
		//lendo os dados dos Pedidos a serem entregues
		System.out.println("Quantos Pedidos vai na Rota:");
		int numDePedidos = input.nextInt();
		
		for(int i=0; i<numDePedidos;i++) {
		
			System.out.print("N�mero do Pedido:");
			numOfOrder =input.nextInt();
			input.nextLine();
		
			System.out.print("Cliente: ");
			nameClientOrder = input.nextLine();
		
			System.out.print("Vendedor: ");
			nameSellerOrder = input.nextLine();
		
			System.out.print("Valor: ");
			valueOfOrder = input.nextDouble();
			input.nextLine();
		
			System.out.print("Bairro: ");
			bairro = input.nextLine();
		
			Order order = new Order(numOfOrder, valueOfOrder, nameSellerOrder, nameClientOrder,  new Distrit(bairro));
			deliveryControl.addOrder(order);
		}
		
		System.out.println("----------------------- Controle de Entrega -------------------------------");
		
		System.out.println("KM Percorrido: "+car.totalKmPercorrido()+" Carro: "+car.getNumCarro()+" Motorista: "+car.getNameMotorista());
		System.out.print("-------------------------------------------------------------------------------");
		deliveryControl.imprimeLista();
		

		input.close();

	}

}
