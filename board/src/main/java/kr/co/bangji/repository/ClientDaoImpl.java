package kr.co.bangji.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.co.bangji.model.ClientData;

public class ClientDaoImpl implements ClientDao {
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public int createId(ClientData c) {
		return JdbcTemplate.update("insert into client (id, password , email )" + "value ( ? , ? ,?)", c.getId(),
				c.getPassword(), c.getEmail());

	}

	@Override
	public ClientData getId(ClientData c) { //아이디 비밀번호 정보를 호출
		return JdbcTemplate.queryForObject("select * from client where id = ?", new Object[] { c.getId() },
				new BeanPropertyRowMapper<ClientData>(ClientData.class));
	}

}
