package test.dao;

import java.util.List;
import test.model.MemorySummaryByUserByEventName;

public interface MemorySummaryByUserByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    int insert(MemorySummaryByUserByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    List<MemorySummaryByUserByEventName> selectAll();
}