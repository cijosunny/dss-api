package com.cks.dss.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DssApiBaseConfig {
	@Value("${docusign.enabled}")
	private String docusignEnabled;

	public String getDocusignEnabled() {
		return docusignEnabled;
	}

	public void setDocusignEnabled(String docusignEnabled) {
		this.docusignEnabled = docusignEnabled;
	}
}
