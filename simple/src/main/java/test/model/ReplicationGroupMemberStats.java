package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table replication_group_member_stats
 */
public class ReplicationGroupMemberStats {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.CHANNEL_NAME
     *
     * @mbg.generated
     */
    private String channelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.VIEW_ID
     *
     * @mbg.generated
     */
    private String viewId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.MEMBER_ID
     *
     * @mbg.generated
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @mbg.generated
     */
    private Long countTransactionsInQueue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @mbg.generated
     */
    private Long countTransactionsChecked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @mbg.generated
     */
    private Long countConflictsDetected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @mbg.generated
     */
    private Long countTransactionsRowsValidating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @mbg.generated
     */
    private Long countTransactionsRemoteInApplierQueue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @mbg.generated
     */
    private Long countTransactionsRemoteApplied;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @mbg.generated
     */
    private Long countTransactionsLocalProposed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @mbg.generated
     */
    private Long countTransactionsLocalRollback;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @mbg.generated
     */
    private String transactionsCommittedAllMembers;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @mbg.generated
     */
    private String lastConflictFreeTransaction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.CHANNEL_NAME
     *
     * @return the value of replication_group_member_stats.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.CHANNEL_NAME
     *
     * @param channelName the value for replication_group_member_stats.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.VIEW_ID
     *
     * @return the value of replication_group_member_stats.VIEW_ID
     *
     * @mbg.generated
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.VIEW_ID
     *
     * @param viewId the value for replication_group_member_stats.VIEW_ID
     *
     * @mbg.generated
     */
    public void setViewId(String viewId) {
        this.viewId = viewId == null ? null : viewId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.MEMBER_ID
     *
     * @return the value of replication_group_member_stats.MEMBER_ID
     *
     * @mbg.generated
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.MEMBER_ID
     *
     * @param memberId the value for replication_group_member_stats.MEMBER_ID
     *
     * @mbg.generated
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @mbg.generated
     */
    public Long getCountTransactionsInQueue() {
        return countTransactionsInQueue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @param countTransactionsInQueue the value for replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @mbg.generated
     */
    public void setCountTransactionsInQueue(Long countTransactionsInQueue) {
        this.countTransactionsInQueue = countTransactionsInQueue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @mbg.generated
     */
    public Long getCountTransactionsChecked() {
        return countTransactionsChecked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @param countTransactionsChecked the value for replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @mbg.generated
     */
    public void setCountTransactionsChecked(Long countTransactionsChecked) {
        this.countTransactionsChecked = countTransactionsChecked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @return the value of replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @mbg.generated
     */
    public Long getCountConflictsDetected() {
        return countConflictsDetected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @param countConflictsDetected the value for replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @mbg.generated
     */
    public void setCountConflictsDetected(Long countConflictsDetected) {
        this.countConflictsDetected = countConflictsDetected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @mbg.generated
     */
    public Long getCountTransactionsRowsValidating() {
        return countTransactionsRowsValidating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @param countTransactionsRowsValidating the value for replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @mbg.generated
     */
    public void setCountTransactionsRowsValidating(Long countTransactionsRowsValidating) {
        this.countTransactionsRowsValidating = countTransactionsRowsValidating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @mbg.generated
     */
    public Long getCountTransactionsRemoteInApplierQueue() {
        return countTransactionsRemoteInApplierQueue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @param countTransactionsRemoteInApplierQueue the value for replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @mbg.generated
     */
    public void setCountTransactionsRemoteInApplierQueue(Long countTransactionsRemoteInApplierQueue) {
        this.countTransactionsRemoteInApplierQueue = countTransactionsRemoteInApplierQueue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @mbg.generated
     */
    public Long getCountTransactionsRemoteApplied() {
        return countTransactionsRemoteApplied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @param countTransactionsRemoteApplied the value for replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @mbg.generated
     */
    public void setCountTransactionsRemoteApplied(Long countTransactionsRemoteApplied) {
        this.countTransactionsRemoteApplied = countTransactionsRemoteApplied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @mbg.generated
     */
    public Long getCountTransactionsLocalProposed() {
        return countTransactionsLocalProposed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @param countTransactionsLocalProposed the value for replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @mbg.generated
     */
    public void setCountTransactionsLocalProposed(Long countTransactionsLocalProposed) {
        this.countTransactionsLocalProposed = countTransactionsLocalProposed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @mbg.generated
     */
    public Long getCountTransactionsLocalRollback() {
        return countTransactionsLocalRollback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @param countTransactionsLocalRollback the value for replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @mbg.generated
     */
    public void setCountTransactionsLocalRollback(Long countTransactionsLocalRollback) {
        this.countTransactionsLocalRollback = countTransactionsLocalRollback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @return the value of replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @mbg.generated
     */
    public String getTransactionsCommittedAllMembers() {
        return transactionsCommittedAllMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @param transactionsCommittedAllMembers the value for replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @mbg.generated
     */
    public void setTransactionsCommittedAllMembers(String transactionsCommittedAllMembers) {
        this.transactionsCommittedAllMembers = transactionsCommittedAllMembers == null ? null : transactionsCommittedAllMembers.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @return the value of replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @mbg.generated
     */
    public String getLastConflictFreeTransaction() {
        return lastConflictFreeTransaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @param lastConflictFreeTransaction the value for replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @mbg.generated
     */
    public void setLastConflictFreeTransaction(String lastConflictFreeTransaction) {
        this.lastConflictFreeTransaction = lastConflictFreeTransaction == null ? null : lastConflictFreeTransaction.trim();
    }
}