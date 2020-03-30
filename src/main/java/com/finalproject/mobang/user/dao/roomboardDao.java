package com.finalproject.mobang.user.dao;

import java.util.List;

import com.finalproject.mobang.user.dto.roomboardDto;

public interface roomboardDao {
	String NAMESPACE = "roomboard.";
	
	public List<roomboardDto> selectList();
	public roomboardDto selectOne(int myno);
	public int insert(roomboardDto dto);
	public int update(roomboardDto dto);
	public int delete(int myno);
}
