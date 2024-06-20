package controller;

import java.util.ArrayList;
import java.util.List;
import model.Payment;
import model.Room;

public class Controller {
    private List<Room> rooms;
    private static List<Payment> payments;

    public Controller() {
        rooms = new ArrayList<>();
        payments = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new Room(101, 1, 1000000, 4, null));
        rooms.add(new Room(102, 1, 1000000, 4, null));
        rooms.add(new Room(103, 1, 1000000, 4, null));
        rooms.add(new Room(201, 2, 1250000, 6, null));
        rooms.add(new Room(202, 2, 1250000, 6, null));
        rooms.add(new Room(203, 2, 1250000, 6, null));
        rooms.add(new Room(301, 3, 2350000, 10, null));
        rooms.add(new Room(302, 3, 2350000, 10, null));
        rooms.add(new Room(303, 3, 2350000, 10, null));
        rooms.add(new Room(401, 4, 500000, 2, null));
        rooms.add(new Room(402, 4, 500000, 2, null));
        rooms.add(new Room(403, 4, 500000, 2, null));
    }

    public static void bookRoom() {

    }

    public static void cancelBooking() {

    }

    public static void checkAvailability() {

    }

    public static void processPayment() {

    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Payment payment : payments) {
            totalRevenue += payment.getAmount();
        }
        return totalRevenue;
    }
}
