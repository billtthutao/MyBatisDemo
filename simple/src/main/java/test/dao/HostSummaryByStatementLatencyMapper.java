package test.dao;

import java.util.List;
import test.model.HostSummaryByStatementLatency;

public interface HostSummaryByStatementLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_statement_latency
     *
     * @mbg.generated
     */
    int insert(HostSummaryByStatementLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_statement_latency
     *
     * @mbg.generated
     */
    List<HostSummaryByStatementLatency> selectAll();
}