import java.lang.System.*;

class FirstTest {

    void myFirstTest() {
        Calculator calculator = new Calculator();
        assert (3 == calculator.add(1, 1)) : "Incorrect summation..."; 
    }

    public static void main(String[] args){
        FirstTest aFirstTest  = new FirstTest();
        aFirstTest.myFirstTest();

    }
}
