import java.io.File;
import java.util.Scanner;

/**
 * Test5
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DanhSachSinhVien dssv=new DanhSachSinhVien();
        int luaChon=0;
        do{
            System.out.println("Menu----------");
            System.out.println("Xin moi lua chon");
            System.out.println(
             "1.	Thêm sinh viên vào danh sách.\n"
            + "2.	In danh sách sinh viên ra màn hình.\n"
            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
            + "5.	Làm rỗng danh sách sinh viên.\n"
            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
            + "10	Luu sinh vien xuong file.\n"
            + "11.  Doc sinh vien tu file\n"
            + "0.   Thoát khỏi chương trình");
            luaChon=sc.nextInt();
            sc.nextLine();
            if(luaChon==1){
               
                System.out.println("nhap ma sinh vien");String maSinhVien=sc.nextLine();
                
               
                System.out.println("nhap ho va ten");  String hoTen=sc.nextLine();
              
                
                System.out.println("nhap nam Sinh");  int nam=sc.nextInt();
              
                System.out.println("nhap diem trung binh");   double diemTrungBinh=sc.nextDouble();
             
               
                SinhVien1 sv=new SinhVien1(maSinhVien, hoTen, nam, diemTrungBinh);
                dssv.themSinhVien(sv);
            }else if(luaChon==2){
                dssv.InDanhSachSinhVien();
            }else if(luaChon==3){
                System.out.println( dssv.KiemTraDanhSachRong());
               
                
            }else if(luaChon==4){
                System.out.println(  dssv.LayRaSoLuong());
              
            }else if(luaChon==5){
                dssv.lamRong();
            }else if(luaChon==6){
                
                System.out.println("nhap ma Sinh Vien: ");String maSinhVien=sc.nextLine();
                SinhVien1 sv=new SinhVien1(maSinhVien);
                System.out.println("Kiem tra Sinh Vien co ton tai: "+dssv.kiemTraTonTai(sv));
            }else if(luaChon==7){
                
                System.out.println("nhap ma Sinh Vien");String maSinhVien=sc.nextLine();
                SinhVien1 sv=new SinhVien1(maSinhVien);
                dssv.xoaSinhVien(sv);
            }else if(luaChon==8){
                System.out.println("nhap ho va ten");String hoTen=sc.nextLine();
                System.out.println("Ket qua tim kiem");
                dssv.timSinhVien(hoTen);
            }else if(luaChon==9){
                dssv.sapXepTangDan();
            }else if(luaChon==10){
              System.out.println("nhap ten file");
              String tenFile=sc.nextLine();
              File f=new File(tenFile);
              dssv.ghiDoiTuong(f);
            }else if(luaChon==11){
                System.out.println("nhap ten File");
                String tenFile =sc.nextLine();
                File f=new File(tenFile);
                dssv.DocSinhVien(f);
            }

        }  while(luaChon!=0);
       

        

          
      
           
            
        }
    }
    
