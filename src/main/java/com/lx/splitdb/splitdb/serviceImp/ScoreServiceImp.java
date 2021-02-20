package com.lx.splitdb.splitdb.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lx.splitdb.splitdb.entity.Score;
import com.lx.splitdb.splitdb.mapper.ScoreMapper;
import com.lx.splitdb.splitdb.service.ScoreService;

@Service("scoreService")
public class ScoreServiceImp implements ScoreService {

	@Autowired
	ScoreMapper scoreMapper;

	@Override
	public int insert(Score score) {
		return scoreMapper.insert(score);
	}

	@Override
	public int delete(Score score) {
		return scoreMapper.delete(score);
	}

	@Override
	public int update(Score score) {
		return scoreMapper.updateByPrimaryKey(score);
	}

	@Override
	public Score select(int id) {
		return scoreMapper.selectByPrimaryKey(id);
	}

}
