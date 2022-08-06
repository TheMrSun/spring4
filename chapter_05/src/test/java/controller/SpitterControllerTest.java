package controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.controller.SpitterController;
import spittr.data.SpitterRepository;
import spittr.model.Spitter;


import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



/**
 * @author Slience
 * @version 1.0
 */

public class SpitterControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);

        SpitterController spitterController = new SpitterController(mockRepository);

        MockMvc mockMvc = standaloneSetup(spitterController).build();

        mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));

    }

    @Test
    public void shouldProcessRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("jbauer", "24hours", "Jack", "Bauer", "jbauer@ctu.gov");
        Spitter saved = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer", "jbauer@ctu.gov");
        when(mockRepository.save(unsaved)).thenReturn(saved);

        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/spitter/register")
                .param("firstName","jack")
                .param("lastName","Bauer")
                .param("username","jbauer")
                .param("password","24hour")
                .param("email", "jbauer@ctu.gov"))
                .andExpect(redirectedUrl("/spitter/jbauer"));

        verify(mockRepository, atLeastOnce()).save(unsaved);

    }

}
