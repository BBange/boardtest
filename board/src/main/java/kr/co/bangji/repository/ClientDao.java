package kr.co.bangji.repository;

import kr.co.bangji.model.ClientData;

public interface ClientDao {
	int createId(ClientData c);
	ClientData getId(ClientData c);
	

}

