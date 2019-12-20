//imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //initialization
        Scanner keyboard = new Scanner(System.in);
        String[] array_operations = {"+", "-", "*", "/", "^", "sqrt"};
        String selected_operation = new String("ciao");

        System.out.println("Calcolatrice - scegliere l'operazione desiderata");
        
        for(int i = 0; i < array_operations.length; i++){
            System.out.println(i + ") " + "'" + array_operations[i] + "'");
        }

        try{
            selected_operation = keyboard.next();
        } catch(Exception x) {
            System.out.println("");
        }

        //closing
        keyboard.close();
    }
}