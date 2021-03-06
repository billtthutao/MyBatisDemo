package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table INNODB_BUFFER_PAGE
 */
public class InnodbBufferPage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.POOL_ID
     *
     * @mbg.generated
     */
    private Long poolId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.BLOCK_ID
     *
     * @mbg.generated
     */
    private Long blockId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.SPACE
     *
     * @mbg.generated
     */
    private Long space;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.PAGE_NUMBER
     *
     * @mbg.generated
     */
    private Long pageNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.PAGE_TYPE
     *
     * @mbg.generated
     */
    private String pageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.FLUSH_TYPE
     *
     * @mbg.generated
     */
    private Long flushType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.FIX_COUNT
     *
     * @mbg.generated
     */
    private Long fixCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.IS_HASHED
     *
     * @mbg.generated
     */
    private String isHashed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.NEWEST_MODIFICATION
     *
     * @mbg.generated
     */
    private Long newestModification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.OLDEST_MODIFICATION
     *
     * @mbg.generated
     */
    private Long oldestModification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.ACCESS_TIME
     *
     * @mbg.generated
     */
    private Long accessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.TABLE_NAME
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.INDEX_NAME
     *
     * @mbg.generated
     */
    private String indexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.NUMBER_RECORDS
     *
     * @mbg.generated
     */
    private Long numberRecords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.DATA_SIZE
     *
     * @mbg.generated
     */
    private Long dataSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.COMPRESSED_SIZE
     *
     * @mbg.generated
     */
    private Long compressedSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.PAGE_STATE
     *
     * @mbg.generated
     */
    private String pageState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.IO_FIX
     *
     * @mbg.generated
     */
    private String ioFix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.IS_OLD
     *
     * @mbg.generated
     */
    private String isOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK
     *
     * @mbg.generated
     */
    private Long freePageClock;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.POOL_ID
     *
     * @return the value of INNODB_BUFFER_PAGE.POOL_ID
     *
     * @mbg.generated
     */
    public Long getPoolId() {
        return poolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.POOL_ID
     *
     * @param poolId the value for INNODB_BUFFER_PAGE.POOL_ID
     *
     * @mbg.generated
     */
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.BLOCK_ID
     *
     * @return the value of INNODB_BUFFER_PAGE.BLOCK_ID
     *
     * @mbg.generated
     */
    public Long getBlockId() {
        return blockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.BLOCK_ID
     *
     * @param blockId the value for INNODB_BUFFER_PAGE.BLOCK_ID
     *
     * @mbg.generated
     */
    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.SPACE
     *
     * @return the value of INNODB_BUFFER_PAGE.SPACE
     *
     * @mbg.generated
     */
    public Long getSpace() {
        return space;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.SPACE
     *
     * @param space the value for INNODB_BUFFER_PAGE.SPACE
     *
     * @mbg.generated
     */
    public void setSpace(Long space) {
        this.space = space;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.PAGE_NUMBER
     *
     * @return the value of INNODB_BUFFER_PAGE.PAGE_NUMBER
     *
     * @mbg.generated
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.PAGE_NUMBER
     *
     * @param pageNumber the value for INNODB_BUFFER_PAGE.PAGE_NUMBER
     *
     * @mbg.generated
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.PAGE_TYPE
     *
     * @return the value of INNODB_BUFFER_PAGE.PAGE_TYPE
     *
     * @mbg.generated
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.PAGE_TYPE
     *
     * @param pageType the value for INNODB_BUFFER_PAGE.PAGE_TYPE
     *
     * @mbg.generated
     */
    public void setPageType(String pageType) {
        this.pageType = pageType == null ? null : pageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.FLUSH_TYPE
     *
     * @return the value of INNODB_BUFFER_PAGE.FLUSH_TYPE
     *
     * @mbg.generated
     */
    public Long getFlushType() {
        return flushType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.FLUSH_TYPE
     *
     * @param flushType the value for INNODB_BUFFER_PAGE.FLUSH_TYPE
     *
     * @mbg.generated
     */
    public void setFlushType(Long flushType) {
        this.flushType = flushType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.FIX_COUNT
     *
     * @return the value of INNODB_BUFFER_PAGE.FIX_COUNT
     *
     * @mbg.generated
     */
    public Long getFixCount() {
        return fixCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.FIX_COUNT
     *
     * @param fixCount the value for INNODB_BUFFER_PAGE.FIX_COUNT
     *
     * @mbg.generated
     */
    public void setFixCount(Long fixCount) {
        this.fixCount = fixCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.IS_HASHED
     *
     * @return the value of INNODB_BUFFER_PAGE.IS_HASHED
     *
     * @mbg.generated
     */
    public String getIsHashed() {
        return isHashed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.IS_HASHED
     *
     * @param isHashed the value for INNODB_BUFFER_PAGE.IS_HASHED
     *
     * @mbg.generated
     */
    public void setIsHashed(String isHashed) {
        this.isHashed = isHashed == null ? null : isHashed.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.NEWEST_MODIFICATION
     *
     * @return the value of INNODB_BUFFER_PAGE.NEWEST_MODIFICATION
     *
     * @mbg.generated
     */
    public Long getNewestModification() {
        return newestModification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.NEWEST_MODIFICATION
     *
     * @param newestModification the value for INNODB_BUFFER_PAGE.NEWEST_MODIFICATION
     *
     * @mbg.generated
     */
    public void setNewestModification(Long newestModification) {
        this.newestModification = newestModification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.OLDEST_MODIFICATION
     *
     * @return the value of INNODB_BUFFER_PAGE.OLDEST_MODIFICATION
     *
     * @mbg.generated
     */
    public Long getOldestModification() {
        return oldestModification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.OLDEST_MODIFICATION
     *
     * @param oldestModification the value for INNODB_BUFFER_PAGE.OLDEST_MODIFICATION
     *
     * @mbg.generated
     */
    public void setOldestModification(Long oldestModification) {
        this.oldestModification = oldestModification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.ACCESS_TIME
     *
     * @return the value of INNODB_BUFFER_PAGE.ACCESS_TIME
     *
     * @mbg.generated
     */
    public Long getAccessTime() {
        return accessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.ACCESS_TIME
     *
     * @param accessTime the value for INNODB_BUFFER_PAGE.ACCESS_TIME
     *
     * @mbg.generated
     */
    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.TABLE_NAME
     *
     * @return the value of INNODB_BUFFER_PAGE.TABLE_NAME
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.TABLE_NAME
     *
     * @param tableName the value for INNODB_BUFFER_PAGE.TABLE_NAME
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.INDEX_NAME
     *
     * @return the value of INNODB_BUFFER_PAGE.INDEX_NAME
     *
     * @mbg.generated
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.INDEX_NAME
     *
     * @param indexName the value for INNODB_BUFFER_PAGE.INDEX_NAME
     *
     * @mbg.generated
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.NUMBER_RECORDS
     *
     * @return the value of INNODB_BUFFER_PAGE.NUMBER_RECORDS
     *
     * @mbg.generated
     */
    public Long getNumberRecords() {
        return numberRecords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.NUMBER_RECORDS
     *
     * @param numberRecords the value for INNODB_BUFFER_PAGE.NUMBER_RECORDS
     *
     * @mbg.generated
     */
    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.DATA_SIZE
     *
     * @return the value of INNODB_BUFFER_PAGE.DATA_SIZE
     *
     * @mbg.generated
     */
    public Long getDataSize() {
        return dataSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.DATA_SIZE
     *
     * @param dataSize the value for INNODB_BUFFER_PAGE.DATA_SIZE
     *
     * @mbg.generated
     */
    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.COMPRESSED_SIZE
     *
     * @return the value of INNODB_BUFFER_PAGE.COMPRESSED_SIZE
     *
     * @mbg.generated
     */
    public Long getCompressedSize() {
        return compressedSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.COMPRESSED_SIZE
     *
     * @param compressedSize the value for INNODB_BUFFER_PAGE.COMPRESSED_SIZE
     *
     * @mbg.generated
     */
    public void setCompressedSize(Long compressedSize) {
        this.compressedSize = compressedSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.PAGE_STATE
     *
     * @return the value of INNODB_BUFFER_PAGE.PAGE_STATE
     *
     * @mbg.generated
     */
    public String getPageState() {
        return pageState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.PAGE_STATE
     *
     * @param pageState the value for INNODB_BUFFER_PAGE.PAGE_STATE
     *
     * @mbg.generated
     */
    public void setPageState(String pageState) {
        this.pageState = pageState == null ? null : pageState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.IO_FIX
     *
     * @return the value of INNODB_BUFFER_PAGE.IO_FIX
     *
     * @mbg.generated
     */
    public String getIoFix() {
        return ioFix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.IO_FIX
     *
     * @param ioFix the value for INNODB_BUFFER_PAGE.IO_FIX
     *
     * @mbg.generated
     */
    public void setIoFix(String ioFix) {
        this.ioFix = ioFix == null ? null : ioFix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.IS_OLD
     *
     * @return the value of INNODB_BUFFER_PAGE.IS_OLD
     *
     * @mbg.generated
     */
    public String getIsOld() {
        return isOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.IS_OLD
     *
     * @param isOld the value for INNODB_BUFFER_PAGE.IS_OLD
     *
     * @mbg.generated
     */
    public void setIsOld(String isOld) {
        this.isOld = isOld == null ? null : isOld.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK
     *
     * @return the value of INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK
     *
     * @mbg.generated
     */
    public Long getFreePageClock() {
        return freePageClock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK
     *
     * @param freePageClock the value for INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK
     *
     * @mbg.generated
     */
    public void setFreePageClock(Long freePageClock) {
        this.freePageClock = freePageClock;
    }
}