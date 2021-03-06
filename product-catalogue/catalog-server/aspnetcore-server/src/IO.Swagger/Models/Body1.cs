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
    public partial class Body1 :  IEquatable<Body1>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Body1" /> class.
        /// </summary>
        /// <param name="ProductWebsiteLink">ProductWebsiteLink (required).</param>
        public Body1(CatalogProductWebsiteLinkInterface ProductWebsiteLink = null)
        {
            // to ensure "ProductWebsiteLink" is required (not null)
            if (ProductWebsiteLink == null)
            {
                throw new InvalidDataException("ProductWebsiteLink is a required property for Body1 and cannot be null");
            }
            else
            {
                this.ProductWebsiteLink = ProductWebsiteLink;
            }
            
        }

        /// <summary>
        /// Gets or Sets ProductWebsiteLink
        /// </summary>
        [DataMember(Name="productWebsiteLink")]
        public CatalogProductWebsiteLinkInterface ProductWebsiteLink { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Body1 {\n");
            sb.Append("  ProductWebsiteLink: ").Append(ProductWebsiteLink).Append("\n");
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
            return Equals((Body1)obj);
        }

        /// <summary>
        /// Returns true if Body1 instances are equal
        /// </summary>
        /// <param name="other">Instance of Body1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Body1 other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.ProductWebsiteLink == other.ProductWebsiteLink ||
                    this.ProductWebsiteLink != null &&
                    this.ProductWebsiteLink.Equals(other.ProductWebsiteLink)
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
                    if (this.ProductWebsiteLink != null)
                    hash = hash * 59 + this.ProductWebsiteLink.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(Body1 left, Body1 right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Body1 left, Body1 right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
