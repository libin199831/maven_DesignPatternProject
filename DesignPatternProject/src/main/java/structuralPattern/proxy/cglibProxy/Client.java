package structuralPattern.proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {
        ProcyFactory procyFactory=new ProcyFactory();
        HttpUtil httpUtil=procyFactory.getProxyObject();

        httpUtil.request("123456");
        httpUtil.onSuccess("456789");
    }
}
