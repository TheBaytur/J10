public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Для работы со строками в языке Java используются "
                + "классы String, StringBuilder, StringBuffer.";

        System.out.println(s);
        System.out.println("indexOf(S) = "
                + s.indexOf('S'));
        System.out.println("lastIndexOf(r) = "
                + s.lastIndexOf('r'));
        System.out.println("indexOf(String) = "
                + s.indexOf("String"));
        System.out.println("lastIndexOf(String) = "
                + s.lastIndexOf("String"));
        System.out.println("indexOf(S, 60) = "
                + s.indexOf('S', 60));
        System.out.println("lastIndexOf(S, 70) = "
                + s.lastIndexOf('S', 70));
    }
}

//В класс String включена поддержка поиска определенного символа или подстроки,
// для этого в нем имеются два метода — indexOf() и lastIndexOf().
//indexOf() - ищет первое вхождение символа или подстроки.
//lastlndexOf() - ищет последнее вхождение символа или подстроки.
//Каждый из этих методов возвращает индекс того символа, который вы хотели найти,
// либо индекс начала искомой подстроки. В любом случае, если поиск оказался неудачным,
// методы возвращают значение -1.
