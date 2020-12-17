
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.drive.Drive.Changes;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.drive.Drive$Changes
 */
public enum DriveChangesApiMethod implements ApiMethod {

    GET(
        com.google.api.services.drive.Drive.Changes.Get.class,
        "get",
        arg("changeId", String.class)),

    GET_START_PAGE_TOKEN(
        com.google.api.services.drive.Drive.Changes.GetStartPageToken.class,
        "getStartPageToken"),

    LIST(
        com.google.api.services.drive.Drive.Changes.List.class,
        "list"),

    WATCH(
        com.google.api.services.drive.Drive.Changes.Watch.class,
        "watch",
        arg("contentChannel", com.google.api.services.drive.model.Channel.class));

    private final ApiMethod apiMethod;

    private DriveChangesApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Changes.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
