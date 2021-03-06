// Models.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

protocol JSONEncodable {
    func encodeToJSON() -> Any
}

public enum ErrorResponse : Error {
    case Error(Int, Data?, Error)
}

open class Response<T> {
    open let statusCode: Int
    open let header: [String: String]
    open let body: T?

    public init(statusCode: Int, header: [String: String], body: T?) {
        self.statusCode = statusCode
        self.header = header
        self.body = body
    }

    public convenience init(response: HTTPURLResponse, body: T?) {
        let rawHeader = response.allHeaderFields
        var header = [String:String]()
        for (key, value) in rawHeader {
            header[key as! String] = value as? String
        }
        self.init(statusCode: response.statusCode, header: header, body: body)
    }
}

private var once = Int()
class Decoders {
    static fileprivate var decoders = Dictionary<String, ((AnyObject) -> AnyObject)>()

    static func addDecoder<T>(clazz: T.Type, decoder: @escaping ((AnyObject) -> T)) {
        let key = "\(T.self)"
        decoders[key] = { decoder($0) as AnyObject }
    }

    static func decode<T>(clazz: T.Type, discriminator: String, source: AnyObject) -> T {
        let key = discriminator;
        if let decoder = decoders[key] {
            return decoder(source) as! T
        } else {
            fatalError("Source \(source) is not convertible to type \(clazz): Maybe swagger file is insufficient")
        }
    }

    static func decode<T>(clazz: [T].Type, source: AnyObject) -> [T] {
        let array = source as! [AnyObject]
        return array.map { Decoders.decode(clazz: T.self, source: $0) }
    }

    static func decode<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject) -> [Key:T] {
        let sourceDictionary = source as! [Key: AnyObject]
        var dictionary = [Key:T]()
        for (key, value) in sourceDictionary {
            dictionary[key] = Decoders.decode(clazz: T.self, source: value)
        }
        return dictionary
    }

    static func decode<T>(clazz: T.Type, source: AnyObject) -> T {
        initialize()
        if T.self is Int32.Type && source is NSNumber {
            return source.int32Value as! T;
        }
        if T.self is Int64.Type && source is NSNumber {
            return source.int64Value as! T;
        }
        if T.self is UUID.Type && source is String {
            return UUID(uuidString: source as! String) as! T
        }
        if source is T {
            return source as! T
        }
        if T.self is Data.Type && source is String {
            return Data(base64Encoded: source as! String) as! T
        }

        let key = "\(T.self)"
        if let decoder = decoders[key] {
           return decoder(source) as! T
        } else {
            fatalError("Source \(source) is not convertible to type \(clazz): Maybe swagger file is insufficient")
        }
    }

    static func decodeOptional<T>(clazz: T.Type, source: AnyObject?) -> T? {
        if source is NSNull {
            return nil
        }
        return source.map { (source: AnyObject) -> T in
            Decoders.decode(clazz: clazz, source: source)
        }
    }

    static func decodeOptional<T>(clazz: [T].Type, source: AnyObject?) -> [T]? {
        if source is NSNull {
            return nil
        }
        return source.map { (someSource: AnyObject) -> [T] in
            Decoders.decode(clazz: clazz, source: someSource)
        }
    }

    static func decodeOptional<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject?) -> [Key:T]? {
        if source is NSNull {
            return nil
        }
        return source.map { (someSource: AnyObject) -> [Key:T] in
            Decoders.decode(clazz: clazz, source: someSource)
        }
    }

    private static var __once: () = {
        let formatters = [
            "yyyy-MM-dd",
            "yyyy-MM-dd'T'HH:mm:ssZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss'Z'",
            "yyyy-MM-dd'T'HH:mm:ss.SSS",
            "yyyy-MM-dd HH:mm:ss"
        ].map { (format: String) -> DateFormatter in
            let formatter = DateFormatter()
            formatter.dateFormat = format
            return formatter
        }
        // Decoder for Date
        Decoders.addDecoder(clazz: Date.self) { (source: AnyObject) -> Date in
           if let sourceString = source as? String {
                for formatter in formatters {
                    if let date = formatter.date(from: sourceString) {
                        return date
                    }
                }
            }
            if let sourceInt = source as? Int64 {
                // treat as a java date
                return Date(timeIntervalSince1970: Double(sourceInt / 1000) )
            }
            fatalError("formatter failed to parse \(source)")
        } 

        // Decoder for [BundleDataLinkInterface]
        Decoders.addDecoder(clazz: [BundleDataLinkInterface].self) { (source: AnyObject) -> [BundleDataLinkInterface] in
            return Decoders.decode(clazz: [BundleDataLinkInterface].self, source: source)
        }
        // Decoder for BundleDataLinkInterface
        Decoders.addDecoder(clazz: BundleDataLinkInterface.self) { (source: AnyObject) -> BundleDataLinkInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = BundleDataLinkInterface()
            instance.id = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["id"] as AnyObject?)
            instance.sku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["sku"] as AnyObject?)
            instance.optionId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["option_id"] as AnyObject?)
            instance.qty = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["qty"] as AnyObject?)
            instance.position = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["position"] as AnyObject?)
            instance.isDefault = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["is_default"] as AnyObject?)
            instance.price = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["price"] as AnyObject?)
            instance.priceType = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["price_type"] as AnyObject?)
            instance.canChangeQuantity = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["can_change_quantity"] as AnyObject?)
            return instance
        }


        // Decoder for [BundleDataOptionInterface]
        Decoders.addDecoder(clazz: [BundleDataOptionInterface].self) { (source: AnyObject) -> [BundleDataOptionInterface] in
            return Decoders.decode(clazz: [BundleDataOptionInterface].self, source: source)
        }
        // Decoder for BundleDataOptionInterface
        Decoders.addDecoder(clazz: BundleDataOptionInterface.self) { (source: AnyObject) -> BundleDataOptionInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = BundleDataOptionInterface()
            instance.optionId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["option_id"] as AnyObject?)
            instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"] as AnyObject?)
            instance._required = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["required"] as AnyObject?)
            instance.type = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["type"] as AnyObject?)
            instance.position = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["position"] as AnyObject?)
            instance.sku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["sku"] as AnyObject?)
            instance.productLinks = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["product_links"] as AnyObject?)
            return instance
        }


        // Decoder for [Category]
        Decoders.addDecoder(clazz: [Category].self) { (source: AnyObject) -> [Category] in
            return Decoders.decode(clazz: [Category].self, source: source)
        }
        // Decoder for Category
        Decoders.addDecoder(clazz: Category.self) { (source: AnyObject) -> Category in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = Category()
            instance.id = Decoders.decodeOptional(clazz: Int64.self, source: sourceDictionary["id"] as AnyObject?)
            instance.name = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["name"] as AnyObject?)
            return instance
        }


        // Decoder for [ConfigurableProductDataOptionInterface]
        Decoders.addDecoder(clazz: [ConfigurableProductDataOptionInterface].self) { (source: AnyObject) -> [ConfigurableProductDataOptionInterface] in
            return Decoders.decode(clazz: [ConfigurableProductDataOptionInterface].self, source: source)
        }
        // Decoder for ConfigurableProductDataOptionInterface
        Decoders.addDecoder(clazz: ConfigurableProductDataOptionInterface.self) { (source: AnyObject) -> ConfigurableProductDataOptionInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ConfigurableProductDataOptionInterface()
            instance.id = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["id"] as AnyObject?)
            instance.attributeId = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["attribute_id"] as AnyObject?)
            instance.label = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["label"] as AnyObject?)
            instance.position = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["position"] as AnyObject?)
            instance.isUseDefault = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["is_use_default"] as AnyObject?)
            instance.values = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["values"] as AnyObject?)
            instance.productId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["product_id"] as AnyObject?)
            return instance
        }


        // Decoder for [ConfigurableProductDataOptionValueInterface]
        Decoders.addDecoder(clazz: [ConfigurableProductDataOptionValueInterface].self) { (source: AnyObject) -> [ConfigurableProductDataOptionValueInterface] in
            return Decoders.decode(clazz: [ConfigurableProductDataOptionValueInterface].self, source: source)
        }
        // Decoder for ConfigurableProductDataOptionValueInterface
        Decoders.addDecoder(clazz: ConfigurableProductDataOptionValueInterface.self) { (source: AnyObject) -> ConfigurableProductDataOptionValueInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ConfigurableProductDataOptionValueInterface()
            instance.valueIndex = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["value_index"] as AnyObject?)
            return instance
        }


        // Decoder for [ErrorErrors]
        Decoders.addDecoder(clazz: [ErrorErrors].self) { (source: AnyObject) -> [ErrorErrors] in
            return Decoders.decode(clazz: [ErrorErrors].self, source: source)
        }
        // Decoder for ErrorErrors
        Decoders.addDecoder(clazz: ErrorErrors.self) { (source: AnyObject) -> ErrorErrors in
            let sourceArray = source as! [AnyObject]
            return sourceArray.map({ Decoders.decode(clazz: ErrorErrorsItem.self, source: $0) })
        }


        // Decoder for [ErrorErrorsItem]
        Decoders.addDecoder(clazz: [ErrorErrorsItem].self) { (source: AnyObject) -> [ErrorErrorsItem] in
            return Decoders.decode(clazz: [ErrorErrorsItem].self, source: source)
        }
        // Decoder for ErrorErrorsItem
        Decoders.addDecoder(clazz: ErrorErrorsItem.self) { (source: AnyObject) -> ErrorErrorsItem in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ErrorErrorsItem()
            instance.message = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["message"] as AnyObject?)
            instance.parameters = Decoders.decodeOptional(clazz: ErrorParameters.self, source: sourceDictionary["parameters"] as AnyObject?)
            return instance
        }


        // Decoder for [ErrorParameters]
        Decoders.addDecoder(clazz: [ErrorParameters].self) { (source: AnyObject) -> [ErrorParameters] in
            return Decoders.decode(clazz: [ErrorParameters].self, source: source)
        }
        // Decoder for ErrorParameters
        Decoders.addDecoder(clazz: ErrorParameters.self) { (source: AnyObject) -> ErrorParameters in
            let sourceArray = source as! [AnyObject]
            return sourceArray.map({ Decoders.decode(clazz: ErrorParametersItem.self, source: $0) })
        }


        // Decoder for [ErrorParametersItem]
        Decoders.addDecoder(clazz: [ErrorParametersItem].self) { (source: AnyObject) -> [ErrorParametersItem] in
            return Decoders.decode(clazz: [ErrorParametersItem].self, source: source)
        }
        // Decoder for ErrorParametersItem
        Decoders.addDecoder(clazz: ErrorParametersItem.self) { (source: AnyObject) -> ErrorParametersItem in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ErrorParametersItem()
            instance.resources = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["resources"] as AnyObject?)
            instance.fieldName = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["fieldName"] as AnyObject?)
            instance.fieldValue = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["fieldValue"] as AnyObject?)
            return instance
        }


        // Decoder for [FrameworkAttributeInterface]
        Decoders.addDecoder(clazz: [FrameworkAttributeInterface].self) { (source: AnyObject) -> [FrameworkAttributeInterface] in
            return Decoders.decode(clazz: [FrameworkAttributeInterface].self, source: source)
        }
        // Decoder for FrameworkAttributeInterface
        Decoders.addDecoder(clazz: FrameworkAttributeInterface.self) { (source: AnyObject) -> FrameworkAttributeInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = FrameworkAttributeInterface()
            instance.attributeCode = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["attribute_code"] as AnyObject?)
            instance.value = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["value"] as AnyObject?)
            return instance
        }


        // Decoder for [InventoryDataStockItemInterface]
        Decoders.addDecoder(clazz: [InventoryDataStockItemInterface].self) { (source: AnyObject) -> [InventoryDataStockItemInterface] in
            return Decoders.decode(clazz: [InventoryDataStockItemInterface].self, source: source)
        }
        // Decoder for InventoryDataStockItemInterface
        Decoders.addDecoder(clazz: InventoryDataStockItemInterface.self) { (source: AnyObject) -> InventoryDataStockItemInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = InventoryDataStockItemInterface()
            instance.itemId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["item_id"] as AnyObject?)
            instance.productId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["product_id"] as AnyObject?)
            instance.stockId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["stock_id"] as AnyObject?)
            instance.qty = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["qty"] as AnyObject?)
            instance.isInStock = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["is_in_stock"] as AnyObject?)
            instance.isQtyDecimal = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["is_qty_decimal"] as AnyObject?)
            instance.showDefaultNotificationMessage = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["show_default_notification_message"] as AnyObject?)
            instance.useConfigMinQty = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["use_config_min_qty"] as AnyObject?)
            instance.minQty = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["min_qty"] as AnyObject?)
            instance.useConfigMinSaleQty = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["use_config_min_sale_qty"] as AnyObject?)
            instance.minSaleQty = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["min_sale_qty"] as AnyObject?)
            instance.useConfigMaxSaleQty = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["use_config_max_sale_qty"] as AnyObject?)
            instance.maxSaleQty = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["max_sale_qty"] as AnyObject?)
            instance.useConfigBackorders = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["use_config_backorders"] as AnyObject?)
            instance.backorders = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["backorders"] as AnyObject?)
            instance.useConfigNotifyStockQty = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["use_config_notify_stock_qty"] as AnyObject?)
            instance.notifyStockQty = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["notify_stock_qty"] as AnyObject?)
            instance.useConfigQtyIncrements = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["use_config_qty_increments"] as AnyObject?)
            instance.qtyIncrements = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["qty_increments"] as AnyObject?)
            instance.useConfigEnableQtyInc = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["use_config_enable_qty_inc"] as AnyObject?)
            instance.enableQtyIncrements = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["enable_qty_increments"] as AnyObject?)
            instance.useConfigManageStock = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["use_config_manage_stock"] as AnyObject?)
            instance.manageStock = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["manage_stock"] as AnyObject?)
            instance.lowStockDate = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["low_stock_date"] as AnyObject?)
            instance.isDecimalDivided = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["is_decimal_divided"] as AnyObject?)
            instance.stockStatusChangedAuto = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["stock_status_changed_auto"] as AnyObject?)
            return instance
        }


        // Decoder for [ModelErrorResponse]
        Decoders.addDecoder(clazz: [ModelErrorResponse].self) { (source: AnyObject) -> [ModelErrorResponse] in
            return Decoders.decode(clazz: [ModelErrorResponse].self, source: source)
        }
        // Decoder for ModelErrorResponse
        Decoders.addDecoder(clazz: ModelErrorResponse.self) { (source: AnyObject) -> ModelErrorResponse in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ModelErrorResponse()
            instance.message = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["message"] as AnyObject?)
            instance.errors = Decoders.decodeOptional(clazz: ErrorErrors.self, source: sourceDictionary["errors"] as AnyObject?)
            instance.code = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["code"] as AnyObject?)
            instance.parameters = Decoders.decodeOptional(clazz: ErrorParameters.self, source: sourceDictionary["parameters"] as AnyObject?)
            instance.trace = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["trace"] as AnyObject?)
            return instance
        }


        // Decoder for [Product]
        Decoders.addDecoder(clazz: [Product].self) { (source: AnyObject) -> [Product] in
            return Decoders.decode(clazz: [Product].self, source: source)
        }
        // Decoder for Product
        Decoders.addDecoder(clazz: Product.self) { (source: AnyObject) -> Product in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = Product()
            instance.id = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["id"] as AnyObject?)
            instance.sku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["sku"] as AnyObject?)
            instance.name = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["name"] as AnyObject?)
            instance.attributeSetId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["attribute_set_id"] as AnyObject?)
            instance.price = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["price"] as AnyObject?)
            instance.status = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["status"] as AnyObject?)
            instance.visibility = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["visibility"] as AnyObject?)
            instance.typeId = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["type_id"] as AnyObject?)
            instance.createdAt = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["created_at"] as AnyObject?)
            instance.updatedAt = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["updated_at"] as AnyObject?)
            instance.weight = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["weight"] as AnyObject?)
            instance.extensionAttributes = Decoders.decodeOptional(clazz: ProductExtensionInterface.self, source: sourceDictionary["extension_attributes"] as AnyObject?)
            instance.productLinks = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["product_links"] as AnyObject?)
            instance.options = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["options"] as AnyObject?)
            instance.tierPrices = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["tier_prices"] as AnyObject?)
            instance.customAttributes = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["custom_attributes"] as AnyObject?)
            return instance
        }


        // Decoder for [ProductCustomOptionInterface]
        Decoders.addDecoder(clazz: [ProductCustomOptionInterface].self) { (source: AnyObject) -> [ProductCustomOptionInterface] in
            return Decoders.decode(clazz: [ProductCustomOptionInterface].self, source: source)
        }
        // Decoder for ProductCustomOptionInterface
        Decoders.addDecoder(clazz: ProductCustomOptionInterface.self) { (source: AnyObject) -> ProductCustomOptionInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ProductCustomOptionInterface()
            instance.productSku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["product_sku"] as AnyObject?)
            instance.optionId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["option_id"] as AnyObject?)
            instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"] as AnyObject?)
            instance.type = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["type"] as AnyObject?)
            instance.sortOrder = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["sort_order"] as AnyObject?)
            instance.isRequire = Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["is_require"] as AnyObject?)
            instance.price = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["price"] as AnyObject?)
            instance.priceType = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["price_type"] as AnyObject?)
            instance.sku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["sku"] as AnyObject?)
            instance.fileExtension = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["file_extension"] as AnyObject?)
            instance.maxCharacters = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["max_characters"] as AnyObject?)
            instance.imageSizeX = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["image_size_x"] as AnyObject?)
            instance.imageSizeY = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["image_size_y"] as AnyObject?)
            instance.values = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["values"] as AnyObject?)
            return instance
        }


        // Decoder for [ProductCustomOptionValuesInterface]
        Decoders.addDecoder(clazz: [ProductCustomOptionValuesInterface].self) { (source: AnyObject) -> [ProductCustomOptionValuesInterface] in
            return Decoders.decode(clazz: [ProductCustomOptionValuesInterface].self, source: source)
        }
        // Decoder for ProductCustomOptionValuesInterface
        Decoders.addDecoder(clazz: ProductCustomOptionValuesInterface.self) { (source: AnyObject) -> ProductCustomOptionValuesInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ProductCustomOptionValuesInterface()
            instance.title = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["title"] as AnyObject?)
            instance.sortOrder = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["sort_order"] as AnyObject?)
            instance.price = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["price"] as AnyObject?)
            instance.priceType = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["price_type"] as AnyObject?)
            instance.sku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["sku"] as AnyObject?)
            instance.optionTypeId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["option_type_id"] as AnyObject?)
            return instance
        }


        // Decoder for [ProductExtensionInterface]
        Decoders.addDecoder(clazz: [ProductExtensionInterface].self) { (source: AnyObject) -> [ProductExtensionInterface] in
            return Decoders.decode(clazz: [ProductExtensionInterface].self, source: source)
        }
        // Decoder for ProductExtensionInterface
        Decoders.addDecoder(clazz: ProductExtensionInterface.self) { (source: AnyObject) -> ProductExtensionInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ProductExtensionInterface()
            instance.stockItem = Decoders.decodeOptional(clazz: InventoryDataStockItemInterface.self, source: sourceDictionary["stock_item"] as AnyObject?)
            instance.bundleProductOptions = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["bundle_product_options"] as AnyObject?)
            instance.configurableProductOptions = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["configurable_product_options"] as AnyObject?)
            instance.configurableProductLinks = Decoders.decodeOptional(clazz: Array.self, source: sourceDictionary["configurable_product_links"] as AnyObject?)
            return instance
        }


        // Decoder for [ProductLinkInterface]
        Decoders.addDecoder(clazz: [ProductLinkInterface].self) { (source: AnyObject) -> [ProductLinkInterface] in
            return Decoders.decode(clazz: [ProductLinkInterface].self, source: source)
        }
        // Decoder for ProductLinkInterface
        Decoders.addDecoder(clazz: ProductLinkInterface.self) { (source: AnyObject) -> ProductLinkInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ProductLinkInterface()
            instance.sku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["sku"] as AnyObject?)
            instance.linkType = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["link_type"] as AnyObject?)
            instance.linkedProductSku = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["linked_product_sku"] as AnyObject?)
            instance.linkedProductType = Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["linked_product_type"] as AnyObject?)
            instance.position = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["position"] as AnyObject?)
            return instance
        }


        // Decoder for [ProductTierPriceInterface]
        Decoders.addDecoder(clazz: [ProductTierPriceInterface].self) { (source: AnyObject) -> [ProductTierPriceInterface] in
            return Decoders.decode(clazz: [ProductTierPriceInterface].self, source: source)
        }
        // Decoder for ProductTierPriceInterface
        Decoders.addDecoder(clazz: ProductTierPriceInterface.self) { (source: AnyObject) -> ProductTierPriceInterface in
            let sourceDictionary = source as! [AnyHashable: Any]

            let instance = ProductTierPriceInterface()
            instance.customerGroupId = Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["customer_group_id"] as AnyObject?)
            instance.qty = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["qty"] as AnyObject?)
            instance.value = Decoders.decodeOptional(clazz: Double.self, source: sourceDictionary["value"] as AnyObject?)
            return instance
        }
    }()

    static fileprivate func initialize() {
        _ = Decoders.__once
    }
}
