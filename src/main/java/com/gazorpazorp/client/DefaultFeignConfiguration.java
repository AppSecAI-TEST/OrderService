package com.gazorpazorp.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;

@Configuration
public class DefaultFeignConfiguration {
	
	@Bean
	feign.RequestInterceptor oauth2FeignRequestInterceptor(OAuth2ClientContext context) {
		if (context == null) return null;
		return new CustomOAuth2FeignRequestInterceptor(context);
	}
}
