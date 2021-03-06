/**
 * NANA Store API
 * API for NANA Store app
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Category {
  
  @SerializedName("category_id")
  private String categoryId = null;
  @SerializedName("title_ar")
  private String titleAr = null;
  @SerializedName("subtitle_ar")
  private String subtitleAr = null;
  @SerializedName("image")
  private String image = null;
  @SerializedName("title_en")
  private String titleEn = null;
  @SerializedName("subtitle_en")
  private String subtitleEn = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("description_en")
  private String descriptionEn = null;
  @SerializedName("icon")
  private String icon = null;
  @SerializedName("is_offer")
  private Integer isOffer = null;
  @SerializedName("products_count")
  private Integer productsCount = null;
  @SerializedName("subcategory_products_count")
  private Integer subcategoryProductsCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitleAr() {
    return titleAr;
  }
  public void setTitleAr(String titleAr) {
    this.titleAr = titleAr;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubtitleAr() {
    return subtitleAr;
  }
  public void setSubtitleAr(String subtitleAr) {
    this.subtitleAr = subtitleAr;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitleEn() {
    return titleEn;
  }
  public void setTitleEn(String titleEn) {
    this.titleEn = titleEn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubtitleEn() {
    return subtitleEn;
  }
  public void setSubtitleEn(String subtitleEn) {
    this.subtitleEn = subtitleEn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescriptionEn() {
    return descriptionEn;
  }
  public void setDescriptionEn(String descriptionEn) {
    this.descriptionEn = descriptionEn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIsOffer() {
    return isOffer;
  }
  public void setIsOffer(Integer isOffer) {
    this.isOffer = isOffer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getProductsCount() {
    return productsCount;
  }
  public void setProductsCount(Integer productsCount) {
    this.productsCount = productsCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSubcategoryProductsCount() {
    return subcategoryProductsCount;
  }
  public void setSubcategoryProductsCount(Integer subcategoryProductsCount) {
    this.subcategoryProductsCount = subcategoryProductsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return (this.categoryId == null ? category.categoryId == null : this.categoryId.equals(category.categoryId)) &&
        (this.titleAr == null ? category.titleAr == null : this.titleAr.equals(category.titleAr)) &&
        (this.subtitleAr == null ? category.subtitleAr == null : this.subtitleAr.equals(category.subtitleAr)) &&
        (this.image == null ? category.image == null : this.image.equals(category.image)) &&
        (this.titleEn == null ? category.titleEn == null : this.titleEn.equals(category.titleEn)) &&
        (this.subtitleEn == null ? category.subtitleEn == null : this.subtitleEn.equals(category.subtitleEn)) &&
        (this.description == null ? category.description == null : this.description.equals(category.description)) &&
        (this.descriptionEn == null ? category.descriptionEn == null : this.descriptionEn.equals(category.descriptionEn)) &&
        (this.icon == null ? category.icon == null : this.icon.equals(category.icon)) &&
        (this.isOffer == null ? category.isOffer == null : this.isOffer.equals(category.isOffer)) &&
        (this.productsCount == null ? category.productsCount == null : this.productsCount.equals(category.productsCount)) &&
        (this.subcategoryProductsCount == null ? category.subcategoryProductsCount == null : this.subcategoryProductsCount.equals(category.subcategoryProductsCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.categoryId == null ? 0: this.categoryId.hashCode());
    result = 31 * result + (this.titleAr == null ? 0: this.titleAr.hashCode());
    result = 31 * result + (this.subtitleAr == null ? 0: this.subtitleAr.hashCode());
    result = 31 * result + (this.image == null ? 0: this.image.hashCode());
    result = 31 * result + (this.titleEn == null ? 0: this.titleEn.hashCode());
    result = 31 * result + (this.subtitleEn == null ? 0: this.subtitleEn.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.descriptionEn == null ? 0: this.descriptionEn.hashCode());
    result = 31 * result + (this.icon == null ? 0: this.icon.hashCode());
    result = 31 * result + (this.isOffer == null ? 0: this.isOffer.hashCode());
    result = 31 * result + (this.productsCount == null ? 0: this.productsCount.hashCode());
    result = 31 * result + (this.subcategoryProductsCount == null ? 0: this.subcategoryProductsCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("  categoryId: ").append(categoryId).append("\n");
    sb.append("  titleAr: ").append(titleAr).append("\n");
    sb.append("  subtitleAr: ").append(subtitleAr).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  titleEn: ").append(titleEn).append("\n");
    sb.append("  subtitleEn: ").append(subtitleEn).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  descriptionEn: ").append(descriptionEn).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  isOffer: ").append(isOffer).append("\n");
    sb.append("  productsCount: ").append(productsCount).append("\n");
    sb.append("  subcategoryProductsCount: ").append(subcategoryProductsCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
