package com.qa.cardatabase;

import com.qa.cardatabase.web.CarController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class CardatabaseApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private CarController carController;

	@Test
	void contextLoads() {
		assertThat(carController).isNotNull();
	}

}
