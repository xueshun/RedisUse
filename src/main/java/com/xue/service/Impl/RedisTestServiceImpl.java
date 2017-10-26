package com.xue.service.Impl;

import org.springframework.stereotype.Service;

import com.xue.service.RedisTestService;

@Service
public class RedisTestServiceImpl implements RedisTestService{

	public String getTimestamp(String param) {
		Long timestamp = System.currentTimeMillis();
		return timestamp.toString();
	}

}
