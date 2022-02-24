package structuralPattern.decoratorPattern.beautyDecorator;

public class Beautytest {
    public static void main(String[] args) {
        Ibeauty me=new me();
        Ibeauty rm=new RingDecorator(me);
        Ibeauty nrm=new NeckDecorator(rm);

        System.out.println(me.getBeautyValue());

        System.out.println(rm.getBeautyValue());

        System.out.println(nrm.getBeautyValue());
    }
}
