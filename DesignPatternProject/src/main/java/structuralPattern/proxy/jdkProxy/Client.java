package structuralPattern.proxy.jdkProxy;


public class Client {
    public static void main(String[] args) {

        ProxyFactory proxy=new ProxyFactory(new HttpUtil());
        IHttp ihttp=proxy.getProxyObject();
        ihttp.request("1111111");
        ihttp.onSuccess("2222");

    }
}
