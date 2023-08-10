package com.sccodefactory.scbookkeeping;

import com.sccodefactory.scbookkeeping.ScBookKeepingApp;
import com.sccodefactory.scbookkeeping.config.AsyncSyncConfiguration;
import com.sccodefactory.scbookkeeping.config.EmbeddedElasticsearch;
import com.sccodefactory.scbookkeeping.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ScBookKeepingApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
