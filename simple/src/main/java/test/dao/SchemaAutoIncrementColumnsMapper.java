package test.dao;

import java.util.List;
import test.model.SchemaAutoIncrementColumns;

public interface SchemaAutoIncrementColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated
     */
    int insert(SchemaAutoIncrementColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_auto_increment_columns
     *
     * @mbg.generated
     */
    List<SchemaAutoIncrementColumns> selectAll();
}