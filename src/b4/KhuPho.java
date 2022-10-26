package b4;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
     List<HoGiaDinh> hoGiaDinh;
     List<ConNguoi> conNguois;
    public KhuPho() {
        this.hoGiaDinh = new ArrayList<>();
    }

    public List<HoGiaDinh> getHoGiaDinh() {
        return hoGiaDinh;
    }
    public void setHoGiaDinh(List<HoGiaDinh> hoGiaDinh) {
        this.hoGiaDinh = hoGiaDinh;
    }
    public void themGiaDinh(HoGiaDinh hoGiaDinh1){
        this.hoGiaDinh.add(hoGiaDinh1);
    }

    public void hienThi(){
        this.hoGiaDinh.forEach(o->System.out.println(o.toString()));

    }



}
