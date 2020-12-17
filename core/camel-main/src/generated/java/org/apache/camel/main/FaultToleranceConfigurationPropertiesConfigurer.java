/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.FaultToleranceConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FaultToleranceConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("BulkheadEnabled", java.lang.Boolean.class);
        map.put("BulkheadExecutorServiceRef", java.lang.String.class);
        map.put("BulkheadMaxConcurrentCalls", java.lang.Integer.class);
        map.put("BulkheadWaitingTaskQueue", java.lang.Integer.class);
        map.put("CircuitBreakerRef", java.lang.String.class);
        map.put("Delay", java.lang.Long.class);
        map.put("FailureRatio", java.lang.Integer.class);
        map.put("RequestVolumeThreshold", java.lang.Integer.class);
        map.put("SuccessThreshold", java.lang.Integer.class);
        map.put("TimeoutDuration", java.lang.Long.class);
        map.put("TimeoutEnabled", java.lang.Boolean.class);
        map.put("TimeoutPoolSize", java.lang.Integer.class);
        map.put("TimeoutScheduledExecutorServiceRef", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(FaultToleranceConfigurationPropertiesConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.FaultToleranceConfigurationProperties target = (org.apache.camel.main.FaultToleranceConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bulkheadenabled":
        case "BulkheadEnabled": target.setBulkheadEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "bulkheadexecutorserviceref":
        case "BulkheadExecutorServiceRef": target.setBulkheadExecutorServiceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "bulkheadmaxconcurrentcalls":
        case "BulkheadMaxConcurrentCalls": target.setBulkheadMaxConcurrentCalls(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bulkheadwaitingtaskqueue":
        case "BulkheadWaitingTaskQueue": target.setBulkheadWaitingTaskQueue(property(camelContext, java.lang.Integer.class, value)); return true;
        case "circuitbreakerref":
        case "CircuitBreakerRef": target.setCircuitBreakerRef(property(camelContext, java.lang.String.class, value)); return true;
        case "delay":
        case "Delay": target.setDelay(property(camelContext, java.lang.Long.class, value)); return true;
        case "failureratio":
        case "FailureRatio": target.setFailureRatio(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestvolumethreshold":
        case "RequestVolumeThreshold": target.setRequestVolumeThreshold(property(camelContext, java.lang.Integer.class, value)); return true;
        case "successthreshold":
        case "SuccessThreshold": target.setSuccessThreshold(property(camelContext, java.lang.Integer.class, value)); return true;
        case "timeoutduration":
        case "TimeoutDuration": target.setTimeoutDuration(property(camelContext, java.lang.Long.class, value)); return true;
        case "timeoutenabled":
        case "TimeoutEnabled": target.setTimeoutEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "timeoutpoolsize":
        case "TimeoutPoolSize": target.setTimeoutPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "timeoutscheduledexecutorserviceref":
        case "TimeoutScheduledExecutorServiceRef": target.setTimeoutScheduledExecutorServiceRef(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bulkheadenabled":
        case "BulkheadEnabled": return java.lang.Boolean.class;
        case "bulkheadexecutorserviceref":
        case "BulkheadExecutorServiceRef": return java.lang.String.class;
        case "bulkheadmaxconcurrentcalls":
        case "BulkheadMaxConcurrentCalls": return java.lang.Integer.class;
        case "bulkheadwaitingtaskqueue":
        case "BulkheadWaitingTaskQueue": return java.lang.Integer.class;
        case "circuitbreakerref":
        case "CircuitBreakerRef": return java.lang.String.class;
        case "delay":
        case "Delay": return java.lang.Long.class;
        case "failureratio":
        case "FailureRatio": return java.lang.Integer.class;
        case "requestvolumethreshold":
        case "RequestVolumeThreshold": return java.lang.Integer.class;
        case "successthreshold":
        case "SuccessThreshold": return java.lang.Integer.class;
        case "timeoutduration":
        case "TimeoutDuration": return java.lang.Long.class;
        case "timeoutenabled":
        case "TimeoutEnabled": return java.lang.Boolean.class;
        case "timeoutpoolsize":
        case "TimeoutPoolSize": return java.lang.Integer.class;
        case "timeoutscheduledexecutorserviceref":
        case "TimeoutScheduledExecutorServiceRef": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.FaultToleranceConfigurationProperties target = (org.apache.camel.main.FaultToleranceConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bulkheadenabled":
        case "BulkheadEnabled": return target.getBulkheadEnabled();
        case "bulkheadexecutorserviceref":
        case "BulkheadExecutorServiceRef": return target.getBulkheadExecutorServiceRef();
        case "bulkheadmaxconcurrentcalls":
        case "BulkheadMaxConcurrentCalls": return target.getBulkheadMaxConcurrentCalls();
        case "bulkheadwaitingtaskqueue":
        case "BulkheadWaitingTaskQueue": return target.getBulkheadWaitingTaskQueue();
        case "circuitbreakerref":
        case "CircuitBreakerRef": return target.getCircuitBreakerRef();
        case "delay":
        case "Delay": return target.getDelay();
        case "failureratio":
        case "FailureRatio": return target.getFailureRatio();
        case "requestvolumethreshold":
        case "RequestVolumeThreshold": return target.getRequestVolumeThreshold();
        case "successthreshold":
        case "SuccessThreshold": return target.getSuccessThreshold();
        case "timeoutduration":
        case "TimeoutDuration": return target.getTimeoutDuration();
        case "timeoutenabled":
        case "TimeoutEnabled": return target.getTimeoutEnabled();
        case "timeoutpoolsize":
        case "TimeoutPoolSize": return target.getTimeoutPoolSize();
        case "timeoutscheduledexecutorserviceref":
        case "TimeoutScheduledExecutorServiceRef": return target.getTimeoutScheduledExecutorServiceRef();
        default: return null;
        }
    }
}

