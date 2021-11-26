package com.thp.spring.simplecontext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thp.simplecontext.VintudSpringBootProjectApplication;
import com.thp.simplecontext.dto.RoleDTO;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = VintudSpringBootProjectApplication.class )
@AutoConfigureMockMvc
@Transactional
@RunWith(SpringRunner.class)
class VintudSpringBootProjectApplicationTests {

	 @Autowired
	  private MockMvc mvc;
	 
	 
	
	 @Test
	  public void findRoleByIdAPI() throws Exception {
	 	mvc.perform(MockMvcRequestBuilders.get("/roleManagement/findRoleById/{roleId}", 3)
	 			.accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk())
	 			.andExpect(MockMvcResultMatchers.jsonPath("$.roleId").value(3)); 
	 }
	 
	 @Test
	 public void findAllRoleAPI() throws Exception 
	 {
	   mvc.perform( MockMvcRequestBuilders
	       .get("/roleManagement/roles")
	       .accept(MediaType.APPLICATION_JSON))
	       .andDo(print())
	       .andExpect(status().isOk())
	       .andExpect(MockMvcResultMatchers.jsonPath("$.roles").exists())
	       .andExpect(MockMvcResultMatchers.jsonPath("$.roles[*].roleId").isNotEmpty());
	 }
	 
	 @Test
	 public void insertRoleAPI() throws Exception 
	 {
	   mvc.perform( MockMvcRequestBuilders.post("/roleManagement/addRole")
	      .content(asJsonString(new RoleDTO( null,"ferdaous")))
	      .contentType(MediaType.APPLICATION_JSON)
	      .accept(MediaType.APPLICATION_JSON))
	      .andExpect(status().isCreated())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.roleId").exists());
	 }
	 
	 public static String asJsonString(final Object obj) {
		    try {
		        return new ObjectMapper().writeValueAsString(obj);
		    } catch (Exception e) {
		        throw new RuntimeException(e);
		    }
		}

	 @Test
	 public void updateRoleAPI() throws Exception 
	 {
	   mvc.perform( MockMvcRequestBuilders
	       .put("/roleManagement/updateRole/{roleId}", 2)
	       .content(asJsonString(new RoleDTO((long) 2,"mahmoud")))
	       .contentType(MediaType.APPLICATION_JSON)
	       .accept(MediaType.APPLICATION_JSON))
	       .andExpect(status().isOk())
	       .andExpect(MockMvcResultMatchers.jsonPath("$.nom").value("mahmoud"));
	 }
	 
	 

}
