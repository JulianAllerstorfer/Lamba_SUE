import java.util.List;

public class NumberTester {
    NumberTest oddTester = (number) -> (number % 2) != 0;
    NumberTest primeTester = (number) -> {
        if(number <= 1) return false;
        for(int i = 2;i <= Math.sqrt(number);i++){
            if(number % i == 0) return false;
        }
        return true;
    };

    NumberTest palindromeTester = (number) -> {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    };

    public NumberTester(String fileName){

    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public NumberTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile(int testType, int number){
        switch (testType){
            case 1:
                System.out.println(oddTester.testNumber(number) ? "Odd" : "Even");
                break;
            case 2:
                System.out.println(primeTester.testNumber(number) ? "Prime" : "No Prime");
                break;
            case 3:
                System.out.println(palindromeTester.testNumber(number) ? "No Palindrom" : "Palindrom");
                break;
        }
    }
}
