package ru.bse71.netology.gdz.synchronization.task1;

public class Dish {
  private final Order order;

  Dish(Order order) {
    this.order = order;
  }

  Order getOrder() {
    return order;
  }
}
