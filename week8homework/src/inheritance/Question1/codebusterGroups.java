package inheritance.Question1;

public class codebusterGroups extends codebuster {

    public void groupname(){
        System.out.println("code2");
    }

    public static void main(String[] args) {
        codebusterGroups c1 = new codebusterGroups();
        c1.groupname();
    }

}
