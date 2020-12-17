/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.util;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class TwitterConverterLoader implements TypeConverterLoader {

    public TwitterConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.lang.String.class, twitter4j.DirectMessage.class, false,
            (type, exchange, value) -> org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.DirectMessage) value));
        addTypeConverter(registry, java.lang.String.class, twitter4j.Status.class, false,
            (type, exchange, value) -> org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.Status) value));
        addTypeConverter(registry, java.lang.String.class, twitter4j.Trend.class, false,
            (type, exchange, value) -> org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.Trend) value));
        addTypeConverter(registry, java.lang.String.class, twitter4j.Trends.class, false,
            (type, exchange, value) -> org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.Trends) value));
        addTypeConverter(registry, java.lang.String.class, twitter4j.UserList.class, false,
            (type, exchange, value) -> org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.UserList) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
