/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.stringtemplate;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class StringTemplateEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        StringTemplateEndpoint target = (StringTemplateEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": target.setAllowContextMapAll(property(camelContext, boolean.class, value)); return true;
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": target.setAllowTemplateFromHeader(property(camelContext, boolean.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "delimiterstart":
        case "delimiterStart": target.setDelimiterStart(property(camelContext, char.class, value)); return true;
        case "delimiterstop":
        case "delimiterStop": target.setDelimiterStop(property(camelContext, char.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return boolean.class;
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return boolean.class;
        case "contentcache":
        case "contentCache": return boolean.class;
        case "delimiterstart":
        case "delimiterStart": return char.class;
        case "delimiterstop":
        case "delimiterStop": return char.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        StringTemplateEndpoint target = (StringTemplateEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return target.isAllowContextMapAll();
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return target.isAllowTemplateFromHeader();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "delimiterstart":
        case "delimiterStart": return target.getDelimiterStart();
        case "delimiterstop":
        case "delimiterStop": return target.getDelimiterStop();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

