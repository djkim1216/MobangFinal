package com.finalproject.mobang.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalproject.mobang.user.dto.roomboardDto;


@Repository
public class roomboardDaoImpl implements roomboardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<roomboardDto> selectList() {
		List<roomboardDto> list=new ArrayList<roomboardDto>();
		
		try {
			list=sqlSession.selectList(NAMESPACE+"selectList");
		} catch(Exception e) {
			System.out.println("[error] : selectList");
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public roomboardDto selectOne(int myno) {
		
		roomboardDto dto = new roomboardDto();
		
		try {
			dto = sqlSession.selectOne(NAMESPACE+"selectOne", myno);
		} catch (Exception e) {
			System.out.println("[error] : select one");;
			e.printStackTrace();
		}
		
		return dto;
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
