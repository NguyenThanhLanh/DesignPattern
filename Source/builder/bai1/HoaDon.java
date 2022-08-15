package builder.bai1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHead hoaDonHead;
    private List<CTHD> list;

    public HoaDon(Builder builder) {
        this.hoaDonHead = builder.hoaDonHead;
        this.list = builder.list;
    }
    @Override
    public String toString() {
        String s;
        String k = "";
        s = "HoaDon" + hoaDonHead.toString() +
                "\nlist=";
        for (CTHD cthd : list) {
            k = k + "\n" + cthd.toString();
        }
        return s + k;
    }

    public static class Builder {
        HoaDonHead hoaDonHead;
        List<CTHD> list = new ArrayList<>();

        public Builder addHoaDonHead(HoaDonHead hoaDonHead) {
            this.hoaDonHead = hoaDonHead;
            return this;
        }

        public Builder addCTHD(CTHD cthd) {
            this.list.add(cthd);
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
