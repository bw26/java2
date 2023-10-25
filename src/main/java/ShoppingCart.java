import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private float shippingCost;
    private double total;
    public ShoppingCart(){
        this.items = new ArrayList<Item>();
        this.shippingCost = 0;
    }
    public ShoppingCart(float shippingCost){
        this.items = new ArrayList<Item>();
        this.shippingCost = shippingCost;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void calculateTotal(){
        for(Item i : this.items){
            this.total+=i.getPrice()*i.getAmount();
            if(i.getPrice()<10)this.total+=this.shippingCost;
        }
        this.total*=1.1;
    }
    public String getTotal(){
        return String.format("$%.2f",this.total);
    }
//    public Invoice shipOrder(String name, String address, String city, String state, int zip){
//        return new Invoice(name,address,city,state,zip,shippingCost,this.items);
//    }
}
