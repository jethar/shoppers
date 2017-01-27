//
// ProductExtensionInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** extending */
open class ProductExtensionInterface: JSONEncodable {
    public var stockItem: InventoryDataStockItemInterface?
    public var bundleProductOptions: [BundleDataOptionInterface]?
    public var configurableProductOptions: [ConfigurableProductDataOptionInterface]?
    public var configurableProductLinks: [Int32]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["stock_item"] = self.stockItem?.encodeToJSON()
        nillableDictionary["bundle_product_options"] = self.bundleProductOptions?.encodeToJSON()
        nillableDictionary["configurable_product_options"] = self.configurableProductOptions?.encodeToJSON()
        nillableDictionary["configurable_product_links"] = self.configurableProductLinks?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}