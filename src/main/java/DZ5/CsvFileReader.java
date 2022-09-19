package DZ5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CsvFileReader {
    public void read() {


        try (FileInputStream fis = new FileInputStream("demo.txt")) {


            int b;
            while ((b = fis.read()) !=-1){
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


