package test.dao;

import java.util.List;
import test.model.SlowLog;

public interface SlowLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slow_log
     *
     * @mbg.generated
     */
    int insert(SlowLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slow_log
     *
     * @mbg.generated
     */
    List<SlowLog> selectAll();
}