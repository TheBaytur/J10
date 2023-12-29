public class SubstringDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Moscow!!!".substring(10));
        System.out.println("Welcome to Moscow!!!".substring(10, 18));
    }
}

// Метод substring() вырезает подстроку из строки, используя указанные позиции.
// Существует два варианта этого метода.
// Первый вариант вырезает от указанной позиции и до конца. Второй - от первой позиции до второй. Символ,
// находящийся в первой позиции, будет включен в результирующую строку. А последний - нет
