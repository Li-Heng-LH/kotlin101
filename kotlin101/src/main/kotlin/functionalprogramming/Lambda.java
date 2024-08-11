package functionalprogramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//A lambda expression is a block of code that gets passed around
/*
 * parentheses can be omitted only if there is exactly one parameter and the data type is not specified
 * single expression as the body --> no need {}
 * one or more statements in body --> need {}
 * Note: An expression can return `void`. In that case no need to have {}. For example, `System.out.println()`.
 */
public class Lambda {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Hello");
        runnable.run();

        Predicate<Integer> predicate = i -> i > 0;

        BiPredicate<Integer, Integer> biPredicate = (i, i2) -> i == i2;

        BiPredicate<Integer, Integer> biPredicate2 = (i, i2) -> {
            System.out.println("bi predicate");
            return i == i2;
        };
    }
}
