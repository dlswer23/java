
class Rect {
    int x,y;
    public Rect(int width, int height){
        this.x = width; this.y = height;
    }
    public boolean equals(Rect p) {
        if (x * y == p.x * p.y) return true;
        else return false;
    }
}


public class RectEx {

    public static void main(String []args){
        Rect a = new Rect(2,3);
        Rect b = new Rect(3,2);
        Rect c = new Rect(3,4);

        if(a.equals(b)) System.out.println("a의 면적과 b의 면적이 같다. ");
        if(a.equals(b)) System.out.println("a의 면적과 c의 면적이 같다. ");
        if(a.equals(b)) System.out.println("b의 면적과 c의 면적이 같다. ");

    }
}
