package com.ngb.service;

import com.ngb.dao.IUserFunctionMenuDao;
import com.ngb.vo.UserFunctionMenuVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionMenuService
{

  @Autowired
  private IUserFunctionMenuDao menuDao;

  public List<UserFunctionMenuVO> findAll()
  {
    List<UserFunctionMenuVO> vos = this.menuDao.findAll();
    for (UserFunctionMenuVO vo : vos) {
      treeChildrenNode(vo);
    }
    return vos;
  }

  private void treeChildrenNode(UserFunctionMenuVO vo)
  {
    String id = vo.getId();
    List<UserFunctionMenuVO> childrenVOs = this.menuDao.findByPID(id);
    for (UserFunctionMenuVO tmp : childrenVOs) {
      treeChildrenNode(tmp);
    }
    vo.setChildren(childrenVOs);
  }
}