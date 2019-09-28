package com.sohel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

@Configuration
public class RibbonConfig {


	
	@Bean
	public IPing ping() {
		return new PingUrl();
	}
	
	@Bean
	public IRule rule() {
		return new WeightedResponseTimeRule();
	}
}
