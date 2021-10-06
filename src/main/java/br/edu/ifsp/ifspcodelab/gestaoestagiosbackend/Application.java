package br.edu.ifsp.ifspcodelab.gestaoestagiosbackend;

import br.edu.ifsp.ifspcodelab.gestaoestagiosbackend.common.mail.SmtpAuthenticator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.objenesis.instantiator.sun.SunReflectionFactorySerializationInstantiator;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	@Qualifier("mailer")
	SmtpAuthenticator mailerAccount(@Value("${application.mail.username}") String username, @Value("${application.mail.password}") String password) {
		return new SmtpAuthenticator(username, password);
	}
}
