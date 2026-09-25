
public class libraryManagement {
    static class Books {
        String title;
        String author;
        int yearPublished;

        public Books(String title,String author,int yearPublished){
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
        }

        public void displayInfo(){
            System.out.println("================================================");
            System.out.println("Title : "+title);
            System.out.println("Autor : "+author);
            System.out.println("Published Year : "+yearPublished);
            System.out.println("================================================");
        }
    }
    public static void main(String[] args) {
        Books book1 = new Books("Advance Programming","Tariqul Islam",2026);
        Books book2 = new Books("Object Oreiented Programming","Faysal Islam",2025);

        book1.displayInfo();
        book2.displayInfo();
    }
}
