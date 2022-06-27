package com.bs.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkus.liquibase.LiquibaseFactory;
import liquibase.Liquibase;
import liquibase.changelog.ChangeSetStatus;
import liquibase.exception.LiquibaseException;

@ApplicationScoped
public class MigrationService {

	@Inject
	LiquibaseFactory liquibaseFactory;

	public void checkMigration() throws LiquibaseException {

		try (Liquibase liquibase = liquibaseFactory.createLiquibase()) {
			List<ChangeSetStatus> status = liquibase.getChangeSetStatuses(liquibaseFactory.createContexts(),
					liquibaseFactory.createLabels());
		}
	}
}