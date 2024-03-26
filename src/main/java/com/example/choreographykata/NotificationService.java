package com.example.choreographykata;

public record NotificationService() {

  public void sendNotification() {
    System.out.println("Your booking failed. Not enough seats available.");
  }
}
