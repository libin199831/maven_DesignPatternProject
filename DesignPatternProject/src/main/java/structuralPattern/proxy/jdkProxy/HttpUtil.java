package structuralPattern.proxy.jdkProxy;

public class HttpUtil implements IHttp {
    @Override
    public void request(String sendData) {
        System.out.println(sendData+"请求处理中....");
    }

    @Override
    public void onSuccess(String receivedData) {
        System.out.println(receivedData+"请求完成！！！！");
    }
}
