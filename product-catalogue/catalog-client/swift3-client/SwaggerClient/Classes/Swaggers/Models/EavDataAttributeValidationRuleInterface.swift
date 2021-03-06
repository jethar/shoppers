//
// EavDataAttributeValidationRuleInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Interface AttributeValidationRuleInterface */
open class EavDataAttributeValidationRuleInterface: JSONEncodable {
    /** Object key */
    public var key: String?
    /** Object value */
    public var value: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["key"] = self.key
        nillableDictionary["value"] = self.value
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
