package org.hrSolution.service.redis;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service("redisService")
public class RedisService {
	@Autowired
	public RedisTemplate<String, Object> template;

	public Object getValue(final String key) {
		return template.opsForValue().get(key);
	}

	public void setValue(final String key, Object object) {
		template.opsForValue().set(key, object.toString());
		// set a expire for a message
		template.expire(key, 5, TimeUnit.SECONDS);
	}
}
