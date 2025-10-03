// Main.java - A comprehensive Java starter script
import java.util.ArrayList;
class Project {
    private String name;
    private String version = "1.0.0";
    public Project(String name) { this.name = name; }
    public void displayInfo() { System.out.println("Project: " + this.name + ", v" + this.version); }
}
public class Main {
    public static void main(String[] args) {
        Project myProject = new Project("GitHub Auto-Repo Project");
        myProject.displayInfo();
        System.out.println("\nFeatures: Classes, Methods, Loops");
        for (int i = 0; i < 5; i++) { System.out.println("  - Loop " + (i + 1)); }
    }
}
