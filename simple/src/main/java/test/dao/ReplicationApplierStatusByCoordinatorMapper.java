package test.dao;

import java.util.List;
import test.model.ReplicationApplierStatusByCoordinator;

public interface ReplicationApplierStatusByCoordinatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_coordinator
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String channelName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_coordinator
     *
     * @mbg.generated
     */
    int insert(ReplicationApplierStatusByCoordinator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_coordinator
     *
     * @mbg.generated
     */
    ReplicationApplierStatusByCoordinator selectByPrimaryKey(String channelName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_coordinator
     *
     * @mbg.generated
     */
    List<ReplicationApplierStatusByCoordinator> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_status_by_coordinator
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReplicationApplierStatusByCoordinator record);
}