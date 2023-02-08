public class Main {
    public static void main(String[] args) {
Klaviatura klaviatura=new Klaviatura("No","Yes");
USB usb=new USB(3.0,"241453");
Operativka operativka=new Operativka("8","454");
SSD ssd=new SSD(244,1);
Displei displei=new Displei("70/30","10","Cor I3");
Comp comp=new Comp(displei,"Lenovo 15-I","Blue",ssd,operativka,usb,"netu",klaviatura);
        System.out.println(comp);
    }
}