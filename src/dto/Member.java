package dto;

public class Member {
	private int num;
	private String id;			// ���̵�
	private String password; 	// ��й�ȣ
	private String name;		// �̸�
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public Member(int num,String id, String password, String name) {
		super();
		this.num = num;
		this.id = id;
		this.password = password;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
