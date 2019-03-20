package com.zeniel.surl.core;

import lombok.Data;

public class UrlResponseMessage extends ResponseMessage {

	private int id;
	private String shortenUrl;
	
	public UrlResponseMessage(String code, String msg) {
		super(code, msg);
	}

	public UrlResponseMessage(String code, String msg, String shortenUrl) {
		super(code, msg);
		this.shortenUrl = shortenUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShortenUrl() {
		return shortenUrl;
	}

	public void setShortenUrl(String shortenUrl) {
		this.shortenUrl = shortenUrl;
	}
	
}
