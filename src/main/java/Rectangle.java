public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public String draw(){
        String res = "";
        for(int i = 0; i<this.length;i++){
            res+="*";
        }
        res+="\n";
        for(int i = 0; i < this.width-2;i++){
            res+="*";
            for(int j = 0; j < this.length-2;j++) res+=" ";
            res+="*\n";
        }
        for(int i = 0; i<this.length;i++){
            res+="*";
        }
        res+="\n";
        return res;
    }
}
