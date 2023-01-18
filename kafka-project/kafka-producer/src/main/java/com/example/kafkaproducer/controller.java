package com.example.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	 /*@Autowired
	    KafkaTemplate<String,String> kafkaTemplate;

	    private static final String TOPIC = "NewTopic";

	    @GetMapping("/publish/{message}")
	    public String publishMessage(@PathVariable("message") String message)
	    {
	        kafkaTemplate.send(TOPIC, message);
	        return "Published Successfully!";
	    }*/
	
	 @Autowired
	    KafkaTemplate<String,Book> kafkaTemplate;

	    private static final String TOPIC = "NewTopic";

	    @PostMapping("/publish")
	    public String publishMessage(@RequestBody Book book)
	    {
	        kafkaTemplate.send(TOPIC, book);
	        return "Published Successfully!";
	    }
}
