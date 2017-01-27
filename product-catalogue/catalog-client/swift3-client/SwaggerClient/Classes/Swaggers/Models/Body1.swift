//
// Body1.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class Body1: JSONEncodable {
    public var productWebsiteLink: CatalogProductWebsiteLinkInterface?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["productWebsiteLink"] = self.productWebsiteLink?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
