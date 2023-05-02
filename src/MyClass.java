import java.util.Arrays;

public class MyClass {
    String firstName;
    String LastName;
    int age;
 Peaksoft[]peaksofts;


    public MyClass() {
    }

    public MyClass(String firstName, String lastName, int age, Peaksoft[] peaksofts) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.peaksofts = peaksofts;
    }

    @Override
    public String toString() {
        return "MyClass: " +
                " firstName : " + firstName + '\'' +
                " LastName : " + LastName + '\'' +
                "  age : " + age +
                " peaksofts : " + Arrays.toString(peaksofts);

    }
}
