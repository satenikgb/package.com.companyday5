public class Author {
    String name;
    String email;
    char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public void authorName(){
        System.out.println("Author name"+" "+name+" "+"Author email"+" "+
                email+" "+"Author gender"+" "+gender);
    }

}
