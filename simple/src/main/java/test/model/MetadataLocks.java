package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table metadata_locks
 */
public class MetadataLocks {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    private Long objectInstanceBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.OBJECT_TYPE
     *
     * @mbg.generated
     */
    private String objectType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    private String objectSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.OBJECT_NAME
     *
     * @mbg.generated
     */
    private String objectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.COLUMN_NAME
     *
     * @mbg.generated
     */
    private String columnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.LOCK_TYPE
     *
     * @mbg.generated
     */
    private String lockType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.LOCK_DURATION
     *
     * @mbg.generated
     */
    private String lockDuration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.LOCK_STATUS
     *
     * @mbg.generated
     */
    private String lockStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.SOURCE
     *
     * @mbg.generated
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.OWNER_THREAD_ID
     *
     * @mbg.generated
     */
    private Long ownerThreadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metadata_locks.OWNER_EVENT_ID
     *
     * @mbg.generated
     */
    private Long ownerEventId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.OBJECT_INSTANCE_BEGIN
     *
     * @return the value of metadata_locks.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.OBJECT_INSTANCE_BEGIN
     *
     * @param objectInstanceBegin the value for metadata_locks.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.OBJECT_TYPE
     *
     * @return the value of metadata_locks.OBJECT_TYPE
     *
     * @mbg.generated
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.OBJECT_TYPE
     *
     * @param objectType the value for metadata_locks.OBJECT_TYPE
     *
     * @mbg.generated
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.OBJECT_SCHEMA
     *
     * @return the value of metadata_locks.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.OBJECT_SCHEMA
     *
     * @param objectSchema the value for metadata_locks.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.OBJECT_NAME
     *
     * @return the value of metadata_locks.OBJECT_NAME
     *
     * @mbg.generated
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.OBJECT_NAME
     *
     * @param objectName the value for metadata_locks.OBJECT_NAME
     *
     * @mbg.generated
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.COLUMN_NAME
     *
     * @return the value of metadata_locks.COLUMN_NAME
     *
     * @mbg.generated
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.COLUMN_NAME
     *
     * @param columnName the value for metadata_locks.COLUMN_NAME
     *
     * @mbg.generated
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.LOCK_TYPE
     *
     * @return the value of metadata_locks.LOCK_TYPE
     *
     * @mbg.generated
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.LOCK_TYPE
     *
     * @param lockType the value for metadata_locks.LOCK_TYPE
     *
     * @mbg.generated
     */
    public void setLockType(String lockType) {
        this.lockType = lockType == null ? null : lockType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.LOCK_DURATION
     *
     * @return the value of metadata_locks.LOCK_DURATION
     *
     * @mbg.generated
     */
    public String getLockDuration() {
        return lockDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.LOCK_DURATION
     *
     * @param lockDuration the value for metadata_locks.LOCK_DURATION
     *
     * @mbg.generated
     */
    public void setLockDuration(String lockDuration) {
        this.lockDuration = lockDuration == null ? null : lockDuration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.LOCK_STATUS
     *
     * @return the value of metadata_locks.LOCK_STATUS
     *
     * @mbg.generated
     */
    public String getLockStatus() {
        return lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.LOCK_STATUS
     *
     * @param lockStatus the value for metadata_locks.LOCK_STATUS
     *
     * @mbg.generated
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus == null ? null : lockStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.SOURCE
     *
     * @return the value of metadata_locks.SOURCE
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.SOURCE
     *
     * @param source the value for metadata_locks.SOURCE
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.OWNER_THREAD_ID
     *
     * @return the value of metadata_locks.OWNER_THREAD_ID
     *
     * @mbg.generated
     */
    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.OWNER_THREAD_ID
     *
     * @param ownerThreadId the value for metadata_locks.OWNER_THREAD_ID
     *
     * @mbg.generated
     */
    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metadata_locks.OWNER_EVENT_ID
     *
     * @return the value of metadata_locks.OWNER_EVENT_ID
     *
     * @mbg.generated
     */
    public Long getOwnerEventId() {
        return ownerEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metadata_locks.OWNER_EVENT_ID
     *
     * @param ownerEventId the value for metadata_locks.OWNER_EVENT_ID
     *
     * @mbg.generated
     */
    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }
}