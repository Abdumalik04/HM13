public class SSD {
    private int ssd;
    private int disk;
    public  SSD(int ssd,int disk){
        this.disk=disk;
        this.ssd=ssd;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return  ssd +"\n"+
                "disk: " + disk ;

    }
}
