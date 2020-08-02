package model.entities;

public class Car {
  private String model;

  public Car(String model) {
    this.model = model;
  }

  public Car() {
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
