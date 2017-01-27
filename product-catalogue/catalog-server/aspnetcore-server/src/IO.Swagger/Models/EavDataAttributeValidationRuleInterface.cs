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
    /// Interface AttributeValidationRuleInterface
    /// </summary>
    [DataContract]
    public partial class EavDataAttributeValidationRuleInterface :  IEquatable<EavDataAttributeValidationRuleInterface>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EavDataAttributeValidationRuleInterface" /> class.
        /// </summary>
        /// <param name="Key">Object key (required).</param>
        /// <param name="Value">Object value (required).</param>
        public EavDataAttributeValidationRuleInterface(string Key = null, string Value = null)
        {
            // to ensure "Key" is required (not null)
            if (Key == null)
            {
                throw new InvalidDataException("Key is a required property for EavDataAttributeValidationRuleInterface and cannot be null");
            }
            else
            {
                this.Key = Key;
            }
            // to ensure "Value" is required (not null)
            if (Value == null)
            {
                throw new InvalidDataException("Value is a required property for EavDataAttributeValidationRuleInterface and cannot be null");
            }
            else
            {
                this.Value = Value;
            }
            
        }

        /// <summary>
        /// Object key
        /// </summary>
        /// <value>Object key</value>
        [DataMember(Name="key")]
        public string Key { get; set; }

        /// <summary>
        /// Object value
        /// </summary>
        /// <value>Object value</value>
        [DataMember(Name="value")]
        public string Value { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EavDataAttributeValidationRuleInterface {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return Equals((EavDataAttributeValidationRuleInterface)obj);
        }

        /// <summary>
        /// Returns true if EavDataAttributeValidationRuleInterface instances are equal
        /// </summary>
        /// <param name="other">Instance of EavDataAttributeValidationRuleInterface to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EavDataAttributeValidationRuleInterface other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.Key == other.Key ||
                    this.Key != null &&
                    this.Key.Equals(other.Key)
                ) && 
                (
                    this.Value == other.Value ||
                    this.Value != null &&
                    this.Value.Equals(other.Value)
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
                    if (this.Key != null)
                    hash = hash * 59 + this.Key.GetHashCode();
                    if (this.Value != null)
                    hash = hash * 59 + this.Value.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(EavDataAttributeValidationRuleInterface left, EavDataAttributeValidationRuleInterface right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EavDataAttributeValidationRuleInterface left, EavDataAttributeValidationRuleInterface right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
