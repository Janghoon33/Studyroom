package com.smhrd.domain;

import java.math.BigDecimal;

public class Comm {
	
	private BigDecimal commentNum;
	private BigDecimal boardNum;
	private String com;
	
	public Comm(BigDecimal commentNum, BigDecimal boardNum, String com) {
		super();
		this.commentNum = commentNum;
		this.boardNum = boardNum;
		this.com = com;
	}
	
	public Comm(BigDecimal boardNum, String com) {
		super();
		this.boardNum = boardNum;
		this.com = com;
	}

	public BigDecimal getCommentNum() {
		return commentNum;
	}

	public BigDecimal getBoardNum() {
		return boardNum;
	}

	public String getCom() {
		return com;
	}
	
	

}
