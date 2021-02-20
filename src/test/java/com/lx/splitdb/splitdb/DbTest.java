package com.lx.splitdb.splitdb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.lx.splitdb.splitdb.entity.Score;
import com.lx.splitdb.splitdb.entity.User;
import com.lx.splitdb.splitdb.service.ScoreService;
import com.lx.splitdb.splitdb.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SplitdbApplication.class)
public class DbTest {
	@Autowired
	private UserService userService;
	
	@Autowired
	private ScoreService scoreService;
	
	
	
	@Test
	public void testUser(){
		User user = new User();
		user.setId(6);
		user.setUserName("lx");
		user.setAge(10);
		int result = userService.addUser(user);
		System.out.println(result);
		
		User user2 = new User();
		user2.setId(7);
		user2.setUserName("gj");
		user2.setAge(9);
		int result2 = userService.addUser(user2);
		System.out.println(result2);
	}

	@Test
	public void getUser(){
		User user  = userService.getUser(2);
		System.out.println(JSON.toJSONString(user));
		
		user  = userService.getUser(3);
		System.out.println(JSON.toJSONString(user));
	}
	
	@Test
	public void testScore(){
		Score score = new Score();
		score.setScoreId(1);
		score.setItem("数学");
		score.setScore(80);
		score.setUserId(1);
		
		int result =scoreService.insert(score);
		System.out.println(result);
		
		Score score2 = new Score();
		score2.setScoreId(2);
		score2.setItem("语文");
		score2.setScore(90);
		score2.setUserId(2);
		
		int result2 =scoreService.insert(score2);
		System.out.println(result2);
	}

}
