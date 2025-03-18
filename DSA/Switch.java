package DSA;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            String fruit = in.next();

            switch (fruit) {
                case "mango" -> {
                    if(fruit.equals("mango")){
                        System.out.println("mango");
                    }
                }
            }
        }
    }
}
