package com.grouppdzs.shop.Service;
import java.util.UUID;
import com.grouppdzs.shop.Util.teaUtil;
import com.grouppdzs.shop.model.Users;
import org.springframework.stereotype.Service;


public interface UserService {
    public int register(String username,String password);
    public int login(String username,String password);
    public String getID(String username);
    public Users getUser(String userid);



}
