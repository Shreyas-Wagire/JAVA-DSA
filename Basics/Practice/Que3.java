package Practice;
import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the cost of the pencil: ");
        float pencil = sc.nextFloat();
        
        System.out.print("Enter the cost of the pen: ");
        float pen = sc.nextFloat();
        
        System.out.print("Enter the cost of the eraser: ");
        float eraser = sc.nextFloat();
        
        // Calculate total and GST
        float total = pencil + pen + eraser;
        float gst = total * 0.18f;
        float finalTotal = total + gst;
        
        // Output the results
        System.out.println("Total cost before GST: " + total);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final bill with GST: " + finalTotal);
        
        sc.close();  // Close the scanner after use
    }
}
