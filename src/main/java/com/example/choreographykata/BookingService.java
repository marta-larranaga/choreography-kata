package com.example.choreographykata;

public record BookingService(MessageBus messageBus) {

  public void book(int numberOfSeats) {
    System.out.println("Booking requested : " + numberOfSeats);
    Event bookingRequested = new Event("Booking requested", numberOfSeats);
    messageBus.publish(bookingRequested);
  }
}
