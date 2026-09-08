package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(ProductController.class)
class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllProducts() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products")
               .accept(MediaType.APPLICATION_JSON))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void createProduct() throws Exception {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(100.0);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\"name\":\"Test Product\",\"price\":100.0}"))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void updateProduct() throws Exception {
        Product product = new Product();
        product.setName("Updated Product");
        product.setPrice(200.0);

        mockMvc.perform(MockMvcRequestBuilders.put("/api/products/1")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\"name\":\"Updated Product\",\"price\":200.0}"))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void deleteProduct() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/products/1")
               .accept(MediaType.APPLICATION_JSON))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }
}