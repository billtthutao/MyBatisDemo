package test.dao;

import java.util.List;
import test.model.XMemoryByHostByCurrentBytes;

public interface XMemoryByHostByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    int insert(XMemoryByHostByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    List<XMemoryByHostByCurrentBytes> selectAll();
}