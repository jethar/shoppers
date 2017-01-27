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
    public partial class FrameworkSearchDocumentInterface :  IEquatable<FrameworkSearchDocumentInterface>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FrameworkSearchDocumentInterface" /> class.
        /// </summary>
        /// <param name="Id">Id (required).</param>
        /// <param name="CustomAttributes">Custom attributes values..</param>
        public FrameworkSearchDocumentInterface(int? Id = null, List<FrameworkAttributeInterface> CustomAttributes = null)
        {
            // to ensure "Id" is required (not null)
            if (Id == null)
            {
                throw new InvalidDataException("Id is a required property for FrameworkSearchDocumentInterface and cannot be null");
            }
            else
            {
                this.Id = Id;
            }
            this.CustomAttributes = CustomAttributes;
            
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id")]
        public int? Id { get; set; }

        /// <summary>
        /// Custom attributes values.
        /// </summary>
        /// <value>Custom attributes values.</value>
        [DataMember(Name="custom_attributes")]
        public List<FrameworkAttributeInterface> CustomAttributes { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FrameworkSearchDocumentInterface {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CustomAttributes: ").Append(CustomAttributes).Append("\n");
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
            return Equals((FrameworkSearchDocumentInterface)obj);
        }

        /// <summary>
        /// Returns true if FrameworkSearchDocumentInterface instances are equal
        /// </summary>
        /// <param name="other">Instance of FrameworkSearchDocumentInterface to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FrameworkSearchDocumentInterface other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.CustomAttributes == other.CustomAttributes ||
                    this.CustomAttributes != null &&
                    this.CustomAttributes.SequenceEqual(other.CustomAttributes)
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
                    if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                    if (this.CustomAttributes != null)
                    hash = hash * 59 + this.CustomAttributes.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(FrameworkSearchDocumentInterface left, FrameworkSearchDocumentInterface right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FrameworkSearchDocumentInterface left, FrameworkSearchDocumentInterface right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}