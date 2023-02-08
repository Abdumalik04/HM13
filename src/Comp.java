public class Comp {
private Displei displei;
private String marka;
private  String svet;
private SSD ssd;
private Operativka operativka;
private USB usb;
private String vidioKarta;
private Klaviatura klaviatura;

    public Comp(Displei displei, String marka, String svet, SSD ssd, Operativka operativka, USB usb, String vidioKarta, Klaviatura klaviatura) {
        this.displei = displei;
        this.marka = marka;
        this.svet = svet;
        this.ssd = ssd;
        this.operativka = operativka;
        this.usb = usb;
        this.vidioKarta = vidioKarta;
        this.klaviatura = klaviatura;
    }

    public Displei getDisplei() {
        return displei;
    }

    public void setDisplei(Displei displei) {
        this.displei = displei;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public Operativka getOperativka() {
        return operativka;
    }

    public void setOperativka(Operativka operativka) {
        this.operativka = operativka;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public String getVidioKarta() {
        return vidioKarta;
    }

    public void setVidioKarta(String vidioKarta) {
        this.vidioKarta = vidioKarta;
    }

    public Klaviatura getKlaviatura() {
        return klaviatura;
    }

    public void setKlaviatura(Klaviatura klaviatura) {
        this.klaviatura = klaviatura;
    }

    @Override
    public String toString() {
        return "Computer:\n" +
                "Displei:" + displei +
                "marka: " + marka +"\n"+
                "svet: " + svet +"\n"+
                "ssd: " + ssd +"\n"+
                "operativka: " + operativka +"\n"+
                "usb: " + usb +"\n"+
                "vidioKarta: " + vidioKarta + "\n" +
                "klaviatura: " + klaviatura ;

    }
}
