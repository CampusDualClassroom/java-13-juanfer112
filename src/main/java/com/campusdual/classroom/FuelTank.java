package com.campusdual.classroom;

public class FuelTank {

  // La variable es sin modificador para garantizar el principio de encapsulación(misma clase, mismo paquete por los test).
  int actualFuel = 10;

  /**
   * Muestra la capacidad actual del tanque de combustible.
   * Utiliza el getter para acceder a la propiedad encapsulada.
   */
  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  /**
   *  Metodo sin modificador para garantizar el principio de encapsulación(misma clase, mismo paquete por los test)
   * Retorna la cantidad de combustible actual.
   * @return la cantidad de combustible en el tanque.
   */
  int getActualFuel() {
    return this.actualFuel;
  }

  /**
   * Establece el nivel de combustible del tanque, validando que no sea negativo.
   * Si el valor es negativo, muestra un mensaje de error y no actualiza el valor.
   * @param fuel La nueva cantidad de combustible.
   */
  public void setActualFuel(int fuel) {
    if(fuel < 0) {
      System.out.println("El valor de combustible no puede ser negativo");
    } else {
      this.actualFuel = fuel;
    }
  }
}
