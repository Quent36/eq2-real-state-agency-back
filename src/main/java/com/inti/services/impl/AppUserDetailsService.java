//package com.inti.services.impl;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.inti.entities.Role;
//import com.inti.entities.Utilisateur;
//import com.inti.model.UtilisateurDetail;
//import com.inti.services.interfaces.UtilisateurService;
//
//@Service
//public class AppUserDetailsService implements UserDetailsService{
//
//	@Autowired
//	UtilisateurService utilisateurService;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		Utilisateur utilisateur = utilisateurService.findByUsername(username);
//		Role role = utilisateur.getRole();
//		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
//		authorities.add(new SimpleGrantedAuthority(role.getLibelle()));
//		UtilisateurDetail utilisateurDetail = new UtilisateurDetail();
//		utilisateurDetail.setUtilisateur(utilisateur);
//		utilisateurDetail.setAuthorities(authorities);
//		return utilisateurDetail;
//	}
//
//}
