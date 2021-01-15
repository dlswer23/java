public class nemo {

    int len;

    public int getArea(){
        return len*len;
    }

    public static void main(String[] args){

        nemo area;
        area = new nemo();
        area.len = 10; // 길이가 10이라고 했을 때
        int sumarea = area.getArea();
        System.out.println(sumarea);
    }
}

