package io.camunda.zeebe.spring.client.metrics;

public interface MetricsRecorder {

  String METRIC_NAME_OUTBOUND_CONNECTOR = "camunda.connector.outbound.invocations";
  String METRIC_NAME_JOB = "camunda.job.invocations";
  String METRIC_NAME_INBOUND_CONNECTOR = "camunda.connector.inbound.invocations";

  String ACTION_ACTIVATED = "activated";
  String ACTION_COMPLETED = "completed";
  String ACTION_FAILED = "failed";
  String ACTION_BPMN_ERROR = "bpmn-error";

  String DURATION_200MSEC = "duration_200_msec";

  String DURATION_1SEC = "duration_1_sec";

  String DURATION_5SEC = "duration_5_sec";

  String DURATION_OTHER = "duration_other";

  public void increase(String metricName, String action, String type);

  public void executeWithTimer(String metricName, Runnable methodToExecute);
}
