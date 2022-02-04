package week1Homework.Q03Test;

import java.util.List;
import java.util.Scanner;

public class Methods {
    public void Method() {
        Scanner scan = new Scanner(System.in);
        DataList c = new DataList();

        while (true) {
            System.out.println("===============================");
            System.out.println("1. - 2+1 and 3+1 flats less than 3000₺");
            System.out.println("2. - MessageList");
            System.out.println("3. - Favourites of Ayse");
            System.out.println("4. - Exit");
            System.out.print("Select :");
            int select = scan.nextInt();

            if (select > 4 || select < 1) {
                System.out.println("Invalid number, try again!");
            } else {
                switch (select) {
                    case 1:
                        listNumberOfRoomsAndPrice(c.getAdList(), 3000);
                        break;
                    case 2:
                        showListOfMessages(c.getMessageList());
                        break;
                    case 3:
                        favouriteAdvertsofAyse(c.getAyseFavoriList());
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }
            }
        }

    }

    private static void favouriteAdvertsofAyse(List<Advert> ayseFavoriList) {
        System.out.println();
        System.out.println("Favourite list of Ayse:");
        for (Advert w : ayseFavoriList) {
            System.out.println(w.getRealEstate());
        }
    }

    private static void showListOfMessages(List<Message> messageList) {
        System.out.println();
        System.out.println("All messages: ");
        for (Message w : messageList) {
            System.out.println("Message title: " + w.getMsgTitle() + ",\t\tSender: " + w.getSender().getName() + " " + w.getSender().getSurname() +
                    ",\t\tReciever:  " + w.getReciever().getName() + " " + w.getReciever().getSurname());
        }
    }


    private static void listNumberOfRoomsAndPrice(List<Advert> list, int lessPrice) {
        System.out.println();
        System.out.println("Lists of 2+1 and 3+1 flats less than 3000₺:");
        for (Advert w : list) {
            if (w.getPrice() < lessPrice && (w.getRealEstate().getNumberOfRooms().equals("2+1") || w.getRealEstate().getNumberOfRooms().equals("3+1"))) {
                System.out.println(w.getRealEstate());
            }
        }
    }


}
