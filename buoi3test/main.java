package buoi3test;


import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static ListNy listNy = new ListNy("0352787827");

    public static void main(String[] args) {
        boolean quit = false;
//        startPhone();
        InRadanhSach();
        while (!quit){
            System.out.println("\nChọn 1 trong 6 ý trên ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){

                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    listNy.InRaThongTin();
                    break;
                case 2:
                    ThongTinNyMoi();
                    break;
                case 3:
                    LamMoiNy();
                    break;
                case 4:
                    XoaNy();
                    break;
                case 5:
                    TimLaiNy();
                    break;
                case 6:
                    InRadanhSach();
                    break;
            }
        }
    }

    private static void ThongTinNyMoi(){
        System.out.println("Nhap ten Ny moi cua ban: ");
        String name = scanner.nextLine();
        System.out.println("So dien thoai cua co ay: ");
        String phone = scanner.nextLine();
        thongtin ThongTinMoi = thongtin.createThongtin(name,phone);
        if (listNy.addNewThongtin(ThongTinMoi)){
            System.out.println("Ny mới của bạn tên: "+name+", số điện thoại của cô ấy: "+phone);
        }else {
            System.out.println("Không thể thêm "+ name+" vì cô ấy đã có trong danh sách! ");
        }
    }

    private static void LamMoiNy(){
        System.out.println("Nhap ten Ny cua ban cần thay đổi: ");
        String name = scanner.nextLine();
        thongtin existingContactRecord = listNy.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Không tìm thấy Ny bạn. ");
            return;
        }
        System.out.println("Nhap ten Ny moi cua ban: ");
        String newName = scanner.nextLine();
        System.out.println("So điện thoại mới của cô ấy: ");
        String newNumber = scanner.nextLine();
        thongtin Thongtinmoi = thongtin.createThongtin(newName,newNumber);
        if (listNy.updateThontin(existingContactRecord,Thongtinmoi)){
            System.out.println("Đã thêm Ny bạn vào danh sách :))");
        }else {
            System.out.println("Enter updating record.");
        }
    }

    private static  void  XoaNy(){
        System.out.println("Nhập tên Ny của bạn mà bạn muốn xóa: ");
        String name = scanner.nextLine();
        thongtin exitingContactRecord = listNy.queryContact(name);
        if(exitingContactRecord == null){
            System.out.println("Thật tiếc cô ấy không có trong danh sách! ");
            return;
        }
        if(listNy.XoaThongTin(exitingContactRecord)){
            System.out.println("Đã đuổi con Ny bạn ra khỏi danh sách. ");
        }else {
            System.out.println("Ny bạn xóa không thành công ");
        }
    }

    private static void TimLaiNy(){
        System.out.println("Nhập tên Ny bạn muốn tìm lại!");
        String name = scanner.nextLine();
        thongtin exitingContactRecord = listNy.queryContact(name);
        if (exitingContactRecord == null){
            System.out.println("Thật tiếc không tìm thấy cô ấy.");
            return;
        }
        System.out.println("Ny bạn tên: "+exitingContactRecord.getName()
                +" -> Còn đây là số phone Ny bạn: "+exitingContactRecord.getPhoneNumber());

    }

//    private static void startPhone(){
//        System.out.println("Starting phone....");
//    }

    private static void InRadanhSach(){
        System.out.println("Danh sách mà bạn cần biết! \n");
        System.out.println("0 - kết thúc\n"
                +"1 - In ra danh sách Ny bạn\n"
                +"2 - Tạo thêm Ny mới\n"
                +"3 - Chỉnh sửa thông tin Ny bạn\n"
                +"4 - Xóa Ny bạn ra khỏi danh sách\n"
                +"5 - Tìm Ny bạn nếu có \n"
                +"6 - In ra danh sách .");
        System.out.println("Mời bạn chọn : ");
    }

}
