package test.dao;

import java.util.List;
import test.model.WaitsByUserByLatency;

public interface WaitsByUserByLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated
     */
    int insert(WaitsByUserByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table waits_by_user_by_latency
     *
     * @mbg.generated
     */
    List<WaitsByUserByLatency> selectAll();
}