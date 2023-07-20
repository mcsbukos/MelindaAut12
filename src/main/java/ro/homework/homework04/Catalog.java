package ro.homework.homework04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Catalog {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.workWithlists();
        catalog.workWithSets();
            }


    public void workWithlists() {
        // adaugarea studentilor
        List <Object> list = new ArrayList<>();
        list.add(1);
        list.add(new Student("Aurel", "Tomita", 6.78));

        list.add(2);
        list.add(new Student("Ion", "Stefanescu", 7.97));
        displayList(list);

        // stergerea unui student dupa nume
        list.remove("Ion");
    }
    // afisarea tuturor studentilor
    public void displayList (List<Object> list) {
        for (Object obj : list) {
            System.out.println(obj);

        }
    }

 public void workWithSets() {
     HashSet<Object> setList = new HashSet<>();
     setList.add(new Student("Aurel", "Tomita", 6.78));
     setList.add(new Student("Ion", "Stefanescu", 7.97));
     setList.add(new Student("Maria", "Toma", 9.41));

     for (Object el : setList) {
         System.out.println(el);
     }

 }

}