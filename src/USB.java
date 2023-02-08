public class USB {
    private double tipPorta;
    private String idPort;

    public  USB(double tipPorta,String idPort){
        this.idPort=idPort;
        this.tipPorta=tipPorta;
    }

    public double getTipPorta() {
        return tipPorta;
    }

    public void setTipPorta(double tipPorta) {
        this.tipPorta = tipPorta;
    }

    public String getIdPort() {
        return idPort;
    }

    public void setIdPort(String idPort) {
        this.idPort = idPort;
    }

    @Override
    public String toString() {
        return "USB{" +
                "tipPorta=" + tipPorta +
                ", idPort='" + idPort + '\'' +
                '}';
    }
}
