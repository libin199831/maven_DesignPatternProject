package structuralPattern.proxy.staticProxy;

public class HttpUtil implements IHttp {
    @Override
    public void request(String sendData) {
        System.out.println("请求处理中....");
    }

    @Override
    public void onSuccess(String receivedData) {
        System.out.println("请求完成！！！！");
    }
}
