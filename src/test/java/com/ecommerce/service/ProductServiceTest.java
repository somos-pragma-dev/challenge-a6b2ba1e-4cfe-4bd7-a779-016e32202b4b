package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void getAllProducts() {
        when(productRepository.findAll()).thenReturn(List.of(new Product()));
        assertEquals(1, productService.getAllProducts().size());
    }

    @Test
    void createProduct() {
        Product product = new Product();
        when(productRepository.save(product)).thenReturn(product);
        assertNotNull(productService.createProduct(product));
    }

    @Test
    void updateProduct() {
        Product product = new Product();
        product.setId(1L);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        when(productRepository.save(product)).thenReturn(product);
        assertNotNull(productService.updateProduct(1L, product));
    }

    @Test
    void deleteProduct() {
        doNothing().when(productRepository).deleteById(1L);
        productService.deleteProduct(1L);
        verify(productRepository, times(1)).deleteById(1L);
    }
}