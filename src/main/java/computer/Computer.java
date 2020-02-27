
package computer;


public class Computer {
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
       
public void setOperatingSystem(String customOperatingSystem) {
    this.operatingSystem = customOperatingSystem;
}
public void setProcessTact (double customProcessTact) {
    this.processTact = customProcessTact;
}
public void setMemory(double customMemory) {
    this.memory = customMemory;
}
public void setHardDrive (int customHardDrive) {
    this.hardDrive = customHardDrive;
}   
public String getOperatingSystem() {
    return this.operatingSystem;
}
public double getProcessTact() {
    return this.processTact;
}
public double getMemory() {
    return this.memory;
}
public int getHardDrive() {
    return this.hardDrive;
}
    
public Computer(String customOperatingSystem, double customProcessTact, double customMemory, int customHardDrive){
    this.operatingSystem = customOperatingSystem;
    this.processTact = customProcessTact;
    this.memory = customMemory;
    this.hardDrive = customHardDrive;
    }

public void info() {
        System.out.println("Process tact: " + getProcessTact());
        System.out.println("Memory: " + getMemory());
        System.out.println("Hard drive: " + getHardDrive());
    }
    
    
    
    
}



