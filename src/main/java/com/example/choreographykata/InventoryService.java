package com.example.choreographykata;

public class InventoryService implements Listener {

  private int capacity;
  private MessageBus messageBus;

  public InventoryService(int capacity, MessageBus messageBus) {
    this.capacity = capacity;
    this.messageBus = messageBus;
    messageBus.subscribe(this);
  }

  public void decrementCapacity(int numberOfSeats){
    if(capacity >= numberOfSeats) {
      capacity = capacity - numberOfSeats;
      System.out.println("Booking reserved : " + numberOfSeats);
      Event bookingReserved = new Event("Booking reserved", numberOfSeats);
      messageBus.publish(bookingReserved);
    } else {
      System.out.println("Booking rejected. Not enough seats. Capacity available : " + capacity);
      Event bookingRejected = new Event("Booking rejected", capacity);
      messageBus.publish(bookingRejected);
    }
  }

  @Override
  public void onMessage(Object msg) {
    Event event = (Event) msg;
    if(event.name() == "Booking requested"){
      decrementCapacity(event.value());
    }
  }
}
