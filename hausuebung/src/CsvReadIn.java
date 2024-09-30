import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReadIn {
    NumberTester numberTester = new NumberTester("Tester.csv");
    public void readIn (String filename){
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int numTest = Integer.parseInt(reader.readLine());
            for(int i = 0; i < numTest ; i++){
                String line = reader.readLine();
                String[] parts = line.split("\\s");
                int type = Integer.parseInt(parts[0]);
                int num = Integer.parseInt(parts[1]);

                numberTester.testFile(type, num);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
