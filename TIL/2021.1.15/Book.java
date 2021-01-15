public class Book {
    String title;
    String author;

    public Book(String t){
        title = t;
        author = "작자미상";
    }

    public Book(String t,String a){
        title = t;
        author = a;
    }

    public static void main(String[]args){
        Book javaBook = new Book("이것이 java다", "황기태");
        Book bible = new Book ("Bible");

        System.out.println("책이름 : \t" + javaBook.title+ "  저자 : \t" + javaBook.author);
        System.out.println("책이름 : \t" + bible.title);
    }

}
