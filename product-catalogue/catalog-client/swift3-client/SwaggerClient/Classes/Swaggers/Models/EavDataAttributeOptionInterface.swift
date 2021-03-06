//
// EavDataAttributeOptionInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Created from: */
open class EavDataAttributeOptionInterface: JSONEncodable {
    /** Option label */
    public var label: String?
    /** Option value */
    public var value: String?
    /** Option order */
    public var sortOrder: Int32?
    /** Default */
    public var isDefault: Bool?
    /** Option label for store scopes */
    public var storeLabels: [EavDataAttributeOptionLabelInterface]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["label"] = self.label
        nillableDictionary["value"] = self.value
        nillableDictionary["sort_order"] = self.sortOrder?.encodeToJSON()
        nillableDictionary["is_default"] = self.isDefault
        nillableDictionary["store_labels"] = self.storeLabels?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
