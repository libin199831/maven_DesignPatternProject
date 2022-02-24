package structuralPattern.proxy.cglibProxy;

public class HttpUtil{

    public void request(String sendData) {
        System.out.println(sendData+"请求处理中....");
    }


    public void onSuccess(String receivedData) {
        System.out.println(receivedData+"请求完成！！！！");
    }
}
