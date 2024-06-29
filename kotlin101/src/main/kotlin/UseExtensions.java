import extensions.SumKt;

import java.util.List;

import static extensions.ExtensionsKt.lastChar;
import static extensions.ExtensionsKt.repeat;

public class UseExtensions {

    public static void main(String[] args) {
        System.out.println(lastChar("ABCD")); //static method in Java
        System.out.println(repeat("hey", 3));

        System.out.println(SumKt.sum(List.of(1, 2, 3))); //static method in Java
    }
}
