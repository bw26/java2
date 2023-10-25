public class Item {
    private float price;
    private int amount;
    private String name;
    public Item(){
        this.price = 0;
        this.amount = 0;
        this.name = null;
    }
    public Item(float price, int amount, String name){
        this.price = price;
        this.amount = amount;
        this.name = name;
    }
    public float getPrice(){return this.price;}
    public int getAmount(){return this.amount;}
    public String getName(){return this.name;}
}
