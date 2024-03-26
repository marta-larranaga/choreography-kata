package com.example.choreographykata;

public record BookingService(OrchestrationService orchestrationService) {

  public void book(int numberOfSeats) {
    System.out.println("Booking requested : " + numberOfSeats);
    orchestrationService.start(numberOfSeats);
  }
}
