//
// CatalogProductTierPriceManagementV1API.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



open class CatalogProductTierPriceManagementV1API: APIBase {

    public class func mapValuesToQueryItems(values: [String:Any?]) -> [URLQueryItem] {
        return values
            .filter { $0.1 != nil }
            .map { (item: (_key: String, _value: Any?)) -> URLQueryItem in
                URLQueryItem(name: item._key, value:"\(item._value!)")
            }
    }

    /**

     - parameter sku: (path)  
     - parameter customerGroupId: (path) &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; 
     - parameter price: (path)  
     - parameter qty: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func catalogProductTierPriceManagementV1AddPost(sku: String, customerGroupId: String, price: Double, qty: Double, completion: @escaping ((_ data: Bool?,_ error: Error?) -> Void)) {
        catalogProductTierPriceManagementV1AddPostWithRequestBuilder(sku: sku, customerGroupId: customerGroupId, price: price, qty: qty).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     - POST /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}
     - Create tier price for product
     - examples: [{contentType=application/json, example=true}]
     
     - parameter sku: (path)  
     - parameter customerGroupId: (path) &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; 
     - parameter price: (path)  
     - parameter qty: (path)  

     - returns: RequestBuilder<Bool> 
     */
    open class func catalogProductTierPriceManagementV1AddPostWithRequestBuilder(sku: String, customerGroupId: String, price: Double, qty: Double) -> RequestBuilder<Bool> {
        var path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}"
        path = path.replacingOccurrences(of: "{sku}", with: "\(sku)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{customerGroupId}", with: "\(customerGroupId)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{price}", with: "\(price)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{qty}", with: "\(qty)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<Bool>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter sku: (path)  
     - parameter customerGroupId: (path) &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func catalogProductTierPriceManagementV1GetListGet(sku: String, customerGroupId: String, completion: @escaping ((_ data: [ProductTierPriceInterface]?,_ error: Error?) -> Void)) {
        catalogProductTierPriceManagementV1GetListGetWithRequestBuilder(sku: sku, customerGroupId: customerGroupId).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     - GET /v1/products/{sku}/group-prices/{customerGroupId}/tiers
     - Get tier price of product
     - examples: [{contentType=application/json, example=[ {
  "qty" : 1.3579000000000001069366817318950779736042022705078125,
  "customer_group_id" : 123,
  "value" : 1.3579000000000001069366817318950779736042022705078125
} ]}]
     
     - parameter sku: (path)  
     - parameter customerGroupId: (path) &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; 

     - returns: RequestBuilder<[ProductTierPriceInterface]> 
     */
    open class func catalogProductTierPriceManagementV1GetListGetWithRequestBuilder(sku: String, customerGroupId: String) -> RequestBuilder<[ProductTierPriceInterface]> {
        var path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers"
        path = path.replacingOccurrences(of: "{sku}", with: "\(sku)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{customerGroupId}", with: "\(customerGroupId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<[ProductTierPriceInterface]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter sku: (path)  
     - parameter customerGroupId: (path) &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; 
     - parameter qty: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func catalogProductTierPriceManagementV1RemoveDelete(sku: String, customerGroupId: String, qty: Double, completion: @escaping ((_ data: Bool?,_ error: Error?) -> Void)) {
        catalogProductTierPriceManagementV1RemoveDeleteWithRequestBuilder(sku: sku, customerGroupId: customerGroupId, qty: qty).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     - DELETE /v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}
     - Remove tier price from product
     - examples: [{contentType=application/json, example=true}]
     
     - parameter sku: (path)  
     - parameter customerGroupId: (path) &#39;all&#39; can be used to specify &#39;ALL GROUPS&#39; 
     - parameter qty: (path)  

     - returns: RequestBuilder<Bool> 
     */
    open class func catalogProductTierPriceManagementV1RemoveDeleteWithRequestBuilder(sku: String, customerGroupId: String, qty: Double) -> RequestBuilder<Bool> {
        var path = "/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}"
        path = path.replacingOccurrences(of: "{sku}", with: "\(sku)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{customerGroupId}", with: "\(customerGroupId)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{qty}", with: "\(qty)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<Bool>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
