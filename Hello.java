import java.util.*;

public class Hello {

    public static void main(String... args) {
        Arrays.stream(args)
	    .forEach(System.out::println);

        sleep(10000000);
    }



    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch(Exception e) {

        }
    }
}
