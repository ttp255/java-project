import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ruttham {
    Set<String> thungPhieuTrungThuong =new TreeSet<>();

    public ruttham() {
       
    }
    public void themPhieu(String giaTri){
        this.thungPhieuTrungThuong.add(giaTri);
    }
    public void xoaPhieu(String giaTri){
        this.thungPhieuTrungThuong.remove(giaTri);

    }
    public boolean KiemTraPhieuTonTai(String giaTri){
        return this.thungPhieuTrungThuong.contains(giaTri);
    }
    public void xoaTatCaCacPhieu(){
        this.thungPhieuTrungThuong.clear();
    }
    public int laySoLuongPhieu(){
        return this.thungPhieuTrungThuong.size();
    }
    public String RutMotPhieu(){
        String ketQua="";
        Random rd =new Random();
        int viTri= rd.nextInt(this.thungPhieuTrungThuong.size());
        ketQua= (String) this.thungPhieuTrungThuong.toArray()[viTri];
        return ketQua;
    }
    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuTrungThuong.toArray()));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int luaChon=0;
        ruttham rt =new ruttham();
        do{
            System.out.println("--------------------------------------");
                System.out.println("MENU: ");
                System.out.println("1. Thêm mã số dự thưởng.");
                System.out.println("2. Xóa mã số dự thưởng.");
                System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
                System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
                System.out.println("5. Số lượng phiếu dự thưởng.");
                System.out.println("6. Rút thăm trúng thưởng.");
                System.out.println("7. In ra tất cả các phiếu.");
                System.out.println("0. Thoát khỏi chương trình");
                luaChon = sc.nextInt();
                sc.nextLine();
             if(luaChon==1 || luaChon==2 || luaChon==3){
                System.out.print("nhap ma so: ");
                String giaTri= sc.nextLine();
                if(luaChon==1){
                    rt.themPhieu(giaTri);

                }else if(luaChon==2){
                    rt.xoaPhieu(giaTri);
                }else if(luaChon ==3){
                  System.out.println("Kiem tra ma co ton tai: "+rt.KiemTraPhieuTonTai(giaTri));
                }
            
                
            }else if(luaChon==4){
                rt.xoaTatCaCacPhieu();
            }else if(luaChon==5){
                System.out.println("So luong phieu la: "+rt.laySoLuongPhieu());

            }else if(luaChon==6){
                System.out.println("Ma trung thuong la: "+rt.RutMotPhieu());
            }else if(luaChon==7){
                rt.inTatCa();
            }

                

        }while(luaChon!=0);
    }
        
    
}
