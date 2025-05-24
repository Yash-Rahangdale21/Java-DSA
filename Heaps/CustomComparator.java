
import java.util.Arrays;
 class Student implements Comparable<Student>{
    int rollno;
   double percentage;
    String name;
    Student(int rollno, double percentage, String name){
        this.rollno = rollno;
        this.percentage = percentage;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.rollno - s.rollno;
    }
    
}


public class CustomComparator {
    
    public static void print(Student[] arr){
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i].rollno + " " + arr[i].percentage + " " + arr[i].name + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        
        Student[] s = new Student[4];
        s[0]= new Student(1, 90.0, "Yash");
        s[2] = new Student(2, 95.0, "Amit");
        s[1] = new Student(3, 85.0, "Ravi");
        s[3] = new Student(4, 95.0, "sujal");
        print(s);
        Arrays.sort(s);
        print(s);
    }
    }