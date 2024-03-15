package ac.jp.ohara.Shift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ac.jp.ohara.Shift.model.Shift;

@Repository
public interface ShiftRepository extends JpaRepository<Shift,Long>{

}
