package com.example.choreographykata;

public class Main {

  public static void main(String[] args) {
    InventoryService inventoryService = new InventoryService(54);
    TicketingService ticketingService = new TicketingService();
    NotificationService notificationService = new NotificationService();
    OrchestrationService orchestrationService = new OrchestrationService(inventoryService, ticketingService, notificationService);
    BookingService bookingService = new BookingService(orchestrationService);
    int numberOfSeats = 7;
    bookingService.book(numberOfSeats);
  }
}
