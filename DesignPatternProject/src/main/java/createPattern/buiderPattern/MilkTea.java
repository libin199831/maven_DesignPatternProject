package createPattern.buiderPattern;

public class MilkTea {
    private String type;
    private String size;
    private boolean ice;
    private boolean pearl;

    private MilkTea(Builder builder){
        this.type= builder.type;
        this.size= builder.size;
        this.ice= builder.ice;
        this.pearl= builder.pearl;

    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", ice=" + (ice?"加冰":"不加冰") +
                ", pearl=" + (pearl?"加珍珠":"不加珍珠") +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isIce() {
        return ice;
    }

    public boolean isPearl() {
        return pearl;
    }

   public static class Builder{
       private String type="原味";
       private String size="中杯";
       private boolean ice=true;
       private boolean pearl=true;

       public Builder(String type){
           this.type=type;
       }
       public Builder size(String size){
           this.size=size;
           return this;
       }
       public Builder ice(boolean ice){
           this.ice=ice;
           return this;
       }
       public Builder pearl(boolean pearl){
           this.pearl=pearl;
           return this;
       }
       public MilkTea build(){
           return new MilkTea(this);
       }

   }


}
