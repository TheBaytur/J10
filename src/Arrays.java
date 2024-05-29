import java.util.ArrayDeque; // Modified Arrays

class Arrays {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        // Using offer()
        animals.offer("Dog");

        // Using offerFirst()
        animals.offerFirst("Cat");

        // Using offerLast()
        animals.offerLast("Horse");
        System.out.println("ArrayDeque: " + animals);
    }
}