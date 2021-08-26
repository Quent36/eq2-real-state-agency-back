package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Note;
import com.inti.entities.Role;
import com.inti.services.interfaces.RoleService;

@CrossOrigin
@RestController
@RequestMapping(value="/gestionRoles")
public class RoleController {
	@Autowired
	RoleService roleService;

	@PostMapping("/roles")
	public Role saveRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}

	@GetMapping("/roles")
	public List<Role> findAll() {
		return roleService.findAllRole();
	}

	@RequestMapping(value = "/roles/{idRole}", method = RequestMethod.GET)
	public Role findRoleById(@PathVariable("idRole") Long id) {
		return roleService.findRoleById(id);
	}

	@DeleteMapping("/roles/{idRole}")
	public void deleteRole(@PathVariable("idRole") Long id) {
		roleService.deleteRole(id);
	}
	
	@PutMapping("/roles/{idRole}")
	public Role updateRole(@PathVariable("idRole") Long id_role, @RequestBody Role role) {

		Role currentRole = roleService.findRoleById(id_role);

		currentRole.setLibelle(role.getLibelle());

		return roleService.saveRole(currentRole);

	}

}
