package structuralPattern.facadePattern;

public class Test {
    public static void main(String[] args) {
        Facade facade=new Facade();
        System.out.println("上班");
        facade.open();

        System.out.println("---------------------------------");
        System.out.println("下班");
        facade.close();
    }
}
