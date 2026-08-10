package Day7;

public class StudentClass {
       String name;
       int age;
       double marks;
       void displayDetails() {
    	   System.out.println("Name:" + name);
    	   System.out.println("Age:" + age);
    	   System.out.println("marks:" + marks);
       }
	public static void main(String[] args) {
		Student student = new Student();
		student.name="dhanya";
		student.age=20;
		student.mark=88.5;
        
		student.displayDetails();

	}

}
