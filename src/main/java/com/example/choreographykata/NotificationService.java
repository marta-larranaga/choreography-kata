package com.example.choreographykata;

public record NotificationService(MessageBus messageBus) implements Listener {

  public NotificationService(MessageBus messageBus) {
    this.messageBus = messageBus;
    messageBus.subscribe(this);
  }

  public void sendNotification() {
    System.out.println("Your booking failed. Not enough seats available.");
  }

  @Override
  public void onMessage(Object msg) {
    Event event = (Event) msg;
    if (event.name() == "Booking rejected") {
      sendNotification();
    }
  }
}
