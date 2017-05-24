package jackson;//JSON序列化和反序列化使用的User类
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
/**
 * @JsonRawValue 字符串值是否使用双引号
 *
 * */
public class User {
    @JsonProperty("user_name")
    private String name;  
    private Integer age;  
    private Date birthday;
    @JsonSerialize(using = customerSerialize.class)
    private String email;
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public Integer getAge() {  
        return age;  
    }  
    public void setAge(Integer age) {  
        this.age = age;  
    }  
      
    public Date getBirthday() {  
        return birthday;  
    }  
    public void setBirthday(Date birthday) {  
        this.birthday = birthday;  
    }

    public String getEmail() {
        return email;
    }  
    public void setEmail(String email) {  
        this.email = email;
    }  
} 