package com.bs.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class ApplicationOverallHealthCheck implements HealthCheck{

	@Override
	public HealthCheckResponse call() {

		return HealthCheckResponse.up("Application is up.");
	}

}
