package com.ngb.dao;

import com.ngb.vo.UserFunctionMenuVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public abstract interface IUserFunctionMenuDao
{
  @Select({"SELECT * FROM USER_FUNCTION_MENU WHERE UFM_PID IS NULL"})
  @Results({@org.apache.ibatis.annotations.Result(id=true, column="UFM_ID", property="ufmID"), @org.apache.ibatis.annotations.Result(column="UFM_PID", property="ufmPID"), @org.apache.ibatis.annotations.Result(column="UFM_CODE", property="ufmCode"), @org.apache.ibatis.annotations.Result(column="UFM_DETAIL", property="ufmDetail"), @org.apache.ibatis.annotations.Result(id=true, column="UFM_ID", property="id"), @org.apache.ibatis.annotations.Result(column="UFM_DETAIL", property="text")})
  public abstract List<UserFunctionMenuVO> findAll();

  @Select({"SELECT * FROM USER_FUNCTION_MENU WHERE UFM_ID = #{id}"})
  @Results({@org.apache.ibatis.annotations.Result(id=true, column="UFM_ID", property="ufmID"), @org.apache.ibatis.annotations.Result(column="UFM_PID", property="ufmPID"), @org.apache.ibatis.annotations.Result(column="UFM_CODE", property="ufmCode"), @org.apache.ibatis.annotations.Result(column="UFM_DETAIL", property="ufmDetail"), @org.apache.ibatis.annotations.Result(id=true, column="UFM_ID", property="id"), @org.apache.ibatis.annotations.Result(column="UFM_DETAIL", property="text")})
  public abstract UserFunctionMenuVO findByID(@Param("id") String paramString);

  @Select({"SELECT * FROM USER_FUNCTION_MENU WHERE UFM_PID = #{pid}"})
  @Results({@org.apache.ibatis.annotations.Result(id=true, column="UFM_ID", property="ufmID"), @org.apache.ibatis.annotations.Result(column="UFM_PID", property="ufmPID"), @org.apache.ibatis.annotations.Result(column="UFM_CODE", property="ufmCode"), @org.apache.ibatis.annotations.Result(column="UFM_DETAIL", property="ufmDetail"), @org.apache.ibatis.annotations.Result(id=true, column="UFM_ID", property="id"), @org.apache.ibatis.annotations.Result(column="UFM_DETAIL", property="text")})
  public abstract List<UserFunctionMenuVO> findByPID(@Param("pid") String paramString);
}