package inheritance.q4;

public class Engineer extends Q4{
	/*
	 * 오류 원인 - Q4의 생성자를 상속받지않음
	 * 결함 조치 - super()을 사용하여 생성자를 상속받음
	 */
	
	private String skillset;
	
	public Engineer(String name) {
		super(name);
	}
	
	public String getSkillset() {
		return skillset;
	}
	
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
}
