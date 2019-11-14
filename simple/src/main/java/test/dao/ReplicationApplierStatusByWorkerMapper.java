package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.ReplicationApplierStatusByWorker;

public interface ReplicationApplierStatusByWorkerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_worker
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("channelName") String channelName, @Param("workerId") Long workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_worker
     *
     * @mbg.generated
     */
    int insert(ReplicationApplierStatusByWorker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_worker
     *
     * @mbg.generated
     */
    ReplicationApplierStatusByWorker selectByPrimaryKey(@Param("channelName") String channelName, @Param("workerId") Long workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_worker
     *
     * @mbg.generated
     */
    List<ReplicationApplierStatusByWorker> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_worker
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReplicationApplierStatusByWorker record);
}