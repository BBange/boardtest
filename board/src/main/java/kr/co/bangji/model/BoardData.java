package kr.co.bangji.model;

public class BoardData {
	private int bnumber;
	private String title;
	private String clientid;
	private String data;
	private String context;

	public BoardData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardData(int bnumber, String title, String clientid, String data, String context) {
		super();
		this.bnumber = bnumber;
		this.title = title;
		this.clientid = clientid;
		this.data = data;
		this.context = context;
	}

	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClientid() {
		return clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "BoardData [bnumber=" + bnumber + ", title=" + title + ", clientid=" + clientid + ", data=" + data
				+ ", context=" + context + "]";
	}

}
