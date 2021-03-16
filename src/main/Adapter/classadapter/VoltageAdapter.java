package Adapter.classadapter;

/**适配者类*/
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        int srcV = output220V();
        //转成5V
        int dstV = srcV/44;
        return dstV;
    }
}
