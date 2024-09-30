import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();
        halloJavamitForEach.stringList.add("Hello");
        halloJavamitForEach.stringList.add("World!");

        halloJavamitForEach.returnOldList();
        halloJavamitForEach.returnNewList();

        System.out.println(" ");

        CsvReadIn csvReadIn = new CsvReadIn();
        csvReadIn.readIn("Tester.csv");
        NumberTester numberTester = new NumberTester("Tester.csv");
        csvReadIn.readIn("Tester.csv");

        Scanner scanner = new Scanner(System.in);
        RationalCalculator rationalCalculator = new RationalCalculator();
        VectorCalculator vectorCalculator = new VectorCalculator();
        ComplexCalculator complexCalculator = new ComplexCalculator();

        while (true) {
            System.out.println("Choose calculator:");
            System.out.println("1 = Rational Calculator");
            System.out.println("2 = Vector Calculator");
            System.out.println("3 = Complex Calculator");
            System.out.println("4 = Exit program");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter number x a: ");
            double xA = scanner.nextDouble();
            System.out.print("Enter number x b: ");
            double xB = scanner.nextDouble();
            System.out.print("Enter number y a: ");
            double yA = scanner.nextDouble();
            System.out.print("Enter number y b: ");
            double yB = scanner.nextDouble();

            Number x = new Number(xA, xB);
            Number y = new Number(yA, yB);

            while (true) {
                System.out.println("Choose calculator:");
                System.out.println("1 - Rational Calculator");
                System.out.println("2 - Vector Calculator");
                System.out.println("3 - Complex Calculator");
                System.out.println("4 - Exit program");
                System.out.println("5 = Enter numbers again");
                int operation = scanner.nextInt();

                if (operation == 5) {
                    break;
                }
                Number result = null;
                switch (choice) {
                    case 1:
                        result = performOperation(rationalCalculator, operation, x, y);
                        break;
                    case 2:
                        result = performOperation(vectorCalculator, operation, x, y);
                        break;
                    case 3:
                        result = performOperation(complexCalculator, operation, x, y);
                        break;
                }

                if (result != null) {
                    System.out.println(" ");
                    System.out.println("Lösung:");
                    System.out.println("a = " + result.getA());
                    System.out.println("b = " + result.getB());
                    System.out.println(" ");
                }
            }
        }

        scanner.close();
    }

    private static Number performOperation(AbstractCalculator calculator, int operation, Number x, Number y) {
        switch (operation) {
            case 1:
                return calculator.add(x, y);
            case 2:
                return calculator.subtract(x, y);
            case 3:
                return calculator.multiply(x, y);
            case 4:
                return calculator.divide(x, y);
            default:
                return null;
        }
    }
}