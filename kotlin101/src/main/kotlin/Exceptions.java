import java.io.IOException;

public class Exceptions {

    public static void main(String[] args) {

        //ExceptionsKt.error(); //unhandled exception

        try {
            ExceptionsKt.error();
        } catch (IOException e) {
            System.out.println("Caught: " + e);
        }
    }
}
