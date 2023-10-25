public class Square extends Shape{
    private int side;
    public Square(int side){
        this.side = side;
    }
    @Override
    public String draw(){
        String res = "";
        for(int i = 0; i<this.side;i++){
            res+="*";
        }
        res+="\n";
        for(int i = 0; i < this.side-2;i++){
            res+="*";
            for(int j = 0; j < this.side-2;j++) res+=" ";
            res+="*\n";
        }
        for(int i = 0; i<this.side;i++){
            res+="*";
        }
        res+="\n";
        return res;
    }
}
