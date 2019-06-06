// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/scan_run.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface ScanRunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.ScanRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only.
   * The resource name of the ScanRun. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
   * The ScanRun IDs are generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only.
   * The resource name of the ScanRun. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
   * The ScanRun IDs are generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only.
   * The execution state of the ScanRun.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRun.ExecutionState execution_state = 2;
   * </code>
   */
  int getExecutionStateValue();
  /**
   *
   *
   * <pre>
   * Output only.
   * The execution state of the ScanRun.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRun.ExecutionState execution_state = 2;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRun.ExecutionState getExecutionState();

  /**
   *
   *
   * <pre>
   * Output only.
   * The result state of the ScanRun. This field is only available after the
   * execution state reaches "FINISHED".
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRun.ResultState result_state = 3;</code>
   */
  int getResultStateValue();
  /**
   *
   *
   * <pre>
   * Output only.
   * The result state of the ScanRun. This field is only available after the
   * execution state reaches "FINISHED".
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRun.ResultState result_state = 3;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRun.ResultState getResultState();

  /**
   *
   *
   * <pre>
   * Output only.
   * The time at which the ScanRun started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only.
   * The time at which the ScanRun started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only.
   * The time at which the ScanRun started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only.
   * The time at which the ScanRun reached termination state - that the ScanRun
   * is either finished or stopped by user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only.
   * The time at which the ScanRun reached termination state - that the ScanRun
   * is either finished or stopped by user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only.
   * The time at which the ScanRun reached termination state - that the ScanRun
   * is either finished or stopped by user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only.
   * The number of URLs crawled during this ScanRun. If the scan is in progress,
   * the value represents the number of URLs crawled up to now.
   * </pre>
   *
   * <code>int64 urls_crawled_count = 6;</code>
   */
  long getUrlsCrawledCount();

  /**
   *
   *
   * <pre>
   * Output only.
   * The number of URLs tested during this ScanRun. If the scan is in progress,
   * the value represents the number of URLs tested up to now. The number of
   * URLs tested is usually larger than the number URLS crawled because
   * typically a crawled URL is tested with multiple test payloads.
   * </pre>
   *
   * <code>int64 urls_tested_count = 7;</code>
   */
  long getUrlsTestedCount();

  /**
   *
   *
   * <pre>
   * Output only.
   * Whether the scan run has found any vulnerabilities.
   * </pre>
   *
   * <code>bool has_vulnerabilities = 8;</code>
   */
  boolean getHasVulnerabilities();

  /**
   *
   *
   * <pre>
   * Output only.
   * The percentage of total completion ranging from 0 to 100.
   * If the scan is in queue, the value is 0.
   * If the scan is running, the value ranges from 0 to 100.
   * If the scan is finished, the value is 100.
   * </pre>
   *
   * <code>int32 progress_percent = 9;</code>
   */
  int getProgressPercent();

  /**
   *
   *
   * <pre>
   * Output only.
   * If result_state is an ERROR, this field provides the primary reason for
   * scan's termination and more details, if such are available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace error_trace = 10;</code>
   */
  boolean hasErrorTrace();
  /**
   *
   *
   * <pre>
   * Output only.
   * If result_state is an ERROR, this field provides the primary reason for
   * scan's termination and more details, if such are available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace error_trace = 10;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace getErrorTrace();
  /**
   *
   *
   * <pre>
   * Output only.
   * If result_state is an ERROR, this field provides the primary reason for
   * scan's termination and more details, if such are available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRunErrorTrace error_trace = 10;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRunErrorTraceOrBuilder getErrorTraceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only.
   * A list of warnings, if such are encountered during this scan run.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace warning_traces = 11;
   * </code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace>
      getWarningTracesList();
  /**
   *
   *
   * <pre>
   * Output only.
   * A list of warnings, if such are encountered during this scan run.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace warning_traces = 11;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace getWarningTraces(int index);
  /**
   *
   *
   * <pre>
   * Output only.
   * A list of warnings, if such are encountered during this scan run.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace warning_traces = 11;
   * </code>
   */
  int getWarningTracesCount();
  /**
   *
   *
   * <pre>
   * Output only.
   * A list of warnings, if such are encountered during this scan run.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace warning_traces = 11;
   * </code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1beta.ScanRunWarningTraceOrBuilder>
      getWarningTracesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only.
   * A list of warnings, if such are encountered during this scan run.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace warning_traces = 11;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRunWarningTraceOrBuilder getWarningTracesOrBuilder(
      int index);
}
