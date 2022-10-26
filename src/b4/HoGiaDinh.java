package b4;
import java.util.List;

public class HoGiaDinh {
    private List<ConNguoi>conNguoi;
    private String soNha;

    public HoGiaDinh(List<ConNguoi> conNguoi, String soNha) {
        this.setConNguoi(conNguoi);
        this.setSoNha(soNha);
    }

    public HoGiaDinh() {

    }

    public List<ConNguoi> getConNguoi() {
        return conNguoi;
    }

    public void setConNguoi(List<ConNguoi> conNguoi) {
        this.conNguoi = conNguoi;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }



    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "conNguoi=" + conNguoi +
                ", soNha='" + soNha + '\'' +
                '}';
    }


}
