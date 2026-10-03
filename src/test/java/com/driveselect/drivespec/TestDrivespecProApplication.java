package com.driveselect.drivespec;

import org.springframework.boot.SpringApplication;

public class TestDrivespecProApplication {

	public static void main(String[] args) {
		SpringApplication.from(DrivespecProApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
