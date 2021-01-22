import java.awt.*;

class Point{
    private int x,y;
Point(){
    this.x = this.y =0;

}
Point(int x,int y){
    this.x =x; this.y =y;
}
void showPoint(){
    System.out.println("(" + x + "," + y + ")");
}
}

class ColorPoint extends Point{
    private String color;
    ColorPoint(int x,int y,String color){
        super(x,y);
        this.color = color;
    }
    void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}


public class SuperEx {
    public static void main(String []args){
        ColorPoint cp = new ColorPoint(5,6,"blue");
        cp.showColorPoint();

    }
}
