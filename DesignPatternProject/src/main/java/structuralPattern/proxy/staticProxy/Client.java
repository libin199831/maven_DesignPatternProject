package structuralPattern.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {

        HttpProxy httpProxy=new HttpProxy(new HttpUtil());

        httpProxy.request("1111111");
        httpProxy.onSuccess("2222");

    }
}
