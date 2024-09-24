public class NumberTester {
    NumberTester oddTester;
    NumberTester primeTester;
    NumberTester palindromeTester;

    public NumberTester(String fileName){

    }

    public void setOddEvenTester(NumberTester oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTester primeTester){
        this.primeTester = primeTester;
    }

    public NumberTester(NumberTester palindromeTester) {
        this.palindromeTester = palindromeTester;
    }
}
