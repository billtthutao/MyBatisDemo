package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ST_SPATIAL_REFERENCE_SYSTEMS
 */
public class StSpatialReferenceSystems {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME
     *
     * @mbg.generated
     */
    private String srsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID
     *
     * @mbg.generated
     */
    private Integer srsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION
     *
     * @mbg.generated
     */
    private String organization;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID
     *
     * @mbg.generated
     */
    private Integer organizationCoordsysId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION
     *
     * @mbg.generated
     */
    private String definition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME
     *
     * @return the value of ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME
     *
     * @mbg.generated
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME
     *
     * @param srsName the value for ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME
     *
     * @mbg.generated
     */
    public void setSrsName(String srsName) {
        this.srsName = srsName == null ? null : srsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID
     *
     * @return the value of ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID
     *
     * @mbg.generated
     */
    public Integer getSrsId() {
        return srsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID
     *
     * @param srsId the value for ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID
     *
     * @mbg.generated
     */
    public void setSrsId(Integer srsId) {
        this.srsId = srsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION
     *
     * @return the value of ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION
     *
     * @mbg.generated
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION
     *
     * @param organization the value for ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION
     *
     * @mbg.generated
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID
     *
     * @return the value of ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID
     *
     * @mbg.generated
     */
    public Integer getOrganizationCoordsysId() {
        return organizationCoordsysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID
     *
     * @param organizationCoordsysId the value for ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID
     *
     * @mbg.generated
     */
    public void setOrganizationCoordsysId(Integer organizationCoordsysId) {
        this.organizationCoordsysId = organizationCoordsysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION
     *
     * @return the value of ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION
     *
     * @mbg.generated
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION
     *
     * @param definition the value for ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION
     *
     * @mbg.generated
     */
    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION
     *
     * @return the value of ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION
     *
     * @param description the value for ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}