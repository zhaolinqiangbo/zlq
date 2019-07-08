package com.zlq.hs.service.imp;

import com.zlq.hs.dao.IUserDao;
import com.zlq.hs.emtity.User;
import com.zlq.hs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IUserDao iUserDao;
    public User getUserInfo() {
        return iUserDao.queryAll();
    }
}
