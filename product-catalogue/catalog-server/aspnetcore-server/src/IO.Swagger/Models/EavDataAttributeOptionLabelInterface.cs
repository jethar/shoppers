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
    /// Interface AttributeOptionLabelInterface
    /// </summary>
    [DataContract]
    public partial class EavDataAttributeOptionLabelInterface :  IEquatable<EavDataAttributeOptionLabelInterface>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EavDataAttributeOptionLabelInterface" /> class.
        /// </summary>
        /// <param name="StoreId">Store id.</param>
        /// <param name="Label">Option label.</param>
        public EavDataAttributeOptionLabelInterface(int? StoreId = null, string Label = null)
        {
            this.StoreId = StoreId;
            this.Label = Label;
            
        }

        /// <summary>
        /// Store id
        /// </summary>
        /// <value>Store id</value>
        [DataMember(Name="store_id")]
        public int? StoreId { get; set; }

        /// <summary>
        /// Option label
        /// </summary>
        /// <value>Option label</value>
        [DataMember(Name="label")]
        public string Label { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EavDataAttributeOptionLabelInterface {\n");
            sb.Append("  StoreId: ").Append(StoreId).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
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
            return Equals((EavDataAttributeOptionLabelInterface)obj);
        }

        /// <summary>
        /// Returns true if EavDataAttributeOptionLabelInterface instances are equal
        /// </summary>
        /// <param name="other">Instance of EavDataAttributeOptionLabelInterface to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EavDataAttributeOptionLabelInterface other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.StoreId == other.StoreId ||
                    this.StoreId != null &&
                    this.StoreId.Equals(other.StoreId)
                ) && 
                (
                    this.Label == other.Label ||
                    this.Label != null &&
                    this.Label.Equals(other.Label)
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
                    if (this.StoreId != null)
                    hash = hash * 59 + this.StoreId.GetHashCode();
                    if (this.Label != null)
                    hash = hash * 59 + this.Label.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(EavDataAttributeOptionLabelInterface left, EavDataAttributeOptionLabelInterface right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EavDataAttributeOptionLabelInterface left, EavDataAttributeOptionLabelInterface right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
