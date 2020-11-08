package kr.co.bangji.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.bangji.model.BoardData;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	/*
	 * public String getData() { String date; return
	 * jdbcTemplate.queryForObject("select now()", date ); }
	 */
	
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
	public List<BoardData> getList() {
		return jdbcTemplate.query("select * from board where bnumber order by bnumber desc" ,
				new BeanPropertyRowMapper<BoardData>(BoardData.class));
		
	}

}
