package test.dao;

import java.util.List;
import test.model.SetupThreads;

public interface SetupThreadsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    int insert(SetupThreads record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    SetupThreads selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    List<SetupThreads> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SetupThreads record);
}