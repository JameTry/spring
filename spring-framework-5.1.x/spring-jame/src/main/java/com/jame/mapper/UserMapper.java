package com.jame.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author : Jame
 * @date : 2021-11-18 16:08
 **/
public interface UserMapper {

	@Select("select count(1) from `user`")
	int selectCount();

}
