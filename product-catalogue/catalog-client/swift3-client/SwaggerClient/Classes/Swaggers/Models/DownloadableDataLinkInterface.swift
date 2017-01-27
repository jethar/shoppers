//
// DownloadableDataLinkInterface.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/**  */
open class DownloadableDataLinkInterface: JSONEncodable {
    /** Sample(or link) id */
    public var id: Int32?
    public var title: String?
    public var sortOrder: Int32?
    /** Shareable status */
    public var isShareable: Int32?
    /** Price */
    public var price: Double?
    /** Of downloads per user */
    public var numberOfDownloads: Int32?
    public var linkType: String?
    /** relative file path */
    public var linkFile: String?
    public var linkFileContent: DownloadableDataFileContentInterface?
    /** Link url or null when type is &#39;file&#39; */
    public var linkUrl: String?
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
        nillableDictionary["is_shareable"] = self.isShareable?.encodeToJSON()
        nillableDictionary["price"] = self.price
        nillableDictionary["number_of_downloads"] = self.numberOfDownloads?.encodeToJSON()
        nillableDictionary["link_type"] = self.linkType
        nillableDictionary["link_file"] = self.linkFile
        nillableDictionary["link_file_content"] = self.linkFileContent?.encodeToJSON()
        nillableDictionary["link_url"] = self.linkUrl
        nillableDictionary["sample_type"] = self.sampleType
        nillableDictionary["sample_file"] = self.sampleFile
        nillableDictionary["sample_file_content"] = self.sampleFileContent?.encodeToJSON()
        nillableDictionary["sample_url"] = self.sampleUrl
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}