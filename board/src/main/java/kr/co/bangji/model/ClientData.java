package kr.co.bangji.model;

public class ClientData {
	private String id;
	private String password;
	private String email;

	public ClientData() {
		super();

	}

	public ClientData(String id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ClientData [id=" + id + ", password=" + password + ", email=" + email + "]";
	}

}
