
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
   
   public s1() {
       this.firstName = "Petar";
       this.lastName = "Petrovic";
       this.yearOfBirth = 1990;
   }

    Student s1 = new Student();
    
    Student s2 = new Student("Petar","Petrovic", 1990);
    
    public void showData(){
        
    System.out.println("First name: " + s1.getFirstName());
    System.out.println("Last name: " + s1.getLastName());
    System.out.println("Year of birth: " + s1.getYearOfBirth());       
    
    System.out.println("First name: " + s2.getFirstName());
    System.out.println(" Last name: " + s2.getLastName());
    System.out.println("Year of birth " + s2.getYearOfBirth()); 
    }
    
}
