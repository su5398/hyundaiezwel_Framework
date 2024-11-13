package com.boot.jdbc.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.jdbc.model.dto.MyDto;

@Mapper
public interface MyBoardMapper {

	@Select(" SELECT * FROM MYBOARD ORDER BY MYNO DESC ")
	List<MyDto> selectList();
	
	MyDto selectOne(int myno);
	int insert(MyDto dto);
	int update(MyDto dto);
	int delete(int myno);
}
