package test.dao;

import java.util.List;
import test.model.WaitClassesGlobalByLatency;

public interface WaitClassesGlobalByLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wait_classes_global_by_latency
     *
     * @mbg.generated
     */
    int insert(WaitClassesGlobalByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wait_classes_global_by_latency
     *
     * @mbg.generated
     */
    List<WaitClassesGlobalByLatency> selectAll();
}