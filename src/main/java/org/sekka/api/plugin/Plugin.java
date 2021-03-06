package org.sekka.api.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {

    // TODO Pattern ID_PATTERN = PluginMetadata.ID_PATTERN;

    String id();

    String name() default "";

    String version() default "";

    Dependency[] dependencies() default {};

    String description() default "";

    String url() default "";

    String[] authors() default {};
}
