import java.io.File;
import java.util.Scanner;

public class VdFile {
    File file;

    public VdFile(String tenFile) {
        this.file=new File(tenFile);
    }
    public boolean KiemTraThucThi(){
        return this.file.canExecute();
    }
    public boolean KiemTraDoc(){
        return this.file.canRead();
    }
    public boolean KiemTraViet(){
        return this.file.canWrite();
    }
    public void InDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }

    public void InTenFile(){
        System.out.println(this.file.getName());
    }

    public void KiemTraThuMucHayTapTin(){
        if(this.file.isDirectory()){
            System.out.println("Day la thuc muc");
        }else if(this.file.isFile()){
            System.out.println("Day la File");
        }
    }
    public void InFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Cac tap tin/cac thu muc con la");
            File[] mangCon= this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(this.file.getAbsolutePath());
            }
        }else if(this.file.isFile()){
            System.out.println("Day la tap tin k phai thu muc");
        }
    }
    public void InCayThuMuc(){
        this.InChiTietCayThuMuc(this.file, 1);
    }
    public void InChiTietCayThuMuc( File f, int bac){
        for(int i=0;i<bac;i++){
            System.out.print("\t");
        }
        System.out.print("|__");

        System.out.println(f.getName());
        if(f.canRead() && f.isDirectory()){
            File[] mangCon=f.listFiles();
            for (File fx : mangCon) {
                    InChiTietCayThuMuc(f, bac+1);
            }
        }
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("Nhap tên file: ");
		String tenFile = sc.nextLine();
		VdFile vdf = new VdFile(tenFile);

		do {
			System.out.println("MENU ---------- ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7. In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình.");
			luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println(vdf.KiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.KiemTraDoc());
                    break;
                case 3:
                    System.out.println(vdf.KiemTraViet());
                    break;
                case 4:
                    vdf.InDuongDan();
                    break;
                case 5:
                    vdf.InTenFile();;
                    break;
                case 6:
                   vdf.KiemTraThuMucHayTapTin();
                    break;
                 case 7:
                   vdf.InFileCon();
                    break;
                case 8:
                    vdf.InCayThuMuc();
                    break;
                default:


                    break;
            }
            sc.nextLine();
        
        }   while(luaChon!=0);
    }
}

   
    


