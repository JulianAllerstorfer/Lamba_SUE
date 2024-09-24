public class NumberTester {
    NumberTest oddTester = (number) -> (number % 2) != 0;
    NumberTest primeTester = (number) -> {
        if(number <= 1) return false;
        for(int i = 0;i <= Math.sqrt(number);i++){
            if(number % i == 0) return false;
        }
        return true;
    };

    NumberTest palindromeTester;

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
}
