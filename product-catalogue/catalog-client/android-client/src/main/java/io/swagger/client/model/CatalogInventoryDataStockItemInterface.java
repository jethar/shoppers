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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Interface StockItem
 **/
@ApiModel(description = "Interface StockItem")
public class CatalogInventoryDataStockItemInterface {
  
  @SerializedName("item_id")
  private Integer itemId = null;
  @SerializedName("product_id")
  private Integer productId = null;
  @SerializedName("stock_id")
  private Integer stockId = null;
  @SerializedName("qty")
  private BigDecimal qty = null;
  @SerializedName("is_in_stock")
  private Boolean isInStock = null;
  @SerializedName("is_qty_decimal")
  private Boolean isQtyDecimal = null;
  @SerializedName("show_default_notification_message")
  private Boolean showDefaultNotificationMessage = null;
  @SerializedName("use_config_min_qty")
  private Boolean useConfigMinQty = null;
  @SerializedName("min_qty")
  private BigDecimal minQty = null;
  @SerializedName("use_config_min_sale_qty")
  private Integer useConfigMinSaleQty = null;
  @SerializedName("min_sale_qty")
  private BigDecimal minSaleQty = null;
  @SerializedName("use_config_max_sale_qty")
  private Boolean useConfigMaxSaleQty = null;
  @SerializedName("max_sale_qty")
  private BigDecimal maxSaleQty = null;
  @SerializedName("use_config_backorders")
  private Boolean useConfigBackorders = null;
  @SerializedName("backorders")
  private Integer backorders = null;
  @SerializedName("use_config_notify_stock_qty")
  private Boolean useConfigNotifyStockQty = null;
  @SerializedName("notify_stock_qty")
  private BigDecimal notifyStockQty = null;
  @SerializedName("use_config_qty_increments")
  private Boolean useConfigQtyIncrements = null;
  @SerializedName("qty_increments")
  private BigDecimal qtyIncrements = null;
  @SerializedName("use_config_enable_qty_inc")
  private Boolean useConfigEnableQtyInc = null;
  @SerializedName("enable_qty_increments")
  private Boolean enableQtyIncrements = null;
  @SerializedName("use_config_manage_stock")
  private Boolean useConfigManageStock = null;
  @SerializedName("manage_stock")
  private Boolean manageStock = null;
  @SerializedName("low_stock_date")
  private String lowStockDate = null;
  @SerializedName("is_decimal_divided")
  private Boolean isDecimalDivided = null;
  @SerializedName("stock_status_changed_auto")
  private Integer stockStatusChangedAuto = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getItemId() {
    return itemId;
  }
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  /**
   * Stock identifier
   **/
  @ApiModelProperty(value = "Stock identifier")
  public Integer getStockId() {
    return stockId;
  }
  public void setStockId(Integer stockId) {
    this.stockId = stockId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQty() {
    return qty;
  }
  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }

  /**
   * Stock Availability
   **/
  @ApiModelProperty(required = true, value = "Stock Availability")
  public Boolean getIsInStock() {
    return isInStock;
  }
  public void setIsInStock(Boolean isInStock) {
    this.isInStock = isInStock;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsQtyDecimal() {
    return isQtyDecimal;
  }
  public void setIsQtyDecimal(Boolean isQtyDecimal) {
    this.isQtyDecimal = isQtyDecimal;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getShowDefaultNotificationMessage() {
    return showDefaultNotificationMessage;
  }
  public void setShowDefaultNotificationMessage(Boolean showDefaultNotificationMessage) {
    this.showDefaultNotificationMessage = showDefaultNotificationMessage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getUseConfigMinQty() {
    return useConfigMinQty;
  }
  public void setUseConfigMinQty(Boolean useConfigMinQty) {
    this.useConfigMinQty = useConfigMinQty;
  }

  /**
   * Minimal quantity available for item status in stock
   **/
  @ApiModelProperty(required = true, value = "Minimal quantity available for item status in stock")
  public BigDecimal getMinQty() {
    return minQty;
  }
  public void setMinQty(BigDecimal minQty) {
    this.minQty = minQty;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUseConfigMinSaleQty() {
    return useConfigMinSaleQty;
  }
  public void setUseConfigMinSaleQty(Integer useConfigMinSaleQty) {
    this.useConfigMinSaleQty = useConfigMinSaleQty;
  }

  /**
   * Minimum Qty Allowed in Shopping Cart or NULL when there is no limitation
   **/
  @ApiModelProperty(required = true, value = "Minimum Qty Allowed in Shopping Cart or NULL when there is no limitation")
  public BigDecimal getMinSaleQty() {
    return minSaleQty;
  }
  public void setMinSaleQty(BigDecimal minSaleQty) {
    this.minSaleQty = minSaleQty;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getUseConfigMaxSaleQty() {
    return useConfigMaxSaleQty;
  }
  public void setUseConfigMaxSaleQty(Boolean useConfigMaxSaleQty) {
    this.useConfigMaxSaleQty = useConfigMaxSaleQty;
  }

  /**
   * Maximum Qty Allowed in Shopping Cart data wrapper
   **/
  @ApiModelProperty(required = true, value = "Maximum Qty Allowed in Shopping Cart data wrapper")
  public BigDecimal getMaxSaleQty() {
    return maxSaleQty;
  }
  public void setMaxSaleQty(BigDecimal maxSaleQty) {
    this.maxSaleQty = maxSaleQty;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getUseConfigBackorders() {
    return useConfigBackorders;
  }
  public void setUseConfigBackorders(Boolean useConfigBackorders) {
    this.useConfigBackorders = useConfigBackorders;
  }

  /**
   * Backorders status
   **/
  @ApiModelProperty(required = true, value = "Backorders status")
  public Integer getBackorders() {
    return backorders;
  }
  public void setBackorders(Integer backorders) {
    this.backorders = backorders;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getUseConfigNotifyStockQty() {
    return useConfigNotifyStockQty;
  }
  public void setUseConfigNotifyStockQty(Boolean useConfigNotifyStockQty) {
    this.useConfigNotifyStockQty = useConfigNotifyStockQty;
  }

  /**
   * Notify for Quantity Below data wrapper
   **/
  @ApiModelProperty(required = true, value = "Notify for Quantity Below data wrapper")
  public BigDecimal getNotifyStockQty() {
    return notifyStockQty;
  }
  public void setNotifyStockQty(BigDecimal notifyStockQty) {
    this.notifyStockQty = notifyStockQty;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getUseConfigQtyIncrements() {
    return useConfigQtyIncrements;
  }
  public void setUseConfigQtyIncrements(Boolean useConfigQtyIncrements) {
    this.useConfigQtyIncrements = useConfigQtyIncrements;
  }

  /**
   * Quantity Increments data wrapper
   **/
  @ApiModelProperty(required = true, value = "Quantity Increments data wrapper")
  public BigDecimal getQtyIncrements() {
    return qtyIncrements;
  }
  public void setQtyIncrements(BigDecimal qtyIncrements) {
    this.qtyIncrements = qtyIncrements;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getUseConfigEnableQtyInc() {
    return useConfigEnableQtyInc;
  }
  public void setUseConfigEnableQtyInc(Boolean useConfigEnableQtyInc) {
    this.useConfigEnableQtyInc = useConfigEnableQtyInc;
  }

  /**
   * Whether Quantity Increments is enabled
   **/
  @ApiModelProperty(required = true, value = "Whether Quantity Increments is enabled")
  public Boolean getEnableQtyIncrements() {
    return enableQtyIncrements;
  }
  public void setEnableQtyIncrements(Boolean enableQtyIncrements) {
    this.enableQtyIncrements = enableQtyIncrements;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getUseConfigManageStock() {
    return useConfigManageStock;
  }
  public void setUseConfigManageStock(Boolean useConfigManageStock) {
    this.useConfigManageStock = useConfigManageStock;
  }

  /**
   * Can Manage Stock
   **/
  @ApiModelProperty(required = true, value = "Can Manage Stock")
  public Boolean getManageStock() {
    return manageStock;
  }
  public void setManageStock(Boolean manageStock) {
    this.manageStock = manageStock;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLowStockDate() {
    return lowStockDate;
  }
  public void setLowStockDate(String lowStockDate) {
    this.lowStockDate = lowStockDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsDecimalDivided() {
    return isDecimalDivided;
  }
  public void setIsDecimalDivided(Boolean isDecimalDivided) {
    this.isDecimalDivided = isDecimalDivided;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStockStatusChangedAuto() {
    return stockStatusChangedAuto;
  }
  public void setStockStatusChangedAuto(Integer stockStatusChangedAuto) {
    this.stockStatusChangedAuto = stockStatusChangedAuto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogInventoryDataStockItemInterface catalogInventoryDataStockItemInterface = (CatalogInventoryDataStockItemInterface) o;
    return (this.itemId == null ? catalogInventoryDataStockItemInterface.itemId == null : this.itemId.equals(catalogInventoryDataStockItemInterface.itemId)) &&
        (this.productId == null ? catalogInventoryDataStockItemInterface.productId == null : this.productId.equals(catalogInventoryDataStockItemInterface.productId)) &&
        (this.stockId == null ? catalogInventoryDataStockItemInterface.stockId == null : this.stockId.equals(catalogInventoryDataStockItemInterface.stockId)) &&
        (this.qty == null ? catalogInventoryDataStockItemInterface.qty == null : this.qty.equals(catalogInventoryDataStockItemInterface.qty)) &&
        (this.isInStock == null ? catalogInventoryDataStockItemInterface.isInStock == null : this.isInStock.equals(catalogInventoryDataStockItemInterface.isInStock)) &&
        (this.isQtyDecimal == null ? catalogInventoryDataStockItemInterface.isQtyDecimal == null : this.isQtyDecimal.equals(catalogInventoryDataStockItemInterface.isQtyDecimal)) &&
        (this.showDefaultNotificationMessage == null ? catalogInventoryDataStockItemInterface.showDefaultNotificationMessage == null : this.showDefaultNotificationMessage.equals(catalogInventoryDataStockItemInterface.showDefaultNotificationMessage)) &&
        (this.useConfigMinQty == null ? catalogInventoryDataStockItemInterface.useConfigMinQty == null : this.useConfigMinQty.equals(catalogInventoryDataStockItemInterface.useConfigMinQty)) &&
        (this.minQty == null ? catalogInventoryDataStockItemInterface.minQty == null : this.minQty.equals(catalogInventoryDataStockItemInterface.minQty)) &&
        (this.useConfigMinSaleQty == null ? catalogInventoryDataStockItemInterface.useConfigMinSaleQty == null : this.useConfigMinSaleQty.equals(catalogInventoryDataStockItemInterface.useConfigMinSaleQty)) &&
        (this.minSaleQty == null ? catalogInventoryDataStockItemInterface.minSaleQty == null : this.minSaleQty.equals(catalogInventoryDataStockItemInterface.minSaleQty)) &&
        (this.useConfigMaxSaleQty == null ? catalogInventoryDataStockItemInterface.useConfigMaxSaleQty == null : this.useConfigMaxSaleQty.equals(catalogInventoryDataStockItemInterface.useConfigMaxSaleQty)) &&
        (this.maxSaleQty == null ? catalogInventoryDataStockItemInterface.maxSaleQty == null : this.maxSaleQty.equals(catalogInventoryDataStockItemInterface.maxSaleQty)) &&
        (this.useConfigBackorders == null ? catalogInventoryDataStockItemInterface.useConfigBackorders == null : this.useConfigBackorders.equals(catalogInventoryDataStockItemInterface.useConfigBackorders)) &&
        (this.backorders == null ? catalogInventoryDataStockItemInterface.backorders == null : this.backorders.equals(catalogInventoryDataStockItemInterface.backorders)) &&
        (this.useConfigNotifyStockQty == null ? catalogInventoryDataStockItemInterface.useConfigNotifyStockQty == null : this.useConfigNotifyStockQty.equals(catalogInventoryDataStockItemInterface.useConfigNotifyStockQty)) &&
        (this.notifyStockQty == null ? catalogInventoryDataStockItemInterface.notifyStockQty == null : this.notifyStockQty.equals(catalogInventoryDataStockItemInterface.notifyStockQty)) &&
        (this.useConfigQtyIncrements == null ? catalogInventoryDataStockItemInterface.useConfigQtyIncrements == null : this.useConfigQtyIncrements.equals(catalogInventoryDataStockItemInterface.useConfigQtyIncrements)) &&
        (this.qtyIncrements == null ? catalogInventoryDataStockItemInterface.qtyIncrements == null : this.qtyIncrements.equals(catalogInventoryDataStockItemInterface.qtyIncrements)) &&
        (this.useConfigEnableQtyInc == null ? catalogInventoryDataStockItemInterface.useConfigEnableQtyInc == null : this.useConfigEnableQtyInc.equals(catalogInventoryDataStockItemInterface.useConfigEnableQtyInc)) &&
        (this.enableQtyIncrements == null ? catalogInventoryDataStockItemInterface.enableQtyIncrements == null : this.enableQtyIncrements.equals(catalogInventoryDataStockItemInterface.enableQtyIncrements)) &&
        (this.useConfigManageStock == null ? catalogInventoryDataStockItemInterface.useConfigManageStock == null : this.useConfigManageStock.equals(catalogInventoryDataStockItemInterface.useConfigManageStock)) &&
        (this.manageStock == null ? catalogInventoryDataStockItemInterface.manageStock == null : this.manageStock.equals(catalogInventoryDataStockItemInterface.manageStock)) &&
        (this.lowStockDate == null ? catalogInventoryDataStockItemInterface.lowStockDate == null : this.lowStockDate.equals(catalogInventoryDataStockItemInterface.lowStockDate)) &&
        (this.isDecimalDivided == null ? catalogInventoryDataStockItemInterface.isDecimalDivided == null : this.isDecimalDivided.equals(catalogInventoryDataStockItemInterface.isDecimalDivided)) &&
        (this.stockStatusChangedAuto == null ? catalogInventoryDataStockItemInterface.stockStatusChangedAuto == null : this.stockStatusChangedAuto.equals(catalogInventoryDataStockItemInterface.stockStatusChangedAuto));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    result = 31 * result + (this.productId == null ? 0: this.productId.hashCode());
    result = 31 * result + (this.stockId == null ? 0: this.stockId.hashCode());
    result = 31 * result + (this.qty == null ? 0: this.qty.hashCode());
    result = 31 * result + (this.isInStock == null ? 0: this.isInStock.hashCode());
    result = 31 * result + (this.isQtyDecimal == null ? 0: this.isQtyDecimal.hashCode());
    result = 31 * result + (this.showDefaultNotificationMessage == null ? 0: this.showDefaultNotificationMessage.hashCode());
    result = 31 * result + (this.useConfigMinQty == null ? 0: this.useConfigMinQty.hashCode());
    result = 31 * result + (this.minQty == null ? 0: this.minQty.hashCode());
    result = 31 * result + (this.useConfigMinSaleQty == null ? 0: this.useConfigMinSaleQty.hashCode());
    result = 31 * result + (this.minSaleQty == null ? 0: this.minSaleQty.hashCode());
    result = 31 * result + (this.useConfigMaxSaleQty == null ? 0: this.useConfigMaxSaleQty.hashCode());
    result = 31 * result + (this.maxSaleQty == null ? 0: this.maxSaleQty.hashCode());
    result = 31 * result + (this.useConfigBackorders == null ? 0: this.useConfigBackorders.hashCode());
    result = 31 * result + (this.backorders == null ? 0: this.backorders.hashCode());
    result = 31 * result + (this.useConfigNotifyStockQty == null ? 0: this.useConfigNotifyStockQty.hashCode());
    result = 31 * result + (this.notifyStockQty == null ? 0: this.notifyStockQty.hashCode());
    result = 31 * result + (this.useConfigQtyIncrements == null ? 0: this.useConfigQtyIncrements.hashCode());
    result = 31 * result + (this.qtyIncrements == null ? 0: this.qtyIncrements.hashCode());
    result = 31 * result + (this.useConfigEnableQtyInc == null ? 0: this.useConfigEnableQtyInc.hashCode());
    result = 31 * result + (this.enableQtyIncrements == null ? 0: this.enableQtyIncrements.hashCode());
    result = 31 * result + (this.useConfigManageStock == null ? 0: this.useConfigManageStock.hashCode());
    result = 31 * result + (this.manageStock == null ? 0: this.manageStock.hashCode());
    result = 31 * result + (this.lowStockDate == null ? 0: this.lowStockDate.hashCode());
    result = 31 * result + (this.isDecimalDivided == null ? 0: this.isDecimalDivided.hashCode());
    result = 31 * result + (this.stockStatusChangedAuto == null ? 0: this.stockStatusChangedAuto.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogInventoryDataStockItemInterface {\n");
    
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  stockId: ").append(stockId).append("\n");
    sb.append("  qty: ").append(qty).append("\n");
    sb.append("  isInStock: ").append(isInStock).append("\n");
    sb.append("  isQtyDecimal: ").append(isQtyDecimal).append("\n");
    sb.append("  showDefaultNotificationMessage: ").append(showDefaultNotificationMessage).append("\n");
    sb.append("  useConfigMinQty: ").append(useConfigMinQty).append("\n");
    sb.append("  minQty: ").append(minQty).append("\n");
    sb.append("  useConfigMinSaleQty: ").append(useConfigMinSaleQty).append("\n");
    sb.append("  minSaleQty: ").append(minSaleQty).append("\n");
    sb.append("  useConfigMaxSaleQty: ").append(useConfigMaxSaleQty).append("\n");
    sb.append("  maxSaleQty: ").append(maxSaleQty).append("\n");
    sb.append("  useConfigBackorders: ").append(useConfigBackorders).append("\n");
    sb.append("  backorders: ").append(backorders).append("\n");
    sb.append("  useConfigNotifyStockQty: ").append(useConfigNotifyStockQty).append("\n");
    sb.append("  notifyStockQty: ").append(notifyStockQty).append("\n");
    sb.append("  useConfigQtyIncrements: ").append(useConfigQtyIncrements).append("\n");
    sb.append("  qtyIncrements: ").append(qtyIncrements).append("\n");
    sb.append("  useConfigEnableQtyInc: ").append(useConfigEnableQtyInc).append("\n");
    sb.append("  enableQtyIncrements: ").append(enableQtyIncrements).append("\n");
    sb.append("  useConfigManageStock: ").append(useConfigManageStock).append("\n");
    sb.append("  manageStock: ").append(manageStock).append("\n");
    sb.append("  lowStockDate: ").append(lowStockDate).append("\n");
    sb.append("  isDecimalDivided: ").append(isDecimalDivided).append("\n");
    sb.append("  stockStatusChangedAuto: ").append(stockStatusChangedAuto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
