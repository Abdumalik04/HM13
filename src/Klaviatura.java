public class Klaviatura {
    private String podsvetka;
    private String klaviatura;

    public Klaviatura(String podsvetka,String klaviatura){
        this.podsvetka=podsvetka;
        this.klaviatura=klaviatura;
    }


    public String getPodsvetka() {
        return podsvetka;
    }

    public void setPodsvetka(String podsvetka) {
        this.podsvetka = podsvetka;
    }

    public String getKlaviatura() {
        return klaviatura;
    }

    public void setKlaviatura(String klaviatura) {
        this.klaviatura = klaviatura;
    }

    @Override
    public String toString() {
        return
                "podsvetka: " + podsvetka + "\n" +
                "klaviatura: " + klaviatura;

    }
}
