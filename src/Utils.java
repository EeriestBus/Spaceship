package src;

import java.io.IOException;
import java.util.Scanner;

public class Utils {
    public static Scanner scanner = new Scanner(System.in);

    public static void type(String string){
        for(char c : string.toCharArray()){
            System.out.print(c);
            sleep(10);
        }
    }
    public static void typeln(String string){
        type(string + '\n');
    }

    public static void sleep(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static String readNext(){
        try{
            while (System.in.available() > 0) {
                scanner.nextLine();
            }
        } catch (IOException e) {}

        return scanner.nextLine();
    }

    static class Pair<A, B>{
        public final A one;
        public final B two;

        public Pair(A one, B two){
            this.one = one;
            this.two = two;
        }
    }
}
