package bean;

import java.io.Serializable;

public class Teacher extends User implements Serializable {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	/**CCCC
BBBBBBBBBBBBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCCC
=======
	/**
BBBBBBBBBBBBBBBBBBBBBBBBBBBB
>>>>>>> parent of 85564f6 (M11)
=======
	/**
<<<<<<< HEAD
BBBBBBBBBBBBBBBBBBBBBBBBBBBB
>>>>>>> parent of 85564f6 (M11)
=======
	/**
BBBBBBBBBBBBBBBBBBBBBBBBBBBBcccccccccccc
>>>>>>> branch 'master' of https://github.com/MoriTea/examtest.git
=======
	/**bbbbbbbb
>>>>>>> branch 'master' of https://github.com/MoriTea/examtest.git
=======
<<<<<<< HEAD
	 * 教員ID:String　さとう書き込みmufyumyuyumaaaaaaaa
=======
	 * 教員ID:String　さとう書き込み !!!!
	 *
>>>>>>> branch 'master' of https://github.com/MoriTea/examtest.gitAAAAAAAA
>>>>>>> parent of a6bf245 (M9)
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
