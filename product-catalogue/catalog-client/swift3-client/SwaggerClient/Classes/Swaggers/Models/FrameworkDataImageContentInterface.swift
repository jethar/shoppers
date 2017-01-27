//
// FrameworkDataImageContentInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Image Content data interface */
open class FrameworkDataImageContentInterface: JSONEncodable {
    /** Media data (base64 encoded content) */
    public var base64EncodedData: String?
    /** MIME type */
    public var type: String?
    /** Image name */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["base64_encoded_data"] = self.base64EncodedData
        nillableDictionary["type"] = self.type
        nillableDictionary["name"] = self.name
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}