
# InventoryDataStockItemInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **Integer** |  |  [optional]
**productId** | **Integer** |  |  [optional]
**stockId** | **Integer** | Stock identifier |  [optional]
**qty** | [**BigDecimal**](BigDecimal.md) |  | 
**isInStock** | **Boolean** | Stock Availability | 
**isQtyDecimal** | **Boolean** |  | 
**showDefaultNotificationMessage** | **Boolean** |  | 
**useConfigMinQty** | **Boolean** |  | 
**minQty** | [**BigDecimal**](BigDecimal.md) | Minimal quantity available for item status in stock | 
**useConfigMinSaleQty** | **Integer** |  | 
**minSaleQty** | [**BigDecimal**](BigDecimal.md) | Minimum Qty Allowed in Shopping Cart or NULL when there is no limitation | 
**useConfigMaxSaleQty** | **Boolean** |  | 
**maxSaleQty** | [**BigDecimal**](BigDecimal.md) | Maximum Qty Allowed in Shopping Cart data wrapper | 
**useConfigBackorders** | **Boolean** |  | 
**backorders** | **Integer** | Backorders status | 
**useConfigNotifyStockQty** | **Boolean** |  | 
**notifyStockQty** | [**BigDecimal**](BigDecimal.md) | Notify for Quantity Below data wrapper | 
**useConfigQtyIncrements** | **Boolean** |  | 
**qtyIncrements** | [**BigDecimal**](BigDecimal.md) | Quantity Increments data wrapper | 
**useConfigEnableQtyInc** | **Boolean** |  | 
**enableQtyIncrements** | **Boolean** | Whether Quantity Increments is enabled | 
**useConfigManageStock** | **Boolean** |  | 
**manageStock** | **Boolean** | Can Manage Stock | 
**lowStockDate** | **String** |  | 
**isDecimalDivided** | **Boolean** |  | 
**stockStatusChangedAuto** | **Integer** |  | 



