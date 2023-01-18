import java.lang.reflect.Array;
import java.util.Arrays;

public class Mang {
    public static void main(String[] args) {
        int mangA[]={1,2,3};
        int mangB[]=mangA;
        mangB[0]=100;
        int mangC[]=mangA.clone();
        mangC[2]=600;
        int mangD[]=new int[mangA.length];
        System.arraycopy(mangA, 0, mangD, 0, mangA.length);
        System.out.println("mangA: "+Arrays.toString(mangA));
        System.out.println("mangB: "+Arrays.toString(mangB));
        System.out.println("mangC: "+Arrays.toString(mangC));
        System.out.println("mangD: "+Arrays.toString(mangD));
        String doiTuong[]={"T","T","P"};
        String abc[]=doiTuong.clone();
        abc[0]="P";
        System.out.println("Mang doi tuong la: "+Arrays.toString(doiTuong));

        System.out.println("Mang abc la: "+Arrays.toString(abc));

    }     

}
