package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Role;
import com.inti.repositories.RoleRepository;
import com.inti.services.interfaces.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
@Autowired
RoleRepository roleRepository;
	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public List<Role> findAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public Role findRoleById(Long id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public void deleteRole(Long id) {
		roleRepository.deleteById(id);
	}

}
