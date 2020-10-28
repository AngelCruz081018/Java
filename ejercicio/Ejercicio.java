
package ejercicio;

public class Ejercicio<T> {
   public static void main(String[] args) {
        
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setT(1);
        integerBox.inspect(2); // error: this is still String!

        Pair<Integer, String> p1 = new OlderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OlderedPair<>(2, "pear");
        boolean same = Method.<Integer, String>compare(p1, p2);
        System.out.println(same);
    }
    
}
