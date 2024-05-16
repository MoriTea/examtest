package bean;

import java.io.Serializable;

public class School implements Serializable {

	/**
	 * 学校コード:String　ｃｃｃｃｃ
	 */
	private String cd;

	/**
	 * 学校名:String　ｄｄｄｄ
	 */
	private String name;

	/**
	 * ゲッター、セッター
	 */
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
