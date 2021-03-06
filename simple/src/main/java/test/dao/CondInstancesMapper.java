package test.dao;

import java.util.List;
import test.model.CondInstances;

public interface CondInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    int insert(CondInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    CondInstances selectByPrimaryKey(Long objectInstanceBegin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    List<CondInstances> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CondInstances record);
}