
public class Main {

    public static void main(String[] args) {
        // write your code here
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "viet");
        Student s2 = new Student(222, "anh");
        Student s3 = new Student(333, "depzai");

        //calling display method
        s1.display();
        s2.display();
        s3.display();

    }
}