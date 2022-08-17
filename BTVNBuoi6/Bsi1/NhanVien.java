package Buoi6.Bsi1;

public class NhanVien extends CanBo {
    private String congviec;

    public NhanVien() {
    }

    public NhanVien(String congviec) {
        this.congviec = congviec;
    }

    public NhanVien(int id, String hoten, int namsinh, String gioitinh, String diachi, String congviec) {
        super(id, hoten, namsinh, gioitinh, diachi);
        this.congviec = congviec;
    }

    public void input(){
        super.input();
        System.out.print("Nhap cong viec: ");
        congviec=scanner.nextLine();

    }
    public void output(){
        super.output();
        System.out.printf("%-15s\n",congviec);

    }

     @Override
    public String toString(){
        return super.toString()+"\nCong viec: "+this.congviec;
     }
}
