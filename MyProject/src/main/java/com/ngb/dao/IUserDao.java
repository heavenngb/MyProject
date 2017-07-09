package com.ngb.dao;

import com.ngb.vo.UserDetailVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public abstract interface IUserDao {
	@Select({ "SELECT * FROM USER_DETAIL " })
	@Results({ @org.apache.ibatis.annotations.Result(id = true, column = "UD_USER_ID", property = "userID"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_NAME", property = "userName"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_LOGIN_NAME", property = "userLoginName"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_LOGIN_PASSWORD", property = "userLoginPassword"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_STATUS", property = "userStatus"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_LOGIN_STATUS", property = "userLoginStatus"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_PURVIEW", property = "userPurView") })
	public abstract List<UserDetailVO> findAll();

	@Select({ "SELECT * FROM USER_DETAIL WHERE UD_USER_LOGIN_NAME=#{name} AND UD_USER_LOGIN_PASSWORD=#{password}" })
	@Results({ @org.apache.ibatis.annotations.Result(id = true, column = "UD_USER_ID", property = "userID"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_NAME", property = "userName"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_LOGIN_NAME", property = "userLoginName"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_LOGIN_PASSWORD", property = "userLoginPassword"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_STATUS", property = "userStatus"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_LOGIN_STATUS", property = "userLoginStatus"),
			@org.apache.ibatis.annotations.Result(column = "UD_USER_PURVIEW", property = "userPurView") })
	public abstract UserDetailVO checkLogin(@Param("name") String paramString1, @Param("password") String paramString2);
}