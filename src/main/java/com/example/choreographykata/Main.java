package com.example.choreographykata;

public class Main {

  public static void main(String[] args) {
    MessageBus messageBus = new MessageBus();
    InventoryService inventoryService = new InventoryService(6, messageBus);
    TicketingService ticketingService = new TicketingService(messageBus);
    //NotificationService notificationService = new NotificationService(messageBus);
    BookingService bookingService = new BookingService(messageBus);
    int numberOfSeats = 7;
    bookingService.book(numberOfSeats);
  }
}
