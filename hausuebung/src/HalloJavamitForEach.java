import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    ArrayList<String> stringList = new ArrayList<>();


    public void returnOldList(){
        for(String arrayList : stringList){
            System.out.println(arrayList);
        }
    }

    public void returnNewList(){
        stringList.forEach(System.out::println);
    }
}
