//
// FrameworkSearchAggregationInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Faceted data */
open class FrameworkSearchAggregationInterface: JSONEncodable {
    /** All Document fields */
    public var buckets: [FrameworkSearchBucketInterface]?
    /** Document field names */
    public var bucketNames: [String]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["buckets"] = self.buckets?.encodeToJSON()
        nillableDictionary["bucket_names"] = self.bucketNames?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
