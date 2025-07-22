package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {

 @Autowired
 private MockMvc mockMvc;

 @Test
 public void shouldReturnDefaultMessage() throws Exception {
  this.mockMvc.perform(get("/"))
    .andDo(print()).andExpect(status().isOk())
    .andExpect(content()
     .string(containsString("Hello, World!")));
 }

 @Test
 public void shouldReturnDefaultMessageHelena() throws Exception {
  this.mockMvc.perform(get("/Helena"))
    .andDo(print()).andExpect(status().isOk())
    .andExpect(content()
     .string(containsString("Hello, Helena!")));
 }

 @Test
 public void shouldReturnDefaultMessagePratica3() throws Exception {
  this.mockMvc.perform(get("/Pratica3"))
    .andDo(print()).andExpect(status().isOk())
    .andExpect(content()
     .string(containsString("Novo endpoint.")));
//<<<<<<< HEAD
 }
 /*
 @Test
 public void shouldReturnDefaultMessageParalelo() throws Exception {
  this.mockMvc.perform(get("/Paralelo"))
    .andDo(print()).andExpect(status().isOk())
    .andExpect(content()
     .string(containsString("Simulando trabalho em paralelo no arquivo original.")));
 } */

//=======


 @Test
 public void shouldReturnDefaultMessageParalelo() throws Exception {
  this.mockMvc.perform(get("/Paralelo"))
          .andDo(print()).andExpect(status().isOk())
          .andExpect(content()
                  .string(containsString("Simulação de trabalho em paralelo concluída com sucesso. ")));
 }

//>>>>>>> 01f028a494d535d2f4acb6542a077648a3eb4a17


 @Test
 public void shouldReturnDefaultMessagehotfix() throws Exception {
  this.mockMvc.perform(get("/hotfix"))
          .andDo(print()).andExpect(status().isOk())
          .andExpect(content()
                  .string(containsString("Branch Hotfix, adicionada!")));
 }

}
