package buoi3test;

public class thongtin {
    private String name;
    private String phoneNumber;

    public thongtin(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public static thongtin createThongtin(String name, String phoneNumber){
        return new thongtin(name, phoneNumber);
    }

        public String getName(){return name;}
        public String getPhoneNumber(){return phoneNumber;}

}
