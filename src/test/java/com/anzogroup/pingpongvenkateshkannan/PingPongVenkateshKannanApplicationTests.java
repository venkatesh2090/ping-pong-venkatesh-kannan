package com.anzogroup.pingpongvenkateshkannan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PingPongVenkateshKannanApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void whenPingReturnPongWith200() throws Exception {
		mockMvc.perform(get("/ping"))
			.andExpect(content().string("pong"))
			.andExpect(status().isOk());
	}

}
