package cn.felord.message.bean;

import java.io.Serializable;

public class Msg implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String content;
	
	private int ttl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
	
}
