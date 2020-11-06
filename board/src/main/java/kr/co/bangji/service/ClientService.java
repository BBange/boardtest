package kr.co.bangji.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bangji.model.ClientData;
import kr.co.bangji.repository.ClientDao;
import kr.co.bangji.repository.ClientDaoImpl;

@Service
public class ClientService {
	@Autowired
	private ClientDao cdao;
	
	public int checkId() {
		cdao.getId(c)
		
		return 0;
	}

}
