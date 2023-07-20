package w3resource.oop;

public class Author {
    String name;
    String email;

    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }

    Author (String name, String email){
        this.email=email;
        this.name=name;
    }
}
