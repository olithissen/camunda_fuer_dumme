package net.tonick.demo.camundarest;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SysoutDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		System.out.println("Hello World");

	}

}
