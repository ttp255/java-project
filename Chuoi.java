import java.util.Scanner;

/**
 * Chuoi
 */
public class Chuoi {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s;
    System.out.print("nhap chuoi: ");
    s=sc.nextLine();
     int doDai=s.length();
     System.out.println("do dai chuoi la: "+doDai);
    for(int i=0;i<doDai;i++){
        System.out.println("vi tri "+i +" la "+s.charAt(i));
    }
    String s1="Tao la TTP";
    String s2 ="tao la TTP";
    String s3="Tao la TTP";
    System.out.println("So sanh chuoi 1 vs chuoi 2: "+s1.compareTo(s2));
    System.out.println("So sanh chuoi 1 vs chuoi 3: "+s1.compareTo(s3));
    System.out.println("So sanh chuoi 1 vs chuoi 2: "+s1.compareToIgnoreCase(s2));
    System.out.println("So sanh chuoi 1 vs chuoi 3: "+s1.compareToIgnoreCase(s3));

 }
    

    
}