import java.util.List;

public class NumberTester {
    NumberTest oddTester = (number) -> (number % 2) != 0;
    NumberTest primeTester = (number) -> {
        if(number <= 1) return false;
        for(int i = 0;i <= Math.sqrt(number);i++){
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
            CsvReadIn csvReadIn = new CsvReadIn();
            csvReadIn.readIn(fileName);
            List<int[]> data = csvReadIn.getData();

            for (int[] zeile : data) {
                int ersteZahl = zeile[0];
                int zweiteZahl = zeile[1];

                if (oddTester.testNumber(zweiteZahl)) {
                    System.out.println("Die Zahl " + zweiteZahl + " in Zeile mit erster Zahl " + ersteZahl + " ist ungerade.");
                } else {
                    System.out.println("Die Zahl " + zweiteZahl + " in Zeile mit erster Zahl " + ersteZahl + " ist gerade.");
                }

                if (primeTester.testNumber(zweiteZahl)) {
                    System.out.println("Die Zahl " + zweiteZahl + " in Zeile mit erster Zahl " + ersteZahl + " ist eine Primzahl.");
                } else {
                    System.out.println("Die Zahl " + zweiteZahl + " in Zeile mit erster Zahl " + ersteZahl + " ist keine Primzahl.");
                }

                if (palindromeTester.testNumber(zweiteZahl)) {
                    System.out.println("Die Zahl " + zweiteZahl + " in Zeile mit erster Zahl " + ersteZahl + " ist ein Palindrom.");
                } else {
                    System.out.println("Die Zahl " + zweiteZahl + " in Zeile mit erster Zahl " + ersteZahl + " ist kein Palindrom.");
                }

                System.out.println();
            }
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
