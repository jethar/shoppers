//
// BundleDataLinkInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Interface LinkInterface */
open class BundleDataLinkInterface: JSONEncodable {
    /** The identifier */
    public var id: String?
    /** Linked product sku */
    public var sku: String?
    /** Option id */
    public var optionId: Int32?
    /** Qty */
    public var qty: Double?
    /** Position */
    public var position: Int32?
    /** Is default */
    public var isDefault: Bool?
    /** Price */
    public var price: Double?
    /** Price type */
    public var priceType: Int32?
    /** Whether quantity could be changed */
    public var canChangeQuantity: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["sku"] = self.sku
        nillableDictionary["option_id"] = self.optionId?.encodeToJSON()
        nillableDictionary["qty"] = self.qty
        nillableDictionary["position"] = self.position?.encodeToJSON()
        nillableDictionary["is_default"] = self.isDefault
        nillableDictionary["price"] = self.price
        nillableDictionary["price_type"] = self.priceType?.encodeToJSON()
        nillableDictionary["can_change_quantity"] = self.canChangeQuantity?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
