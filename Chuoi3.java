import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Chuoi3 {
    public static void main(String[] args) {
        String s1="Tao la TTP, Tao la Tai";
        String s2="Tao la Tai";
        String s3="Tao la ";
        String s4="Tai";
        System.out.println("Vi tri chuoi s3 trong s1: "+s1.indexOf(s3,6));
        System.out.println("Vi tri chuoi s3 trong s1: "+s1.indexOf(s2));
        System.out.println("Vi tri chuoi s3 trong s1: "+s1.lastIndexOf(s2));
        System.out.println("Vi tri chuoi s3 trong s1: "+s1.lastIndexOf(s4));
        String s5= s3+s4;
        String s6=s3.concat(s4);
        System.out.println(s5);
        System.out.println(s6);
        String a ="TTP la tao";
        String b= a.replaceAll("TTP", "Tai");
        System.out.println(b);
        String s7=s1.substring(5);
        System.out.println(s7);
        String s8=s1.substring(5, 11);
        System.out.println(s8);


    }
}
