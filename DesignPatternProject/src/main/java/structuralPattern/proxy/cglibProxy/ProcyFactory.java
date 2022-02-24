package structuralPattern.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProcyFactory implements MethodInterceptor {

    private HttpUtil httpUtil=new HttpUtil();

    public HttpUtil getProxyObject(){
        Enhancer enhancer=new Enhancer();
        //父类字节码
        enhancer.setSuperclass(httpUtil.getClass());

        enhancer.setCallback(this);

        HttpUtil proxyObject=(HttpUtil) enhancer.create();

        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj=method.invoke(httpUtil,objects);
        return obj;
    }
}
