package test.dao;

import java.util.List;
import test.model.RwlockInstances;

public interface RwlockInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    int insert(RwlockInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    RwlockInstances selectByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    List<RwlockInstances> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RwlockInstances record);
}