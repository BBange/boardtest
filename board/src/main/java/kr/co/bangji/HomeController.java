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
import org.springframework.web.bind.annotation.SessionAttributes;

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

	@GetMapping("main") // 메인페이지
	public String home() {
		return "login";
	}

	@PostMapping("check") //로그인 정보확인 / 세션부여
		public String idCheck(Model model, String id, String password, HttpSession session) {
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
			model.addAttribute("id" , id);
			model.addAttribute("msg", "로그인에 성고하였습니다.");
			model.addAttribute("url", "/test");
			session.setAttribute("sessionId", id);
			break;
		}

		return "alert";

	}

	@PostMapping("sign") // 회원가입 페이지로 이동
	public String postSignUp(ModelMap model) {
		model.addAttribute("clientData", new ClientData());
		return "signup";
	}
	
	@GetMapping("sign") // 회원가입 페이지로 이동
	public String getSignUp(ModelMap model) {
		model.addAttribute("clientData", new ClientData());
		return "signup";
	}

	@PostMapping("createId") //회원가입 정보 확인
	public String createId(Model model, ClientData clientData) {
		switch (cservice.createId(clientData)) {
		case 0:
			model.addAttribute("msg", "공백이 존재합니다.");
			model.addAttribute("url", "/sign");
			return "alert";
		
		case -1:
			model.addAttribute("msg", "이미 존재하는 아이디입니다.");
			model.addAttribute("url", "/sign");
			return "alert";
		
		case 1:
		return "ok";
		}
		return "sign";
	}
	
	@GetMapping("board")
	public String mainBoard(Model model) {
		model.addAttribute("boardlist" , bservice.readAll());
		return "board";
	}
	
	@GetMapping("test")
	public String test() {
		return "test";
	}
	
	
}
