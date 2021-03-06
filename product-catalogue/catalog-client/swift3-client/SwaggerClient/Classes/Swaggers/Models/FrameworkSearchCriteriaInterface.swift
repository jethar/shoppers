//
// FrameworkSearchCriteriaInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Search criteria interface. */
open class FrameworkSearchCriteriaInterface: JSONEncodable {
    /** A list of filter groups. */
    public var filterGroups: [FrameworkSearchFilterGroup]?
    /** Sort order. */
    public var sortOrders: [FrameworkSortOrder]?
    /** Page size. */
    public var pageSize: Int32?
    /** Current page. */
    public var currentPage: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["filter_groups"] = self.filterGroups?.encodeToJSON()
        nillableDictionary["sort_orders"] = self.sortOrders?.encodeToJSON()
        nillableDictionary["page_size"] = self.pageSize?.encodeToJSON()
        nillableDictionary["current_page"] = self.currentPage?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
