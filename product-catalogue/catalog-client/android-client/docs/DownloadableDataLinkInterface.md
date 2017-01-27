
# DownloadableDataLinkInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Sample(or link) id |  [optional]
**title** | **String** |  |  [optional]
**sortOrder** | **Integer** |  | 
**isShareable** | **Integer** | Shareable status | 
**price** | [**BigDecimal**](BigDecimal.md) | Price | 
**numberOfDownloads** | **Integer** | Of downloads per user |  [optional]
**linkType** | **String** |  | 
**linkFile** | **String** | relative file path |  [optional]
**linkFileContent** | [**DownloadableDataFileContentInterface**](DownloadableDataFileContentInterface.md) |  |  [optional]
**linkUrl** | **String** | Link url or null when type is &#39;file&#39; |  [optional]
**sampleType** | **String** |  | 
**sampleFile** | **String** | relative file path |  [optional]
**sampleFileContent** | [**DownloadableDataFileContentInterface**](DownloadableDataFileContentInterface.md) |  |  [optional]
**sampleUrl** | **String** | file URL |  [optional]



