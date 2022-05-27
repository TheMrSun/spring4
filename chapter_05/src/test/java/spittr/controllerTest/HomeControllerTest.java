package spittr.controllerTest;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.web.HomeController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import static org.junit.Assert.*;

/**
 * @author Slience
 * @version 1.0
 *
 * controller层的mock测试:请求返回视图是否已经连接
 */
public class HomeControllerTest {
    @Test
    public void testHomePageController() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        assertEquals("home",homeController.home());
        mockMvc.perform(get("/"))
                .andExpect(view().name("home"));
    }
}
