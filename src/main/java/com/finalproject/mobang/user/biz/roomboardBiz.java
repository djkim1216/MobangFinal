package com.finalproject.mobang.user.biz;

import java.util.List;

import com.finalproject.mobang.user.dto.roomboardDto;

public interface roomboardBiz {
	
	public List<roomboardDto> selectList();
	public roomboardDto selectOne(int myno);
	public int insert(roomboardDto dto);
	public int update(roomboardDto dto);
	public int delete(int myno);

}
