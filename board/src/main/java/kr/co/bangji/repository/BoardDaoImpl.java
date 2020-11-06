package kr.co.bangji.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.co.bangji.model.BoardData;

public class BoardDaoImpl implements BoardDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int createBoard(BoardData b) {
		return jdbcTemplate.update("select into board ( title , clientid , data , context) value (?,?,?,?)",
				b.getTitle() , b.getClientid() , b.getData() , b.getContext());
	}

	@Override
	public int readBoard() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardData> getList(int a) {
		ArrayList<BoardData> list = new ArrayList<BoardData>();
		// TODO Auto-generated method stub
		return list;
	}

}
