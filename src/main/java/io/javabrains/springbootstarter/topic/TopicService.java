package io.javabrains.springbootstarter.topic;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public Page<Topic> getAllTopics(Pageable page) {
		return topicRepository.findAll(page);
	}
	 
	public Optional<Topic> getTopic(Integer id) {
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Integer id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(Integer id) {
		topicRepository.deleteById(id);
	}
}
