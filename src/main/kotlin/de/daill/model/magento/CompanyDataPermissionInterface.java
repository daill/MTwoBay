/*
 * Commerce Admin REST endpoints - All inclusive
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.4.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.daill.model.magento;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


/**
 * Permission interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CompanyDataPermissionInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private Integer roleId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private String permission;


  public CompanyDataPermissionInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id.
   * @return id
  **/



  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CompanyDataPermissionInterface roleId(Integer roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Role id.
   * @return roleId
  **/



  public Integer getRoleId() {
    return roleId;
  }


  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public CompanyDataPermissionInterface resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Resource id.
   * @return resourceId
  **/


  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public CompanyDataPermissionInterface permission(String permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Permission.
   * @return permission
  **/


  public String getPermission() {
    return permission;
  }


  public void setPermission(String permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyDataPermissionInterface companyDataPermissionInterface = (CompanyDataPermissionInterface) o;
    return Objects.equals(this.id, companyDataPermissionInterface.id) &&
        Objects.equals(this.roleId, companyDataPermissionInterface.roleId) &&
        Objects.equals(this.resourceId, companyDataPermissionInterface.resourceId) &&
        Objects.equals(this.permission, companyDataPermissionInterface.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roleId, resourceId, permission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyDataPermissionInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
