
package course;


public class Course {
    
    private String name;
    private int numberOfClasses;
    private String codeName;
    
public Course() {
    this.name = "";
    this.numberOfClasses = 0;
    this.codeName = "";
}
public void setName(String customName) {
        this.name = customName;
}
public void setNumberOfClasses (int customNumberOfClasses) {
        this.numberOfClasses = customNumberOfClasses;
}
public void setCodeName(String customCodeName) {
        this.codeName = customCodeName;
}
    
public String getName() {
    return this.name;
}
public int getNumberOfClasses() {
    return this.numberOfClasses;
}
public String getCodeName() {
    return this.codeName;
}

public Course(String customName, int customNumberOfClasses, String customCodeName){
    this.name = customName;
    this.numberOfClasses = customNumberOfClasses;
    this.codeName = customCodeName;
}
 public void info() {
        System.out.println("Course name: " + getName());
        System.out.println("Course, number of classes: " + getNumberOfClasses());
    }

}
    

