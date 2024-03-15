package ac.jp.ohara.Shift.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac.jp.ohara.Shift.model.Shift;
import ac.jp.ohara.Shift.repository.ShiftRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShiftService {

	@Autowired
	private ShiftRepository shiftRepository;
	
	public List<Shift> searchAll(){
		return shiftRepository.findAll();
	}
	
	public void insert(Shift shift) {
		shiftRepository.save(shift);
	}
}
