package createPattern.clonePattern;

public class Order {
    public static void main(String[] args) throws Exception {
        MilkTea milkTeaJar=new MilkTea("原味",true);

        MilkTea myMilkTea=milkTeaJar.clone();

        System.out.println(milkTeaJar.getType()==myMilkTea.getType());


    }
}
