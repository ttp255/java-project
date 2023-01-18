import javax.swing.plaf.synth.Region;

public class Chuoi2 {
    public static void main(String[] args) {
        String s1="Tao la TTP";
        String s2="Tao la TTP";
        String s3="tao la TTP";
        System.out.println("So sanh chuoi 1 vs chuoi 2: "+s1.equals(s2));
        System.out.println("So sanh chuoi 1 vs chuoi 3: "+s1.equals(s3));
        System.out.println("So sanh chuoi 1 vs chuoi 2: "+s1.equalsIgnoreCase(s2));
        System.out.println("So sanh chuoi 1 vs chuoi 3: "+s1.equalsIgnoreCase(s3));
        System.out.println("So sanh chuoi 1 vs chuoi 2: "+s1.compareTo(s2));
        System.out.println("So sanh chuoi 1 vs chuoi 3: "+s1.compareTo(s3));
        System.out.println("So sanh chuoi 1 vs chuoi 2: "+s1.compareToIgnoreCase(s2));
        System.out.println("So sanh chuoi 1 vs chuoi 3: "+s1.compareToIgnoreCase(s3));
       
       
        String a="Tao la TTP";
        String b="a TTP";
        boolean check = a.regionMatches(5, b, 0, 5);
        System.out.println("So sanh vung : "+check);
        String sdt1 ="09055465";
        String sdt2="0905434564";
        System.out.println("Dau so trung vs 09055: "+sdt1.startsWith("09055"));
        System.out.println("Dau so trung vs 0905: "+sdt2.startsWith("0905"));
        String tenFile1="TTP.jpg";
        String tenFile2="TTP.doc";
        if(tenFile1.endsWith(".jpg")==true){
            System.out.println("tenFile1 la file anh");

        }else{
            System.out.println("tenFile1 la file word");

        }
        if(tenFile2.endsWith(".jpg")==true){
            System.out.println("tenFile2 la file anh");

        }else{
            System.out.println("tenFile2 la file word");
            
        }

    }
}
