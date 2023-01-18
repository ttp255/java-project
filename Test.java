import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Sinhvien sv1=new Sinhvien(21388, "Pham Tan Tai", "TTH", 6);
        Sinhvien sv2=new Sinhvien(2354, "Messi", "CNT", 12313);
        Sinhvien sv3 =new Sinhvien(23465, "Aonaldo", "KDl", 5);
        System.out.println("Sinh vien 1 vs 2: "+sv1.compareTo(sv2));
        System.out.println("Sinh vien 1 vs 3: "+sv1.compareTo(sv3));

        Sinhvien a[]= {sv1,sv2,sv3};
        System.out.println("Danh sach ban dau: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Danh sach luc sau: "+Arrays.toString(a));
    }

}
