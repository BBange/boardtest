package kr.co.bangji.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bangji.model.ClientData;
import kr.co.bangji.repository.ClientDao;

@Service
public class ClientService {
	@Autowired
	private ClientDao cdao;

	public int createId(ClientData cdata) { // 아이디 생성
		List<ClientData> idList = cdao.readAllId();
		Iterator<ClientData> iter = idList.iterator();

		while (iter.hasNext()) {
			if (iter.next().getId().equals(cdata.getId())) {
				return -1;
			}
		}
		return cdao.createId(cdata);
	}

	public int checkId(ClientData cdata) { // 정보조회
		// 실패 = 0;
		// 아이디 비밀번호 공백 = -1;
		// 로그인 성공 1;
		int result = 0;
		ClientData checkData = null;

		if (cdata.getId() == null || cdata.getPassword() == null) {
			System.out.println("값이 없습니다");
			return result;
		}

		if (cdata.getId().length() == 0 || cdata.getPassword().length() == 0) {
			System.out.println("공백이 존재합니다");
			result = -1;
			return result;
		} else {
			checkData = cdao.getLoginData(cdata.getId());
		}
		if (checkData.getId().equals(cdata.getId()) && checkData.getPassword().equals(cdata.getPassword())) {
			System.out.println("아이디 비밀번호 일치");
			result = 1;
		} else {
			System.out.println("아이디 비밀번호 불일치");
			result = 0;
		}

		return result;
	}

}
