package com.epam.learn.component;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/***
 * Custom health actuator endpoint
 */
@Endpoint(id = "custom")
@Component
public class CustomHealthActuatorEndpoint {

    /**
     * @return map of details related to app's health
     */
    @ReadOperation
    public Map<String, String> customHealthActuatorEndpoint() {
        Map<String, String> details = new HashMap<>();
        details.put("healthStatus", "Everything looks good");
        return details;
    }

}
