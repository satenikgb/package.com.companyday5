public class Books {
    String name;
    String author;
    int price;
    public Books(String name,String author,int price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public void firstBook(){
        System.out.println("First book name is"+name+" "+" Author name is"+author);
    }
    public void secondBook(){
        System.out.println("Second book name is"+name+" "+" Author name is"+author);
    }
}

