package guru.springframework.domain;




import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }

}