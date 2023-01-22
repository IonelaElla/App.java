package ro.siit.gad.session4;

public class Library {
    public static void addBook(String name){
        System.out.println("Adding book with name " + name);
    }

    public static void addBook(String name, String author){
        System.out.println("Adding book with name " + name + " and author " + author);
    }

    public static void main(String[] args) {
        Library.addBook("Mara");
        Library.addBook("Padurea spanzuratilor", "Liviu Rebreanu");
    }
}
