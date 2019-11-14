package test.dao;

import java.util.List;
import test.model.MetadataLocks;

public interface MetadataLocksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metadata_locks
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metadata_locks
     *
     * @mbg.generated
     */
    int insert(MetadataLocks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metadata_locks
     *
     * @mbg.generated
     */
    MetadataLocks selectByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metadata_locks
     *
     * @mbg.generated
     */
    List<MetadataLocks> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metadata_locks
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MetadataLocks record);
}