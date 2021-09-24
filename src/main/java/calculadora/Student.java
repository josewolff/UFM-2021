package calculadora;

public class Student {

    private int carne;
    private String firstName;
    private String lastName;

    public Student (int carne, String firstName, String lastName){
        this.carne = carne;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean verifyCarne(Student student){
        int carne = student.carne;
        if(student != null){
            System.out.println(String.valueOf(carne).length());
            return String.valueOf(carne).length() == 5;
        }else{
            System.out.println("test");
            return false;
        }

    }
}
