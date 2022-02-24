package graphicDesignPatterns.mediatorPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user,String message){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str=sdf.format(new Date());

        System.out.println(str+" "+user.getName()+":"+message);
    }
}
