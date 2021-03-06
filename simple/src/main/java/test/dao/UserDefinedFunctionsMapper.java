package test.dao;

import java.util.List;
import test.model.UserDefinedFunctions;

public interface UserDefinedFunctionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String udfName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    int insert(UserDefinedFunctions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    UserDefinedFunctions selectByPrimaryKey(String udfName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    List<UserDefinedFunctions> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserDefinedFunctions record);
}