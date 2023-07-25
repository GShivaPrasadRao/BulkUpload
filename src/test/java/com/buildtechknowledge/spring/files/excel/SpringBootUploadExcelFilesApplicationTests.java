package com.buildtechknowledge.spring.files.excel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootUploadExcelFilesApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertDoesNotThrow(this::doNotThrowException);

	}
	private void doNotThrowException(){
		//This method will never throw exception
	}
}
