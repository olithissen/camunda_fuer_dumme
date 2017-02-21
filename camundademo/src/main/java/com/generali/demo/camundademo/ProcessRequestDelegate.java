/**
 * (c) 2017 Generali Deutschland Informatik Services GmbH, Aachen 
 *
 * All rights reserved.
 * Any copy, modification and distribution of the software and of the accompanying 
 * documentation require prior written permission/consent of the copyright holder.
 */
package com.generali.demo.camundademo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JavaDoc für ProcessRequestDelegate
 *
 * @author Oliver Thissen (v096644)
 *
 */
public class ProcessRequestDelegate implements JavaDelegate {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProcessRequestDelegate.class);

	/* (non-Javadoc)
	 * @see org.camunda.bpm.engine.delegate.JavaDelegate#execute(org.camunda.bpm.engine.delegate.DelegateExecution)
	 */
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Processing Request by {}", execution.getVariable("customerId"));

	}
}
