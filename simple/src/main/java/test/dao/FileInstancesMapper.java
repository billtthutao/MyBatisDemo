package test.dao;

import java.util.List;
import test.model.FileInstances;

public interface FileInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_instances
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fileName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_instances
     *
     * @mbg.generated
     */
    int insert(FileInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_instances
     *
     * @mbg.generated
     */
    FileInstances selectByPrimaryKey(String fileName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_instances
     *
     * @mbg.generated
     */
    List<FileInstances> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_instances
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FileInstances record);
}