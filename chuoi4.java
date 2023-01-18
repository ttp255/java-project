import java.util.Arrays;

public class chuoi4 {
    public static void main(String[] args) {
        String s="Xin chao cac ban, tui la TTP";
        String a[]=s.split(" ");
        String b[]=s.split(",");
        String d="Xin chao cac ban, tui la Tai.T hoc KDL";
        String c[]=d.split("\\,|\\.");
        String t="Pham Tan Tai";
        String e[]=t.split(" ");
       
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println("Ten: "+e[e.length-1]);

    }
    
}
