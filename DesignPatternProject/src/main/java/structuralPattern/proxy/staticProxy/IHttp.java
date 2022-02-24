package structuralPattern.proxy.staticProxy;

public interface IHttp {
    void request(String sendData);
    void onSuccess(String receivedData);
}
