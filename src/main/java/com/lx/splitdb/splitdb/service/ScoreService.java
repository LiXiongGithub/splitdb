package com.lx.splitdb.splitdb.service;

import com.lx.splitdb.splitdb.entity.Score;

public interface ScoreService {
	public int insert(Score score);

	public int delete(Score score);

	public int update(Score score);

	public Score select(int score);
}
