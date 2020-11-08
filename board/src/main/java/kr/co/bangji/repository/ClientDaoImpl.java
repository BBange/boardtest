package kr.co.bangji.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.bangji.model.ClientData;

@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public int createId(ClientData c) { // 회원가입
		return JdbcTemplate.update("insert into client (id, password , email )" + "value ( ? , ? ,?)", c.getId(),
				c.getPassword(), c.getEmail());

	}

	@Override
	public ClientData getLoginData(String id) { // 아이디 비밀번호 정보를 호출
		return JdbcTemplate.queryForObject("select * from client where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<ClientData>(ClientData.class));
	}

	@Override
	public List<ClientData> readAllId() {
		return JdbcTemplate.query("SELECT id FROM client",
				new BeanPropertyRowMapper<ClientData>(ClientData.class));

	}

}
