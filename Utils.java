public class Utils {
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
}
