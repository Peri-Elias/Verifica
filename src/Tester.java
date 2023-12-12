import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Tester {
    public static void main(String [] args) throws IOException {
        Circle cerchio1 = new Circle(1,2,3.5);
        Circle cerchio2 = new Circle(1,4,100);
        Circle cerchio3 = new Circle();
        Circle cerchio4 = new Circle(1000,23,45);

        // Esempi di utilizzo dei cerchi
        BufferedReader tastiera = new BufferedReader( new InputStreamReader(System.in));
        String line = tastiera.readLine();

        boolean verifica;
       verifica = cerchio1.spostamento(10, 11);
       //condizione cerchio1
       verifica = cerchio2.spostamento(300,400);
        //condizione cerchio2
        verifica = cerchio3.spostamento(1000,1000);
        //condizione cerchio3
       verifica = cerchio4.spostamento(1,988);
       //condizione cerchio4




    }
}

