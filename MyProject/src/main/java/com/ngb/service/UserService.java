package com.ngb.service;

import com.ngb.dao.IUserDao;
import com.ngb.vo.UserDetailVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{

  @Autowired
  private IUserDao userDao;

  public List<UserDetailVO> findAll()
  {
    return this.userDao.findAll();
  }

  public boolean checkLogin(String name, String password) {
    UserDetailVO vo = this.userDao.checkLogin(name, password);

    return vo != null;
  }
}