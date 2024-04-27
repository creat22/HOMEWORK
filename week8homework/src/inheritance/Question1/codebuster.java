package inheritance.Question1;

/*Write a Java program to create a class called codebuster with a method called groupName().
Create a subclass called codebusterGroups() that overrides the groupName() method.*/

public class codebuster {

    public void groupname(){
        System.out.println("Groupname:"+"Code1");
    }

    public static void main(String[] args) {
        codebuster m1 = new codebuster();
        m1.groupname();
    }
}
