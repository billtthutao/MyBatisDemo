package test.dao;

import java.util.List;
import test.model.EventsStatementsSummaryByHostByEventName;

public interface EventsStatementsSummaryByHostByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated
     */
    int insert(EventsStatementsSummaryByHostByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_host_by_event_name
     *
     * @mbg.generated
     */
    List<EventsStatementsSummaryByHostByEventName> selectAll();
}