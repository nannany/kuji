package nannany.kuji.entity;

import nannany.kuji.vo.Role;

public class Assignment {

	private String name;

	private Role role;

	public Assignment(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public Role getRole() {
		return role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
