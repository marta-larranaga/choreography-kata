package com.example.choreographykata;

public class TicketingService implements Listener {

  private MessageBus messageBus;
  public TicketingService(MessageBus messageBus) {
    this.messageBus = messageBus;
    messageBus.subscribe(this);
  }

  public void printTickets(int numberOfSeats) {
    System.out.println("Tickets printed : " + numberOfSeats);
  }

  @Override
  public void onMessage(Object msg) {
    Event event = (Event) msg;
    if(event.name() == "Booking reserved") {
      printTickets(event.value());
    }
  }
}
