package com.dyippay.dofjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DofJenkinsApplicationTests {

	String testString = "selam";
	int testInt = 15;

	@Test
	void contextLoads() {
		System.out.println("testing String");
		assertThat(testString).isEqualTo("selam");
	}

	@Test
	void testInt() {
		System.out.println("testing int");
		assertThat(testInt).isEqualTo(15);
	}

}
