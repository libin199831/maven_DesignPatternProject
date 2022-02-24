package structuralPattern.decoratorPattern.beautyDecorator;

public class NeckDecorator implements Ibeauty{
    private final Ibeauty me;

    public NeckDecorator(Ibeauty me){
        this.me=me;
    }
    @Override
    public int getBeautyValue() {
        return me.getBeautyValue()+30;
    }
}
