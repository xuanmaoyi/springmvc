package jackson;

import java.io.IOException;
import java.text.ParseException;  
import com.fasterxml.jackson.databind.ObjectMapper;  
  
public class Json2Obj {  
    public static void main(String[] args) throws ParseException, IOException {  
        String json = "{\"user_name\":\"小民\",\"age\":20,\"birthday\":844099200000,\"email\":\"xiaomin@sina.com\"}";
          
        /** 
         * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。 
         */  
        ObjectMapper mapper = new ObjectMapper();  
        User user = mapper.readValue(json, User.class);  
        System.out.println(user);  
    }  
} 