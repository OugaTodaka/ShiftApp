package ac.jp.ohara.Shift.model;

import java.util.Date;

import lombok.Data;

@Data
public class ShiftAdd {
	private Long user_id;
	private Date date_at;
}
