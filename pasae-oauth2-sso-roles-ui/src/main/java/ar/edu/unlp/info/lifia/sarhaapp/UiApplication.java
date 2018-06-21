package ar.edu.unlp.info.lifia.sarhaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

@SpringBootApplication
public class UiApplication {

	public static void main(final String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

	@Bean
	OAuth2RestTemplate oAuth2RestTemplate(final OAuth2ClientContext clientContext,
			final OAuth2ProtectedResourceDetails details) {
		return new OAuth2RestTemplate(details, clientContext);
	}
}
