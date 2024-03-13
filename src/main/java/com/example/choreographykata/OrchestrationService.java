package com.example.choreographykata;

public record OrchestrationService(InventoryService inventoryService, TicketingService ticketingService,
                                   NotificationService notificationService) {

  /*public void start(int numberOfSeats) {
    if (inventoryService.decrementCapacity(numberOfSeats)) {
      ticketingService.printTickets(numberOfSeats);
    } else {
      notificationService.sendNotification();
    }
  }*/
}
