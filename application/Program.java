package application;

import model.entities.Car;
import model.entities.CarRental;
import model.services.BrasilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws ParseException {


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

    System.out.println("Digite os dados de aluguel");
    System.out.print("Modelo do carro: ");
    String carModel = sc.nextLine();
    System.out.print("Retirado (dd/MM/yyyy hh:ss): ");
    Date start = sdf.parse(sc.nextLine());
    System.out.print("Devolvido (dd/MM/yyyy hh:ss): ");
    Date finish = sdf.parse(sc.nextLine());

    CarRental cr = new CarRental(start, finish, new Car(carModel));

    System.out.print("Digite o preço por hora:");
    double pricePerHour = sc.nextDouble();
    System.out.print("Digite o preço por dia:");
    double pricePerDay = sc.nextDouble();

    RentalService rentalService = new RentalService(pricePerHour, pricePerDay,
            new BrasilTaxService());

    rentalService.proccessInvoice(cr);

    System.out.println("Recibo");
    System.out.println("Pagamento basico: " + String.format("%.2f",
            cr.getInvoice().getBasicPayment()));
    System.out.println("Taxa: " + String.format("%.2f", cr.getInvoice().getTax()));
    System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));


    sc.close();
  }


}
