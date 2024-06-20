package view;

import java.util.Scanner;
import controller.Controller;

public class Menu {
    public Menu() {
        Scanner scan = new Scanner(System.in);
        Controller con = new Controller();

        int menu = 0;

        while(menu != 4){
            System.out.println("Pilih menu: \n1. Booking Room \n2. Cancel booking \n3. See total revenue \n4. Keluar");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    new BookRoomScreen();
                    break;
                
                case 2:
                    
                    break;

                case 3:
                    System.out.println("Total Revenue: " + con.calculateTotalRevenue());
                    break;
                
            }
        }
    }
}
