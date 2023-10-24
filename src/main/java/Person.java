public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private int id;
    private static int count = 0;
    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.id = Integer.MIN_VALUE;
        count++;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.id = Integer.MIN_VALUE;
        count++;
    }
    public Person(String firstName, String lastName, byte age, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        count++;
    }
    public String speak(){
        String res = "";
        if (this.firstName.isEmpty() || this.lastName.isEmpty()) res+="I don't have a name";
        else res+="My name is "+this.firstName+" "+this.lastName;
        if(this.age!=0) res+="and I am "+this.age+" "+"years old";
        return res+".";
    }
    public static int getPersonCount(){
        return count;
    }
    public String toString(){
        String id = (this.id==Integer.MIN_VALUE)?"":Integer.toString(this.id);
        if (this.firstName.equals("")||this.lastName.equals("")) return "N/A";
        return this.firstName+" "+this.lastName+" "+id;
    }

}
