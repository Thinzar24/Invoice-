public class Item {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private double itemTotal;

    public Item(String name, String description,double price, double itemTotal, int quantity){
        this.name =name;
        this.description =description;
        this.price =price;
        this.quantity = quantity;
        this.itemTotal=itemTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public Item(){

    }
}
