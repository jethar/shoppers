/*
 * Shoppers OpenAPI
 *
 * This is a Shoppers Catalogue server.  [Learn about Swagger](http://swagger.io) or join the IRC channel `#swagger` on irc.freenode.net.  For this sample, you can use the api key `special-key` to test the authorization filters 
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class ProductCustomOptionValuesInterface :  IEquatable<ProductCustomOptionValuesInterface>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductCustomOptionValuesInterface" /> class.
        /// </summary>
        /// <param name="Title">Option title (required).</param>
        /// <param name="SortOrder">Sort order (required).</param>
        /// <param name="Price">Price (required).</param>
        /// <param name="PriceType">Price type (required).</param>
        /// <param name="Sku">Sku.</param>
        /// <param name="OptionTypeId">Option type id.</param>
        public ProductCustomOptionValuesInterface(string Title = null, int? SortOrder = null, decimal? Price = null, string PriceType = null, string Sku = null, int? OptionTypeId = null)
        {
            // to ensure "Title" is required (not null)
            if (Title == null)
            {
                throw new InvalidDataException("Title is a required property for ProductCustomOptionValuesInterface and cannot be null");
            }
            else
            {
                this.Title = Title;
            }
            // to ensure "SortOrder" is required (not null)
            if (SortOrder == null)
            {
                throw new InvalidDataException("SortOrder is a required property for ProductCustomOptionValuesInterface and cannot be null");
            }
            else
            {
                this.SortOrder = SortOrder;
            }
            // to ensure "Price" is required (not null)
            if (Price == null)
            {
                throw new InvalidDataException("Price is a required property for ProductCustomOptionValuesInterface and cannot be null");
            }
            else
            {
                this.Price = Price;
            }
            // to ensure "PriceType" is required (not null)
            if (PriceType == null)
            {
                throw new InvalidDataException("PriceType is a required property for ProductCustomOptionValuesInterface and cannot be null");
            }
            else
            {
                this.PriceType = PriceType;
            }
            this.Sku = Sku;
            this.OptionTypeId = OptionTypeId;
            
        }

        /// <summary>
        /// Option title
        /// </summary>
        /// <value>Option title</value>
        [DataMember(Name="title")]
        public string Title { get; set; }

        /// <summary>
        /// Sort order
        /// </summary>
        /// <value>Sort order</value>
        [DataMember(Name="sort_order")]
        public int? SortOrder { get; set; }

        /// <summary>
        /// Price
        /// </summary>
        /// <value>Price</value>
        [DataMember(Name="price")]
        public decimal? Price { get; set; }

        /// <summary>
        /// Price type
        /// </summary>
        /// <value>Price type</value>
        [DataMember(Name="price_type")]
        public string PriceType { get; set; }

        /// <summary>
        /// Sku
        /// </summary>
        /// <value>Sku</value>
        [DataMember(Name="sku")]
        public string Sku { get; set; }

        /// <summary>
        /// Option type id
        /// </summary>
        /// <value>Option type id</value>
        [DataMember(Name="option_type_id")]
        public int? OptionTypeId { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProductCustomOptionValuesInterface {\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  SortOrder: ").Append(SortOrder).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  PriceType: ").Append(PriceType).Append("\n");
            sb.Append("  Sku: ").Append(Sku).Append("\n");
            sb.Append("  OptionTypeId: ").Append(OptionTypeId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            if (obj.GetType() != GetType()) return false;
            return Equals((ProductCustomOptionValuesInterface)obj);
        }

        /// <summary>
        /// Returns true if ProductCustomOptionValuesInterface instances are equal
        /// </summary>
        /// <param name="other">Instance of ProductCustomOptionValuesInterface to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProductCustomOptionValuesInterface other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.Title == other.Title ||
                    this.Title != null &&
                    this.Title.Equals(other.Title)
                ) && 
                (
                    this.SortOrder == other.SortOrder ||
                    this.SortOrder != null &&
                    this.SortOrder.Equals(other.SortOrder)
                ) && 
                (
                    this.Price == other.Price ||
                    this.Price != null &&
                    this.Price.Equals(other.Price)
                ) && 
                (
                    this.PriceType == other.PriceType ||
                    this.PriceType != null &&
                    this.PriceType.Equals(other.PriceType)
                ) && 
                (
                    this.Sku == other.Sku ||
                    this.Sku != null &&
                    this.Sku.Equals(other.Sku)
                ) && 
                (
                    this.OptionTypeId == other.OptionTypeId ||
                    this.OptionTypeId != null &&
                    this.OptionTypeId.Equals(other.OptionTypeId)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                    if (this.Title != null)
                    hash = hash * 59 + this.Title.GetHashCode();
                    if (this.SortOrder != null)
                    hash = hash * 59 + this.SortOrder.GetHashCode();
                    if (this.Price != null)
                    hash = hash * 59 + this.Price.GetHashCode();
                    if (this.PriceType != null)
                    hash = hash * 59 + this.PriceType.GetHashCode();
                    if (this.Sku != null)
                    hash = hash * 59 + this.Sku.GetHashCode();
                    if (this.OptionTypeId != null)
                    hash = hash * 59 + this.OptionTypeId.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(ProductCustomOptionValuesInterface left, ProductCustomOptionValuesInterface right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProductCustomOptionValuesInterface left, ProductCustomOptionValuesInterface right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
