package com.classroom.assignment.controller.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.classroom.assignment.controller.Step3Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class Step3ControllerTests {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private Step3Controller controller;

  @Test
  void contextLoads() {
    // given
    // when
    // then
    assertThat(controller).isNotNull();
  }

  @Test
  public void mailItemFormExistenceConfirmation() throws Exception {
    // given
    // when
    // then
    this.mockMvc.perform(
        MockMvcRequestBuilders.post("/step3/comment").param("mail", "test_mail")).andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("test_mail")));
  }

}
