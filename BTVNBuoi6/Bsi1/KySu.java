package Buoi6.Bsi1;

public class KySu extends CanBo {
    private String Nganh;

    public KySu(String nganh) {
        super();
        Nganh = nganh;
    }

    public KySu() {
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public void input(){
        System.out.print("Nhap nganh:");
        Nganh=scanner.nextLine();
        super.input();
    }
    public void output(){
        super.output();
        System.out.printf("%-15s\n",Nganh);
    }
    @Override
    public String toString(){
        return super.toString()+"\nNganh: "+this.Nganh;
    }

}
