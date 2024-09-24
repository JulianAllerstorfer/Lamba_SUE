import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReadIn {
    String fileName = "Tester.csv";
    List<int[]> data = new ArrayList<>();

    public void readIn(){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] werte = line.split("\\s+");
                int[] lineData = new int[2];
                lineData[0] = Integer.parseInt(werte[0]);
                lineData[1] = Integer.parseInt(werte[1]);

                data.add(lineData);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei!");
        }
    }


}
