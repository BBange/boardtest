package kr.co.bangji.repository;

import java.util.List;

import kr.co.bangji.model.BoardData;

public interface BoardDao {
	int createBoard(BoardData b);
	List<BoardData> getList(int a);
	int readBoard();
	int updateBoard();
	int deleteBoard();
}
