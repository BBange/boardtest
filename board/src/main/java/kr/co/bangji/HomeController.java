package kr.co.bangji;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.bangji.model.ClientData;
import kr.co.bangji.service.BoardService;
import kr.co.bangji.service.ClientService;

@Controller
@RequestMapping("/")
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private ClientService cservice;
	private BoardService bservice;

	@GetMapping("main")
	public String home() {
		return "login";
	}

	@PostMapping("check")
	public String idCheck(Model model, String id, String password) {
		ClientData clientData = new ClientData();

		clientData.setId(id);
		clientData.setPassword(password);
		switch (cservice.checkId(clientData)) {
		case -1:
			model.addAttribute("msg", "공백이 존재합니다.");
			model.addAttribute("url", "/main");
			break;
		case 0:
			model.addAttribute("msg", "아이디 혹은 비밀번호가 틀립니다.");
			model.addAttribute("url", "/main");
			break;
		case 1:
			model.addAttribute("msg", "로그인에 성고하였습니다.");
			model.addAttribute("url", "/ok");
			break;
		}

		return "alert";

	}

	@PostMapping("sign")
	public String postSignUp(ModelMap model) {
		model.addAttribute("clientData", new ClientData());
		return "signup";
	}
	
	@GetMapping("sign")
	public String getSignUp(ModelMap model) {
		model.addAttribute("clientData", new ClientData());
		return "signup";
	}

	@PostMapping("createId")
	public String createId(Model model, ClientData clientData) {
		switch (cservice.createId(clientData)) {
		case -1:
			model.addAttribute("msg", "이미 존재하는 아이디입니다.");
			model.addAttribute("url", "/sign");
			return "alert";
		
		case 1:
		return "ok";
		}
		return "sign";
	}
}
