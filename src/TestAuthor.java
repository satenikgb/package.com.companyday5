public class TestAuthor {
    public static void main(String[] args) {
        Author author=new Author("Hermann Hesse","satgab19@gmail.com",'m');

        author.authorName();
        Books book=new Books("Siddhartha" , author.name, 5500);
        System.out.println("Book name is"+" "+book.name+" "+"Author name is"+" "+author.name+" "+"PRICE IS"+" "+book.price);
        Author allaboutauthor=new Author(author.name, author.email,author.gender);
        System.out.println(allaboutauthor.name+" "+allaboutauthor.email);
        Books book1=new Books("Steppenwolf", author.name, 5600);
        book.firstBook();
        book1.secondBook();
    }
}
