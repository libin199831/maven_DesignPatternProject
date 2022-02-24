package structuralPattern.proxy.jdkProxy;

public interface IHttp {
    void request(String sendData);
    void onSuccess(String receivedData);
}
