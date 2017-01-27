//
// CatalogInventoryDataStockItemInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Interface StockItem */
open class CatalogInventoryDataStockItemInterface: JSONEncodable {
    public var itemId: Int32?
    public var productId: Int32?
    /** Stock identifier */
    public var stockId: Int32?
    public var qty: Double?
    /** Stock Availability */
    public var isInStock: Bool?
    public var isQtyDecimal: Bool?
    public var showDefaultNotificationMessage: Bool?
    public var useConfigMinQty: Bool?
    /** Minimal quantity available for item status in stock */
    public var minQty: Double?
    public var useConfigMinSaleQty: Int32?
    /** Minimum Qty Allowed in Shopping Cart or NULL when there is no limitation */
    public var minSaleQty: Double?
    public var useConfigMaxSaleQty: Bool?
    /** Maximum Qty Allowed in Shopping Cart data wrapper */
    public var maxSaleQty: Double?
    public var useConfigBackorders: Bool?
    /** Backorders status */
    public var backorders: Int32?
    public var useConfigNotifyStockQty: Bool?
    /** Notify for Quantity Below data wrapper */
    public var notifyStockQty: Double?
    public var useConfigQtyIncrements: Bool?
    /** Quantity Increments data wrapper */
    public var qtyIncrements: Double?
    public var useConfigEnableQtyInc: Bool?
    /** Whether Quantity Increments is enabled */
    public var enableQtyIncrements: Bool?
    public var useConfigManageStock: Bool?
    /** Can Manage Stock */
    public var manageStock: Bool?
    public var lowStockDate: String?
    public var isDecimalDivided: Bool?
    public var stockStatusChangedAuto: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["item_id"] = self.itemId?.encodeToJSON()
        nillableDictionary["product_id"] = self.productId?.encodeToJSON()
        nillableDictionary["stock_id"] = self.stockId?.encodeToJSON()
        nillableDictionary["qty"] = self.qty
        nillableDictionary["is_in_stock"] = self.isInStock
        nillableDictionary["is_qty_decimal"] = self.isQtyDecimal
        nillableDictionary["show_default_notification_message"] = self.showDefaultNotificationMessage
        nillableDictionary["use_config_min_qty"] = self.useConfigMinQty
        nillableDictionary["min_qty"] = self.minQty
        nillableDictionary["use_config_min_sale_qty"] = self.useConfigMinSaleQty?.encodeToJSON()
        nillableDictionary["min_sale_qty"] = self.minSaleQty
        nillableDictionary["use_config_max_sale_qty"] = self.useConfigMaxSaleQty
        nillableDictionary["max_sale_qty"] = self.maxSaleQty
        nillableDictionary["use_config_backorders"] = self.useConfigBackorders
        nillableDictionary["backorders"] = self.backorders?.encodeToJSON()
        nillableDictionary["use_config_notify_stock_qty"] = self.useConfigNotifyStockQty
        nillableDictionary["notify_stock_qty"] = self.notifyStockQty
        nillableDictionary["use_config_qty_increments"] = self.useConfigQtyIncrements
        nillableDictionary["qty_increments"] = self.qtyIncrements
        nillableDictionary["use_config_enable_qty_inc"] = self.useConfigEnableQtyInc
        nillableDictionary["enable_qty_increments"] = self.enableQtyIncrements
        nillableDictionary["use_config_manage_stock"] = self.useConfigManageStock
        nillableDictionary["manage_stock"] = self.manageStock
        nillableDictionary["low_stock_date"] = self.lowStockDate
        nillableDictionary["is_decimal_divided"] = self.isDecimalDivided
        nillableDictionary["stock_status_changed_auto"] = self.stockStatusChangedAuto?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
