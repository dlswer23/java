

    class Circle {
        int radius;
        public Circle(int r){
         this.radius = r;
    }

}
    public class ReferencePassing {

        static void increase(Circle m)
        {
            m.radius++;
        }


    public static void main(String[]arr){

        Circle pizza = new Circle(10);
        {

            increase(pizza);

            System.out.println(pizza.radius);

        }
    }
}
