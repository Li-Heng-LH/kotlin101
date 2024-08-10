package functionalprogramming;

public class JavaKotlinComparison {

    public static void main(String[] args) {

        //count certain condition
        System.out.println(
                MyCollection.INSTANCE.getMyList()
                        .stream()
                        .filter(s -> s.length() > 5)
                        .count()
        ); // 3

        System.out.println(
                MyCollection.INSTANCE.getMyList()
                        .stream()
                        .filter(s -> s.length() == 2)
                        .findFirst()
        ); // Optional[is]
    }
}
