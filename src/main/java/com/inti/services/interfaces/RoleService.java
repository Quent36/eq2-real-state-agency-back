package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Role;

public interface RoleService {
	
	Role saveRole(Role role);

	List<Role> findAllRole();

	Role findRoleById(Long id);

	void deleteRole(Long id);


}
