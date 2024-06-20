package view;

import java.util.Scanner;
import model.Customer;
import model.Room;

public class BookRoomScreen {
    public BookRoomScreen() {
        Scanner scan = new Scanner(System.in);
        Customer cust = new Customer(0, null, null, null);
        Room room = new Room(0, 0, 0, 0, null);

        System.out.print("Masukkan nama customer: ");
        String name = scan.nextLine();
        cust.setName(name);
        System.out.print("Masukkan tipe kamar (basic/suite/deluxe/capsule): ");
        String kamar = scan.nextLine();
        System.out.print("Masukkan banyak orang yang menginap: ");
        int banyak = scan.nextInt();
        room.setCapacity(banyak);

    }
}
