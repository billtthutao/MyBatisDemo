package test.dao;

import java.util.List;
import test.model.EventsStatementsSummaryByUserByEventName;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    int insert(EventsStatementsSummaryByUserByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    List<EventsStatementsSummaryByUserByEventName> selectAll();
}