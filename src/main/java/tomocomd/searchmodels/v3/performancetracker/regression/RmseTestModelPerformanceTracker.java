package tomocomd.searchmodels.v3.performancetracker.regression;

import tomocomd.ModelingException;
import tomocomd.searchmodels.v3.performancetracker.metricvalues.RegressionMetricValues;
import tomocomd.searchmodels.v3.utils.MetricType;

public class RmseTestModelPerformanceTracker extends ARegressionModelPerformanceTracker {
  @Override
  public MetricType getMetricType() {
    return MetricType.RMSE_EXT;
  }

  @Override
  public double computeValueToCompare() throws ModelingException {
    return ((RegressionMetricValues) testValues).getRmse();
  }
}
