package test.dao;

import java.util.List;
import test.model.Tables;

public interface TablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    int insert(Tables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    List<Tables> selectAll();
}