package de.uniba.wiai.dsg.zeus2014.delegates;

import java.util.Set;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckAmountDelegate implements JavaDelegate {

	private final int amountThreshold = 100;

	public void execute(DelegateExecution execution) throws Exception {

		Set<String> variables = execution.getVariableNames();

		if (!variables.contains("amount")) {
			throw new BpmnError("processingNotPossible");
		}

		int amount = (Integer) execution.getVariable("amount");
		if (amount <= amountThreshold) {
			execution.setVariable("amountTooHigh", false);
		} else {
			execution.setVariable("amountTooHigh", true);
		}

	}
}
