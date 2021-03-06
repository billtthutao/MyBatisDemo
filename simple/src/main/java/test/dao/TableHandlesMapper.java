package test.dao;

import java.util.List;
import test.model.TableHandles;

public interface TableHandlesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_handles
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_handles
     *
     * @mbg.generated
     */
    int insert(TableHandles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_handles
     *
     * @mbg.generated
     */
    TableHandles selectByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_handles
     *
     * @mbg.generated
     */
    List<TableHandles> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_handles
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TableHandles record);
}