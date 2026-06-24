package org.yearup.repository;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;
import org.yearup.models.Product;
import org.yearup.service.ProductService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

@DataJpaTest
@Import(ProductService.class)
@Sql(scripts = "classpath:test-insert-data.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
class ProductSearchTest
{
    @Autowired
    private ProductService productService;

    @Test
    public void searchListToReturnResults() {

        int expectedCount = 12;

        List<Product> actual = productService.search(null, null, null, null);

        assertEquals(expectedCount, actual.size(), "all of the products that are listed should return with no errors");
        assertTrue(actual.stream().anyMatch(p -> !p.isFeatured()), "placeholder");

    }
}