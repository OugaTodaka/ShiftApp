package ac.jp.ohara.Shift.model;

import lombok.Data;

@Data
public class UserAdd {
	private String username;
	private String password;
	private String last_name;
	private String first_name;
}
