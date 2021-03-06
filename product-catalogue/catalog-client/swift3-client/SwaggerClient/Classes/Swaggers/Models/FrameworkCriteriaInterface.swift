//
// FrameworkCriteriaInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Interface CriteriaInterface */
open class FrameworkCriteriaInterface: JSONEncodable {
    /** Associated Mapper Interface name */
    public var mapperInterfaceName: String?
    /** Criteria objects added to current Composite Criteria */
    public var criteriaList: [FrameworkCriteriaInterface]?
    /** List of filters */
    public var filters: [String]?
    /** Ordering criteria */
    public var orders: [String]?
    /** Limit */
    public var limit: [String]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["mapper_interface_name"] = self.mapperInterfaceName
        nillableDictionary["criteria_list"] = self.criteriaList?.encodeToJSON()
        nillableDictionary["filters"] = self.filters?.encodeToJSON()
        nillableDictionary["orders"] = self.orders?.encodeToJSON()
        nillableDictionary["limit"] = self.limit?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
