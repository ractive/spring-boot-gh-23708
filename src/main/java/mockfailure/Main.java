package mockfailure;

import org.springframework.boot.SpringApplication;

public final class Main {
	private Main() {
	}
	
	public static final void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
