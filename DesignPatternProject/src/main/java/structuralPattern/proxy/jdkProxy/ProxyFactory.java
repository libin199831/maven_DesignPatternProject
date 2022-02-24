package structuralPattern.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private HttpUtil httpUtil;

    public ProxyFactory(HttpUtil httpUtil){
        this.httpUtil=httpUtil;
    }

    public IHttp getProxyObject(){
        /**
         * newProxyInstance(ClassLoader loader,类加载器
         *                  Class<?>[] interfaces,接口字节码对象
         *                  InvocationHandler h)  代理对象的调用处理程序
         */

        IHttp proxyObject=(IHttp) Proxy.newProxyInstance(
                httpUtil.getClass().getClassLoader(),
                httpUtil.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("invoke");
                        Object obj=method.invoke(httpUtil,args);
                        return obj;
                    }
                }
        );

        return proxyObject;
    }
}
