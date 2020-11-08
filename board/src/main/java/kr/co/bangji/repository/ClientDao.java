package kr.co.bangji.repository;

import java.util.List;

import kr.co.bangji.model.ClientData;

public interface ClientDao {
	int createId(ClientData c);
	ClientData getLoginData(String id);
	List<ClientData> readAllId();

}

