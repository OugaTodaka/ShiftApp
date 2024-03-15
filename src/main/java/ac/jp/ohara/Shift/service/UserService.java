package ac.jp.ohara.Shift.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac.jp.ohara.Shift.model.User;
import ac.jp.ohara.Shift.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> searchAll(){
		return userRepository.findAll();
	}
	
	public void insert(User user) {
		userRepository.save(user);
	}
}
