package test.dao;

import java.util.List;
import test.model.StatementAnalysis;

public interface StatementAnalysisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statement_analysis
     *
     * @mbg.generated
     */
    int insert(StatementAnalysis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statement_analysis
     *
     * @mbg.generated
     */
    List<StatementAnalysis> selectAll();
}