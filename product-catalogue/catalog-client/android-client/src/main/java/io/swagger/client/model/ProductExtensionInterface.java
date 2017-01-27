/**
 * Shoppers OpenAPI
 * This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.BundleDataOptionInterface;
import io.swagger.client.model.CatalogInventoryDataStockItemInterface;
import io.swagger.client.model.ConfigurableProductDataOptionInterface;
import io.swagger.client.model.DownloadableDataLinkInterface;
import io.swagger.client.model.DownloadableDataSampleInterface;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * extending
 **/
@ApiModel(description = "extending")
public class ProductExtensionInterface {
  
  @SerializedName("stock_item")
  private CatalogInventoryDataStockItemInterface stockItem = null;
  @SerializedName("bundle_product_options")
  private List<BundleDataOptionInterface> bundleProductOptions = null;
  @SerializedName("downloadable_product_links")
  private List<DownloadableDataLinkInterface> downloadableProductLinks = null;
  @SerializedName("downloadable_product_samples")
  private List<DownloadableDataSampleInterface> downloadableProductSamples = null;
  @SerializedName("configurable_product_options")
  private List<ConfigurableProductDataOptionInterface> configurableProductOptions = null;
  @SerializedName("configurable_product_links")
  private List<Integer> configurableProductLinks = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogInventoryDataStockItemInterface getStockItem() {
    return stockItem;
  }
  public void setStockItem(CatalogInventoryDataStockItemInterface stockItem) {
    this.stockItem = stockItem;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BundleDataOptionInterface> getBundleProductOptions() {
    return bundleProductOptions;
  }
  public void setBundleProductOptions(List<BundleDataOptionInterface> bundleProductOptions) {
    this.bundleProductOptions = bundleProductOptions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DownloadableDataLinkInterface> getDownloadableProductLinks() {
    return downloadableProductLinks;
  }
  public void setDownloadableProductLinks(List<DownloadableDataLinkInterface> downloadableProductLinks) {
    this.downloadableProductLinks = downloadableProductLinks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DownloadableDataSampleInterface> getDownloadableProductSamples() {
    return downloadableProductSamples;
  }
  public void setDownloadableProductSamples(List<DownloadableDataSampleInterface> downloadableProductSamples) {
    this.downloadableProductSamples = downloadableProductSamples;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConfigurableProductDataOptionInterface> getConfigurableProductOptions() {
    return configurableProductOptions;
  }
  public void setConfigurableProductOptions(List<ConfigurableProductDataOptionInterface> configurableProductOptions) {
    this.configurableProductOptions = configurableProductOptions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getConfigurableProductLinks() {
    return configurableProductLinks;
  }
  public void setConfigurableProductLinks(List<Integer> configurableProductLinks) {
    this.configurableProductLinks = configurableProductLinks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductExtensionInterface productExtensionInterface = (ProductExtensionInterface) o;
    return (this.stockItem == null ? productExtensionInterface.stockItem == null : this.stockItem.equals(productExtensionInterface.stockItem)) &&
        (this.bundleProductOptions == null ? productExtensionInterface.bundleProductOptions == null : this.bundleProductOptions.equals(productExtensionInterface.bundleProductOptions)) &&
        (this.downloadableProductLinks == null ? productExtensionInterface.downloadableProductLinks == null : this.downloadableProductLinks.equals(productExtensionInterface.downloadableProductLinks)) &&
        (this.downloadableProductSamples == null ? productExtensionInterface.downloadableProductSamples == null : this.downloadableProductSamples.equals(productExtensionInterface.downloadableProductSamples)) &&
        (this.configurableProductOptions == null ? productExtensionInterface.configurableProductOptions == null : this.configurableProductOptions.equals(productExtensionInterface.configurableProductOptions)) &&
        (this.configurableProductLinks == null ? productExtensionInterface.configurableProductLinks == null : this.configurableProductLinks.equals(productExtensionInterface.configurableProductLinks));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.stockItem == null ? 0: this.stockItem.hashCode());
    result = 31 * result + (this.bundleProductOptions == null ? 0: this.bundleProductOptions.hashCode());
    result = 31 * result + (this.downloadableProductLinks == null ? 0: this.downloadableProductLinks.hashCode());
    result = 31 * result + (this.downloadableProductSamples == null ? 0: this.downloadableProductSamples.hashCode());
    result = 31 * result + (this.configurableProductOptions == null ? 0: this.configurableProductOptions.hashCode());
    result = 31 * result + (this.configurableProductLinks == null ? 0: this.configurableProductLinks.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductExtensionInterface {\n");
    
    sb.append("  stockItem: ").append(stockItem).append("\n");
    sb.append("  bundleProductOptions: ").append(bundleProductOptions).append("\n");
    sb.append("  downloadableProductLinks: ").append(downloadableProductLinks).append("\n");
    sb.append("  downloadableProductSamples: ").append(downloadableProductSamples).append("\n");
    sb.append("  configurableProductOptions: ").append(configurableProductOptions).append("\n");
    sb.append("  configurableProductLinks: ").append(configurableProductLinks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
