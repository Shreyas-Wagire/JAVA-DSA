public class substring {

    public static String subsSrring(String str, int si, int ei){
        String res = "";
        for(int i = si; i<ei; i++){
            res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "shreyas";
        System.out.println(str.substring(0, 5));
    }
}
