package createPattern.clonePattern;

public class MilkTea implements Cloneable{
    private String type;
    private Boolean ice;

    public MilkTea(String type, Boolean ice) {
        this.type = type;
        this.ice = ice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIce() {
        return ice;
    }

    public void setIce(Boolean ice) {
        this.ice = ice;
    }

    @Override
    protected MilkTea clone() throws CloneNotSupportedException {
        String str=new String(this.type);

        return new MilkTea(str,this.ice);
    }
}
