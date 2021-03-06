package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table rwlock_instances
 */
public class RwlockInstances {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rwlock_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    private Long objectInstanceBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rwlock_instances.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rwlock_instances.WRITE_LOCKED_BY_THREAD_ID
     *
     * @mbg.generated
     */
    private Long writeLockedByThreadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rwlock_instances.READ_LOCKED_BY_COUNT
     *
     * @mbg.generated
     */
    private Integer readLockedByCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rwlock_instances.OBJECT_INSTANCE_BEGIN
     *
     * @return the value of rwlock_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rwlock_instances.OBJECT_INSTANCE_BEGIN
     *
     * @param objectInstanceBegin the value for rwlock_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rwlock_instances.NAME
     *
     * @return the value of rwlock_instances.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rwlock_instances.NAME
     *
     * @param name the value for rwlock_instances.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rwlock_instances.WRITE_LOCKED_BY_THREAD_ID
     *
     * @return the value of rwlock_instances.WRITE_LOCKED_BY_THREAD_ID
     *
     * @mbg.generated
     */
    public Long getWriteLockedByThreadId() {
        return writeLockedByThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rwlock_instances.WRITE_LOCKED_BY_THREAD_ID
     *
     * @param writeLockedByThreadId the value for rwlock_instances.WRITE_LOCKED_BY_THREAD_ID
     *
     * @mbg.generated
     */
    public void setWriteLockedByThreadId(Long writeLockedByThreadId) {
        this.writeLockedByThreadId = writeLockedByThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rwlock_instances.READ_LOCKED_BY_COUNT
     *
     * @return the value of rwlock_instances.READ_LOCKED_BY_COUNT
     *
     * @mbg.generated
     */
    public Integer getReadLockedByCount() {
        return readLockedByCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rwlock_instances.READ_LOCKED_BY_COUNT
     *
     * @param readLockedByCount the value for rwlock_instances.READ_LOCKED_BY_COUNT
     *
     * @mbg.generated
     */
    public void setReadLockedByCount(Integer readLockedByCount) {
        this.readLockedByCount = readLockedByCount;
    }
}