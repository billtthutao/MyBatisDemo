package test.dao;

import java.util.List;
import test.model.TableConstraints;

public interface TableConstraintsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated
     */
    int insert(TableConstraints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_CONSTRAINTS
     *
     * @mbg.generated
     */
    List<TableConstraints> selectAll();
}