import java.util.Scanner;
import java.util.Stack;

public class stack {
   public static void main(String[] args) {
      Stack StackChuoi = new Stack();
      Scanner sc = new Scanner(System.in);
      System.out.println("nhap chuoi: ");
      String s;
      s = sc.nextLine();

      for (int i = 0; i < s.length(); i++) {
         StackChuoi.push(s.charAt(i) + "");
      }
      System.out.println("Chuoi dao nguoc la: ");

      for (int i = 0; i < s.length(); i++) {
         System.out.print(StackChuoi.pop());
      }
      System.out.println();
      System.out.println("nhap vao so nguyen: ");
      int j = sc.nextInt();
      Stack StackSoDu = new Stack<>();
      while (j > 0) {
         int soDu = j % 2;
         StackSoDu.push(soDu);
         j = j / 2;
      }
      System.out.println("So nhi phan: ");
      int n = StackSoDu.size();
      for (int i = 0; i < n; i++) {
         System.out.print(StackSoDu.pop());
      }
   }

}
