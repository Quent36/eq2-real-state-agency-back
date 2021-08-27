package com.inti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.inti.services.impl.AppUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(appUserDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}
	
	//.authorizeRequests().anyRequest().authenticated() 
	protected void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
				.anyRequest().permitAll() 
			.and()
			.formLogin()
				.permitAll() 
			.and()
			.logout()
				.logoutUrl("/logout") 
				.permitAll()
			.and()
			.httpBasic() 
			.and()
			.csrf().disable(); 
		
	}
}
