package test.dao;

import java.util.List;
import test.model.Events;

public interface EventsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENTS
     *
     * @mbg.generated
     */
    int insert(Events record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENTS
     *
     * @mbg.generated
     */
    List<Events> selectAll();
}