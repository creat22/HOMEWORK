package Week7Homework;

public class Person {

    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = "+person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " +person.getFirstName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("smith");
        System.out.println("fullName = " +person.getFullName());


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public  void setFirstName(String firstName) {
         this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName= lastName;
    }

    public void setAge(int age) {
        if (age > 0 || age < 100) {
           this.age= age;
        }
    }

    public boolean isTeen() {
        if(age > 12 && age < 20){
            return  true;
        }else{
            return  false;
        }

    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return firstName;
        } else if (lastName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}





