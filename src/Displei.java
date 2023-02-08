public class Displei {
    private String dioganal;
    private String proizvoditel;
    private String matrisa;
    public Displei(String dioganal,String proizvoditel,String matrisa){
        this.dioganal=dioganal;
        this.proizvoditel=proizvoditel;
        this.matrisa=matrisa;
    }

    public String getDioganal() {
        return dioganal;
    }

    public void setDioganal(String dioganal) {
        this.dioganal = dioganal;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getMatrisa() {
        return matrisa;
    }

    public void setMatrisa(String matrisa) {
        this.matrisa = matrisa;
    }

    @Override
    public String toString() {
        return "Displei{" +
                "dioganal='" + dioganal + '\'' +
                ", proizvoditel='" + proizvoditel + '\'' +
                ", matrisa='" + matrisa + '\'' +
                '}';
    }
}
