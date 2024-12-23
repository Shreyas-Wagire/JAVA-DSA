public class swap {

    public static int get_ith(int n, int i){
        int bitMask = (1<<i);
        if((n & bitMask) == 0){
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static int set_ith(int n, int i){
        int bitMask = (1<<i);
        return n ^ bitMask;
    }

    public static int set2_ith(int n, int i){
        int bitMask = (1<<i);
        return n ^ bitMask;
    }

    public static int clear_ith(int n, int i){
        int bitMask = ~(1<<i);
        return n ^ bitMask;
    }

    public static int update(int n, int i, int newBit){
        n = clear_ith(n, i);
        int bitMask = newBit<<i;
        return n ^ bitMask;
    }

    public static int clearLast(int n, int i){
        int bitMask = -1 << i;
        return n ^ bitMask;
    }

    public static int maskBit(int n, int i, int j){
        int a = ~(0) << (j+1);
        int b = (1<<i) - 1;
        int result = a | b;
        return n ^ result;
    }

    public static void main(String[] args) {
        System.out.println(set_ith(5, 3));
        System.out.println(clear_ith(5, 3));
        System.out.println(clearLast(5, 3));
    }
}
