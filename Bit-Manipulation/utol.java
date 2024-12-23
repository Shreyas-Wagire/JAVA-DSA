public class utol {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=ch; i<='Z';i++){
            System.out.println((char)(i | ' '));
        }
    }
}
