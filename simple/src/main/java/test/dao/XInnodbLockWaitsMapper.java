package test.dao;

import java.util.List;
import test.model.XInnodbLockWaits;

public interface XInnodbLockWaitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_lock_waits
     *
     * @mbg.generated
     */
    int insert(XInnodbLockWaits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_lock_waits
     *
     * @mbg.generated
     */
    List<XInnodbLockWaits> selectAll();
}