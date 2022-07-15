package com.smhrd.domain;

public class Like {
	private int boardNum;
	private int likeNum;
	
	public Like(int boardNum, int likeNum) {
		super();
		this.boardNum = boardNum;
		this.likeNum = likeNum;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public int getLikeNum() {
		return likeNum;
	}
	
}
