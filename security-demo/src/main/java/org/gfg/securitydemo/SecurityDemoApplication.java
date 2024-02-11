package org.gfg.securitydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityDemoApplication implements CommandLineRunner {
	@Autowired
	private MyUserRepository myUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myUserRepository.save(MyUser.builder().username("kajal").password("kajal").authorities("USER").build());

		myUserRepository.save(MyUser.builder().username("admin").password("admin").authorities("ADMIN").build());
	}
}
