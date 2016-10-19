package com.sample.dao;


import com.sample.model.Consumer;

import java.util.List;
import java.util.Map;

public interface ConsumerMapper {
	
//	 int addConsumerRequset(Consumer consumer);
	
	 Consumer getConsumerRequest(Map<String, Object> map);
	
//	 Consumer getConsumerBykey(int id);
//
//	 List<Consumer> getConsumers(Map<String, Object> map);

}
