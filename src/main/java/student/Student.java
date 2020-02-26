
package student;


public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    
public Student() {
     this.firstName = "";
     this.lastName = "";
     this.yearOfBirth = 0;
}  
public Student() {
    this.firstName = "Petar";
    this.lastName = "Petrovic";
    this.yearOfBirth = 1990;
} 
 
    public void setFirstName(String customFirstName) {
        this.firstName = customFirstName;
    }
    public void setLastName (String customLastName) {
        this.lastName = customLastName;
    }
    public void setYearOfBirth(int customYearOfBirth) {
        this.yearOfBirth = customYearOfBirth;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
   public Student(String customFirstName, String customLastName, int customYearOfBirth) {
        this.firstName = customFirstName;
        this.lastName = customLastName; 
        this.yearOfBirth = customYearOfBirth;
      }
   
   public Student() {
       this.firstName = "Petar";
       this.lastName = "Petrovic";
       this.yearOfBirth = 1990;
   }

   /*public void showData() {
        System.out.println("Ime: " + this.getFirstName());
        System.out.println("Prezime: " + this.getLastName());
        System.out.println("Godiste: " + this.getYearOfBirth());
    }*/
    
    
    
    
    
    
    
}
