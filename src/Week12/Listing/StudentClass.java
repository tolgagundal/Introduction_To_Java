package Week12;

import java.lang.reflect.Constructor;

public class StudentClass {
    // Data Field

    String name;
    String surname;
    Integer id;
    String mail;

    // Constructor

    public StudentClass() {

        /*this.name = name;
        this.surname = surname;
        this.id = id;
        this.mail = mail;
        */


    }

    public StudentClass(String name, String surname, String id, String mail) {

    }

    public static void print(String name, String surname, String id, String mail) {

        System.out.println();
    }

    public String getName() {return this.name; }
    public void setName(String name){

    }

}



