package bean;

import java.io.Serializable;

public class Teacher extends User implements Serializable {
	/**
<<<<<<< HEAD
	 * 教員ID:String　さとう書き込みmufyumyuyumaaaaaaaa
=======
	 * 教員ID:String　さとう書き込み !!!!
	 *
>>>>>>> branch 'master' of https://github.com/MoriTea/examtest.gitAAAAAAAA
	 */
	private String id;

	/**
	 * パスワード:String
	 */
	private String password;

	/**
	 * 教員名:String
	 */
	private String name;

	/**
	 * 所属校:School
	 */
	private School school;

	/**
	 * ゲッター、セッター
	 */
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

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
