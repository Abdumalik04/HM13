public class Operativka {
    private String gb;
    private String proizvoditel;

    public Operativka(String gb,String proizvoditel){
        this.gb=gb;
        this.proizvoditel=proizvoditel;
    }

    public String getGb() {
        return gb;
    }

    public void setGb(String gb) {
        this.gb = gb;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    @Override
    public String toString() {
        return "Operativka{" +
                "gb='" + gb + '\'' +
                ", proizvoditel='" + proizvoditel + '\'' +
                '}';
    }
}
