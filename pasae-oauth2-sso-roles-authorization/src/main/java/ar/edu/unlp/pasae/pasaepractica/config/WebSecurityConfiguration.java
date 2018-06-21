package ar.edu.unlp.pasae.pasaepractica.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(final HttpSecurity http) throws Exception {

		http.formLogin().loginPage("/login").permitAll().and().logout().and().requestMatchers()
				.antMatchers("/", "/login", "/oauth/authorize", "/oauth/confirm_access", "/exit").and()
				.authorizeRequests().antMatchers("/css/**").permitAll().anyRequest().authenticated();
	}

}
