import java.util.*;
public class Hello {

    public static void main(String... args) {
        Arrays.stream(args)
	    .forEach(System.out::println); 
    }
}