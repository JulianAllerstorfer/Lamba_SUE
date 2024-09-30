public class Main {
    public static void main(String[] args) {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();
        halloJavamitForEach.stringList.add("Hello");
        halloJavamitForEach.stringList.add("World!");

        halloJavamitForEach.returnOldList();
        halloJavamitForEach.returnNewList();

        String filePath = "Tester.csv";
        NumberTester numberTester = new NumberTester(filePath);
    }
}