public class BufferEx {
    public static void main(String[]args) {

        StringBuilder sb = new StringBuilder("This");

        sb.append(" is pencil.");
        sb.insert(7," my");
        sb.replace(8,10,"your");
        System.out.println(sb); //this is your pencil


    }
}
