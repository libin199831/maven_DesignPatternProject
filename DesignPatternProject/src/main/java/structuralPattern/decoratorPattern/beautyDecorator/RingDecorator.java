package structuralPattern.decoratorPattern.beautyDecorator;

public class RingDecorator implements Ibeauty {
    private final Ibeauty me;

    public RingDecorator(Ibeauty me){
        this.me=me;
    }
    @Override
    public int getBeautyValue() {
        return me.getBeautyValue()+20;
    }
}
