class Student{
    int rollno;
    String name;
    int marks;
}

public class ArrayofObjects{
    public static void main(String[] a) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 85;

        s2.rollno = 2;
        s2.name = "Jane";
        s2.marks = 45;

        s3.rollno = 3;
        s3.name = "Mary";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println(students[0].name);

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].rollno + " " + students[i].name + " " + students[i].marks);
        }
    }
}