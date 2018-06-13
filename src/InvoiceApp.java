import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentDate);
        System.out.println(currentTime);

        boolean quit = false;
        double subTotal = 0.0;
        Invoice invoice = new Invoice();

        System.out.println("What is your name ? ");
        String inputName = sc.next();

        invoice.setCustomerName(inputName);
        invoice.setTransationDate(currentDate);

        ArrayList<Item> items = new ArrayList<>();

        while (quit == false) {
            Item item = new Item();
            Item loadedItem = new Item("", "", 0.0, 0, 0);

            System.out.println("Enter your item name: ");
            String name = sc.next();

            System.out.println("Enter your item description: ");
            String description = sc.next();

            System.out.println("Enter your item price: ");
            Double price = sc.nextDouble();

            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();

            item.setName(name);
            item.setDescription(description);
            item.setPrice(price);
            item.setQuantity(quantity);
            item.setItemTotal(price * quantity);

            subTotal += item.getItemTotal();
            items.add(item);

            System.out.println("Do you want to add a new item? (Y/N)");
            String userAnswer = sc.next();

            if (userAnswer.equalsIgnoreCase("n")) {
                System.out.println("Customer Name :" + invoice.getCustomerName());
                System.out.println("Trnsaction Date:" + invoice.getTransationDate());
                System.out.println("=========================================================================================");
                System.out.println("Name : " + "\t\t" + " Description " + "\t\t" + "Price" + "\t\t" + "Quantity" + "\t\t" + "Total ");

                for (Item thisItem : items) {
                    System.out.println();
                    System.out.println("SubTotal: $" + subTotal);
                    quit = true;
                }
            }


        }

    }
}
