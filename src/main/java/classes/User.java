package classes;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private UserSex sex;
    private List<User> friends;
    
    public User(String name, Integer age, UserSex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
