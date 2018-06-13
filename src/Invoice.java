import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {
    private String customerName;
    private LocalDate transationDate;
    private ArrayList<Item> items;

    public Invoice() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getTransationDate() {
        return transationDate;
    }

    public void setTransationDate(LocalDate currentDate) {
        this.transationDate = transationDate;
    }


    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
