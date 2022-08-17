package Buoi6.Bsi1;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String bac) {
        super();
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }
    public void input(){
        System.out.print("nhap cap bac: ");
        bac=scanner.nextLine();
        super.input();
    }
    public void output(){
        super.output();
        System.out.printf("%-15s\n",bac);
    }
    @Override
    public String toString(){
        return super.toString()+"Cap bac :"+this.bac;
    }
}
