package de.neuland.pug4j.spring.template;

import org.junit.Test;
import org.springframework.core.io.ResourceLoader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class SpringTemplateLoaderTest {
    @Test
    public void shouldCreateCorrectExtension() throws Exception {
        SpringTemplateLoader springTemplateLoader = new SpringTemplateLoader();
        springTemplateLoader.setSuffix(".jade");
        String extension = springTemplateLoader.getExtension();
        assertEquals("jade",extension);
    }
    @Test
    public void shouldCreateCorrectExtensionPug() throws Exception {
        SpringTemplateLoader springTemplateLoader = new SpringTemplateLoader();
        springTemplateLoader.setSuffix(".pug");
        String extension = springTemplateLoader.getExtension();
        assertEquals("pug",extension);
    }
}