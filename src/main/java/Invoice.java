import java.util.ArrayList;

public class Invoice {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private float shippingCost;
    private double total;
    private ArrayList<Item> items;
    public Invoice(String name, String address, String city, String state, int zip, float shippingCost, double total, ArrayList<Item> items){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.shippingCost = shippingCost;
        this.total = total;
        this.items = items;
    }

    @Override
    public String toString() {
        String res = "Ship to:\n"+
                     "  "+this.name+"\n"+
                     "  "+this.address+"\n"+
                     "  "+this.city+", "+this.state+" "+this.zip+"\n\n"+
                     "Items\n"+
                     "_____\n";
        for (Item i : this.items){
            res+=i.getName()+" $"+i.getPrice()+" ("+i.getAmount()+") $"+(i.getPrice()*i.getAmount())+"\n";
        }
        res+="\nShipping: "+((this.shippingCost==0)?"Free":this.shippingCost)+"\n\n";
        res+="Total Cost\n"+"_________\n"+String.format("$%.2f",this.total);
        return res;
    }
}
