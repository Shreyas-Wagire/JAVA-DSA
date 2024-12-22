package Practice;
public class Que2 {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        
        // First condition
        if (x > y && y > z) {
            System.out.println("Hello");
        }

        // Second condition
        if (z > y && z < x) {
            System.out.println("Java");
        }

        // Third condition
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
    }
}
