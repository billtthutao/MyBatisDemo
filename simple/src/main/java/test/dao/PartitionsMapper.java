package test.dao;

import java.util.List;
import test.model.Partitions;

public interface PartitionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated
     */
    int insert(Partitions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARTITIONS
     *
     * @mbg.generated
     */
    List<Partitions> selectAll();
}