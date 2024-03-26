package com.example.choreographykata;

public class InventoryService {

  private int capacity;

  public InventoryService(int capacity) {
    this.capacity = capacity;
  }

  public boolean decrementCapacity(int numberOfSeats){
    if(capacity >= numberOfSeats) {
      capacity = capacity - numberOfSeats;
      System.out.println("Booking reserved : " + numberOfSeats);
      return true;
    } else {
      System.out.println("Booking rejected. Not enough seats. Capacity available : " + capacity);
      return false;
    }
  }
}
