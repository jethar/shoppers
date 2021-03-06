//
// ModelErrorResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ModelErrorResponse: JSONEncodable {
    /** Error message */
    public var message: String?
    public var errors: ErrorErrors?
    /** Error code */
    public var code: Int32?
    public var parameters: ErrorParameters?
    /** Stack trace */
    public var trace: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["message"] = self.message
        nillableDictionary["errors"] = self.errors?.encodeToJSON()
        nillableDictionary["code"] = self.code?.encodeToJSON()
        nillableDictionary["parameters"] = self.parameters?.encodeToJSON()
        nillableDictionary["trace"] = self.trace
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
