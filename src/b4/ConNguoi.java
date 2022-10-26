package b4;
public class ConNguoi {
    private String hoTen;
    private String tuoi;
    private String hgheNghiep;

    private String soCMND;

    public ConNguoi(String hoTen, String tuoi, String hgheNghiep,  String soCMND) {
        this.setHoTen(hoTen);
        this.setTuoi(tuoi);
        this.setHgheNghiep(hgheNghiep);

        this.setSoCMND(soCMND);
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getHgheNghiep() {
        return hgheNghiep;
    }

    public void setHgheNghiep(String hgheNghiep) {
        this.hgheNghiep = hgheNghiep;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "ConNguoi{" +
                "hoTen='" + getHoTen() + '\'' +
                ", tuoi='" + getTuoi() + '\'' +
                ", hgheNghiep='" + getHgheNghiep() + '\'' +

                ", soCMND='" + getSoCMND() + '\'' +
                '}';
    }


}
