package test.dao;

import java.util.List;
import test.model.WaitClassesGlobalByAvgLatency;

public interface WaitClassesGlobalByAvgLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wait_classes_global_by_avg_latency
     *
     * @mbg.generated
     */
    int insert(WaitClassesGlobalByAvgLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wait_classes_global_by_avg_latency
     *
     * @mbg.generated
     */
    List<WaitClassesGlobalByAvgLatency> selectAll();
}