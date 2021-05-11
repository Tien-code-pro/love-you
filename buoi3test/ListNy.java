package buoi3test;


import java.util.ArrayList;

public class ListNy {
    private String myNumber;
    private ArrayList <thongtin> myContacts;

    public ListNy(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<thongtin>();
    }

    public boolean addNewThongtin(thongtin thongtin){
        if (TimThongtin(thongtin.getName()) >= 0){
            System.out.println("Ny này của bạn đã có trong danh sách rồi!");
            return false;
        }
        myContacts.add(thongtin);
        return true;
    }

    public boolean updateThontin(thongtin ThongTinCu, thongtin ThongTinMoi){
        int KiemThongTin = TimThongtin(ThongTinCu);
        if(KiemThongTin < 0){
            System.out.println(ThongTinCu.getName()+ ", khum tìm thấy!");
            return false;
        }
        this.myContacts.set(KiemThongTin,ThongTinMoi);
        System.out.println(ThongTinCu.getName()+" đã dược thay đổi thành: "+ThongTinMoi.getName());
        return true;
    }

    public boolean XoaThongTin(thongtin thongtin){
        int KiemThongTin = TimThongtin(thongtin);
        if(KiemThongTin < 0){
            System.out.println(thongtin.getName()+ ", khum tìm thấy!.");
            return false;
        }
        this.myContacts.remove(KiemThongTin);
        System.out.println(thongtin.getName()+",đã xóa thành công Ny bạn ra khỏi danh sách :((");
        return true;
    }


    private int TimThongtin(thongtin thongtin){
        return this.myContacts.indexOf(thongtin);
    }
    private int TimThongtin(String TenThongTin){
        for (int i=0; i < this.myContacts.size(); i++){
            thongtin thongtin = this.myContacts.get(i);
            if (thongtin.getName().equals(TenThongTin)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(thongtin thongtin){
        if (TimThongtin(thongtin) >= 0){
            return thongtin.getName();
        }
        return null;
    }

    public thongtin queryContact(String name){
        int position = TimThongtin(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

//lấy ra thông tin từ chỗ nhập lúc đầu
    public void InRaThongTin(){
        System.out.println("Ny hiện tại của bạn: Ngọc");
        System.out.println("Số phone của Ngọc: "+myNumber);
        for (int i =0; i< this.myContacts.size();i++){
            System.out.println((i+1)+". Người yêu tiếp theo là: "+ this.myContacts.get(i).getName()+" -> phone: "+ this.myContacts.get(i).getPhoneNumber());

        }
    }


}
