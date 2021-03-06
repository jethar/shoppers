//
// DownloadableDataSampleInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/**  */
open class DownloadableDataSampleInterface: JSONEncodable {
    /** Sample(or link) id */
    public var id: Int32?
    /** Title */
    public var title: String?
    /** Order index for sample */
    public var sortOrder: Int32?
    public var sampleType: String?
    /** relative file path */
    public var sampleFile: String?
    public var sampleFileContent: DownloadableDataFileContentInterface?
    /** file URL */
    public var sampleUrl: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["title"] = self.title
        nillableDictionary["sort_order"] = self.sortOrder?.encodeToJSON()
        nillableDictionary["sample_type"] = self.sampleType
        nillableDictionary["sample_file"] = self.sampleFile
        nillableDictionary["sample_file_content"] = self.sampleFileContent?.encodeToJSON()
        nillableDictionary["sample_url"] = self.sampleUrl
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
