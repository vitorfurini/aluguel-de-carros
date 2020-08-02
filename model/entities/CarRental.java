package model.entities;

import java.util.Date;

public class CarRental {
  private Date start;
  private Date finish;

  private Car car;
  private Invoice invoice;

  public CarRental(Date start, Date finish, Car car) {
    this.start = start;
    this.finish = finish;
    this.car = car;
  }

  public CarRental() {
  }

  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Date getFinish() {
    return finish;
  }

  public void setFinish(Date finish) {
    this.finish = finish;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }
}
