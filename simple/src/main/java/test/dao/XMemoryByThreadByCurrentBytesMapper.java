package test.dao;

import java.util.List;
import test.model.XMemoryByThreadByCurrentBytes;

public interface XMemoryByThreadByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated
     */
    int insert(XMemoryByThreadByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_thread_by_current_bytes
     *
     * @mbg.generated
     */
    List<XMemoryByThreadByCurrentBytes> selectAll();
}