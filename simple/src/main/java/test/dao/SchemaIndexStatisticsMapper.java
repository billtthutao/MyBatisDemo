package test.dao;

import java.util.List;
import test.model.SchemaIndexStatistics;

public interface SchemaIndexStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_index_statistics
     *
     * @mbg.generated
     */
    int insert(SchemaIndexStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_index_statistics
     *
     * @mbg.generated
     */
    List<SchemaIndexStatistics> selectAll();
}