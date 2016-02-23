
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if ( name.equals("")){
                System.out.println("");
                for ( Student newStudent : list){
                    System.out.println(newStudent);
                }
               
                break;
            }
            else {
                System.out.print("student number: ");
                String studentNumber = reader.nextLine();
                Student newStudent = new Student(name, studentNumber);
                list.add(newStudent);
            }
            
        }
        
        System.out.print("Give a search item: ");
        String searchItem = reader.nextLine();
        
            for (Student newStudent : list){
                if (newStudent.getName().contains(searchItem)){
                    System.out.println("Result:");
                    System.out.println(newStudent);
                }
            }
            
            
        
        
    }
}