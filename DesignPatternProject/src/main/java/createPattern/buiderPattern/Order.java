package createPattern.buiderPattern;

public class Order {
    public static void main(String[] args) {
        MilkTea milkTea= new MilkTea.Builder("原味").build();
        System.out.println(milkTea);
        MilkTea myMT=new MilkTea.Builder("巧克力味").size("大杯").ice(false).pearl(false).build();
        System.out.println(myMT);

    }
}
