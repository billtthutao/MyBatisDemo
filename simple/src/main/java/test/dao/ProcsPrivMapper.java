package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.ProcsPriv;

public interface ProcsPrivMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routineName") String routineName, @Param("routineType") String routineType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    int insert(ProcsPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    ProcsPriv selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routineName") String routineName, @Param("routineType") String routineType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    List<ProcsPriv> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProcsPriv record);
}