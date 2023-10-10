public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }

    public int area(){
        int rectangleArea = this.length * this.width;
        return rectangleArea;
    }

    public boolean square(){
        if (this.length == this.width){
            return true;
        } else{
            return false;
        }
    }




}
