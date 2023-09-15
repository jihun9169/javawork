package user;

public class User {
	private String id;
	private int pwd;
	private String name;

	
	public User(String id, int pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		id = id;
	}


	public int getPwd() {
		return pwd;
	}


	public void setPwd(int pwd) {
		pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		name = name;
	}
	@Override
	public String toString() {
		return id + " , " + pwd + " , " + name;
	}
}
