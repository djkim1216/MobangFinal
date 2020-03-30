package com.finalproject.mobang.user.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.mobang.user.dao.roomboardDao;
import com.finalproject.mobang.user.dto.roomboardDto;

@Service
public class roomboardBizImpl implements roomboardBiz {

	@Autowired
	private roomboardDao dao;
	
	@Override
	public List<roomboardDto> selectList() {
		
		return dao.selectList();
	}

	@Override
	public roomboardDto selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insert(roomboardDto dto) {
		return 0;
	}

	@Override
	public int update(roomboardDto dto) {
		return 0;
	}

	@Override
	public int delete(int myno) {
		return 0;
	}

}
