package test.dao;

import java.util.List;
import test.model.MemoryByThreadByCurrentBytes;

public interface MemoryByThreadByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_by_thread_by_current_bytes
     *
     * @mbg.generated
     */
    int insert(MemoryByThreadByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_by_thread_by_current_bytes
     *
     * @mbg.generated
     */
    List<MemoryByThreadByCurrentBytes> selectAll();
}