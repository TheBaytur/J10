public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(":", "foobar", "foo", "bar");
        System.out.println(result);
    }
}

// В версию JDK 8 в класс String был внедрен новый метод join(),
// предназначенный для соединения двух и более символьных строк,
// разграничиваемых указанным разделителем, например, пробелом или запятой