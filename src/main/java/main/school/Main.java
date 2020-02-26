
package main.school;


public class Main {

    
    public static void main(String[] args) {
       
        System.out.println("Pocetak");
        
       
     Student s1 = new Student();
     Student s2 = new Student("Petar","Petrovic", 1990);
    
    System.out.println("First name: " + s1.getFirstName() + " Last name: " + s1.getLastName() + "Year of birth " + s1.getYearOfBirth());
    System.out.println("First name: " + s2.getFirstName() + " Last name: " + s2.getLastName() + "Year of birth " + s2.getYearOfBirth());
    }
    
    
}
       

    
