package kr.co.bangji.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bangji.model.BoardData;
import kr.co.bangji.repository.BoardDao;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao dao;
	
	public List<BoardData> readAll(){
		return dao.getList();
	}
}
