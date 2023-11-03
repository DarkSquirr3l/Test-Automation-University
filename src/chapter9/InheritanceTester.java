package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        Mother mum = new Mother();
        mum.setName("Kathy");

        System.out.println("My mum is called " + mum.getName() + " and she is a " + mum.getGender());
    }
}
