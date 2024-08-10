package functionalprogramming;

import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaKotlinComparison {

    public static void main(String[] args) {

        // Equivalent to Kotlin's count{}
        System.out.println(
                MyCollection.INSTANCE.getMyList()
                        .stream()
                        .filter(s -> s.length() > 5)
                        .count()
        ); // 3


        // Equivalent to Kotlin's firstOrNull{}
        System.out.println(
                MyCollection.INSTANCE.getMyList()
                        .stream()
                        .filter(s -> s.length() == 2)
                        .findFirst()
        ); // Optional[is]


        // Equivalent to Kotlin's groupBy
        System.out.println(
                MyCollection.INSTANCE.getMyList()
                        .stream()
                        .collect(Collectors.groupingBy(String::length))
        ); // Map {Int : List<String>}


        // Equivalent to Kotlin's associateBy
        System.out.println(
                MyCollection.INSTANCE.getMyList()
                        .stream()
                        .collect(Collectors.toMap(
                                String::length,
                                Function.identity(),
                                (existing, replacement) -> replacement))
        ); // {2=is, 3=fun, 4=java, 6=kotlin, 7=between, 10=comparison}
    }
}
