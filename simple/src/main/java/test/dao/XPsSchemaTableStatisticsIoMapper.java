package test.dao;

import java.util.List;
import test.model.XPsSchemaTableStatisticsIo;

public interface XPsSchemaTableStatisticsIoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    int insert(XPsSchemaTableStatisticsIo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    List<XPsSchemaTableStatisticsIo> selectAll();
}