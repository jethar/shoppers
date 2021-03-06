//
// ProductCustomOptionInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/**  */
open class ProductCustomOptionInterface: JSONEncodable {
    /** Product SKU */
    public var productSku: String?
    /** Option id */
    public var optionId: Int32?
    /** Option title */
    public var title: String?
    /** Option type */
    public var type: String?
    /** Sort order */
    public var sortOrder: Int32?
    /** Is require */
    public var isRequire: Bool?
    /** Price */
    public var price: Double?
    /** Price type */
    public var priceType: String?
    /** Sku */
    public var sku: String?
    public var fileExtension: String?
    public var maxCharacters: Int32?
    public var imageSizeX: Int32?
    public var imageSizeY: Int32?
    public var values: [ProductCustomOptionValuesInterface]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["product_sku"] = self.productSku
        nillableDictionary["option_id"] = self.optionId?.encodeToJSON()
        nillableDictionary["title"] = self.title
        nillableDictionary["type"] = self.type
        nillableDictionary["sort_order"] = self.sortOrder?.encodeToJSON()
        nillableDictionary["is_require"] = self.isRequire
        nillableDictionary["price"] = self.price
        nillableDictionary["price_type"] = self.priceType
        nillableDictionary["sku"] = self.sku
        nillableDictionary["file_extension"] = self.fileExtension
        nillableDictionary["max_characters"] = self.maxCharacters?.encodeToJSON()
        nillableDictionary["image_size_x"] = self.imageSizeX?.encodeToJSON()
        nillableDictionary["image_size_y"] = self.imageSizeY?.encodeToJSON()
        nillableDictionary["values"] = self.values?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
