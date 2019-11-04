package com.capitalone.dashboard.model;


import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(
        collection = "test_results"
)
@CompoundIndexes({@CompoundIndex(
        name = "test_results_collItemId_ts_idx",
        def = "{'collectorItemId' : 1, 'timestamp': -1}"
)})
public class TestResultPerformance extends TestResult {

    public TestResultPerformance() {

    }

    private TestPerformance.PerformanceMetrics performanceMetrics;

    private String testType;

    private String testId;

    private String testAgentType;

    private String componentName;

    private String status;

    private String testRequestId;


    private String buildJobId;

    private String serviceNowApplication;

    private String bapComponentName;

    public TestPerformance.PerformanceMetrics getPerformanceMetrics() {
        return performanceMetrics;
    }


    public void setPerformanceMetrics(TestPerformance.PerformanceMetrics performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestAgentType() {
        return testAgentType;
    }

    public void setTestAgentType(String testAgentType) {
        this.testAgentType = testAgentType;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTestRequestId() {
        return testRequestId;
    }

    public void setTestRequestId(String testRequestId) {
        this.testRequestId = testRequestId;
    }

    public String getBuildJobId() {
        return buildJobId;
    }

    public void setBuildJobId(String buildJobId) {
        this.buildJobId = buildJobId;
    }

    public String getServiceNowApplication() {
        return serviceNowApplication;
    }

    public void setServiceNowApplication(String serviceNowApplication) {
        this.serviceNowApplication = serviceNowApplication;
    }

    public String getBapComponentName() {
        return bapComponentName;
    }

    public void setBapComponentName(String bapComponentName) {
        this.bapComponentName = bapComponentName;
    }

    @Override
    public String toString() {
        return "TestResultPerformance{" +
                "performanceMetrics=" + performanceMetrics +
                ", testType='" + testType + '\'' +
                ", testId='" + testId + '\'' +
                ", testAgentType='" + testAgentType + '\'' +
                ", componentName='" + componentName + '\'' +
                ", status='" + status + '\'' +
                ", testRequestId='" + testRequestId + '\'' +
                ", buildJobId='" + buildJobId + '\'' +
                ", serviceNowApplication='" + serviceNowApplication + '\'' +
                ", bapComponentName='" + bapComponentName + '\'' +
                '}';
    }
}
