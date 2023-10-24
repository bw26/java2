public class AwesomeNumber {
    private int number;
    public AwesomeNumber(int num){
        this.number = num;
    }
    public int getNumber(){
        return this.number;
    }
    public static AwesomeNumber add(AwesomeNumber n1, AwesomeNumber n2){
        return new AwesomeNumber(n1.getNumber()+n2.getNumber());
    }
    public static AwesomeNumber subtract(AwesomeNumber n1, AwesomeNumber n2){
        return new AwesomeNumber(n1.getNumber()-n2.getNumber());
    }
}
