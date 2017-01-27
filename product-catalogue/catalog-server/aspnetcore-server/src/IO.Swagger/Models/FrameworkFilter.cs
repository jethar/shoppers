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
    /// Filter which can be used by any methods from service layer.
    /// </summary>
    [DataContract]
    public partial class FrameworkFilter :  IEquatable<FrameworkFilter>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FrameworkFilter" /> class.
        /// </summary>
        /// <param name="Field">Field (required).</param>
        /// <param name="Value">Value (required).</param>
        /// <param name="ConditionType">Condition type.</param>
        public FrameworkFilter(string Field = null, string Value = null, string ConditionType = null)
        {
            // to ensure "Field" is required (not null)
            if (Field == null)
            {
                throw new InvalidDataException("Field is a required property for FrameworkFilter and cannot be null");
            }
            else
            {
                this.Field = Field;
            }
            // to ensure "Value" is required (not null)
            if (Value == null)
            {
                throw new InvalidDataException("Value is a required property for FrameworkFilter and cannot be null");
            }
            else
            {
                this.Value = Value;
            }
            this.ConditionType = ConditionType;
            
        }

        /// <summary>
        /// Field
        /// </summary>
        /// <value>Field</value>
        [DataMember(Name="field")]
        public string Field { get; set; }

        /// <summary>
        /// Value
        /// </summary>
        /// <value>Value</value>
        [DataMember(Name="value")]
        public string Value { get; set; }

        /// <summary>
        /// Condition type
        /// </summary>
        /// <value>Condition type</value>
        [DataMember(Name="condition_type")]
        public string ConditionType { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FrameworkFilter {\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  ConditionType: ").Append(ConditionType).Append("\n");
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
            return Equals((FrameworkFilter)obj);
        }

        /// <summary>
        /// Returns true if FrameworkFilter instances are equal
        /// </summary>
        /// <param name="other">Instance of FrameworkFilter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FrameworkFilter other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.Field == other.Field ||
                    this.Field != null &&
                    this.Field.Equals(other.Field)
                ) && 
                (
                    this.Value == other.Value ||
                    this.Value != null &&
                    this.Value.Equals(other.Value)
                ) && 
                (
                    this.ConditionType == other.ConditionType ||
                    this.ConditionType != null &&
                    this.ConditionType.Equals(other.ConditionType)
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
                    if (this.Field != null)
                    hash = hash * 59 + this.Field.GetHashCode();
                    if (this.Value != null)
                    hash = hash * 59 + this.Value.GetHashCode();
                    if (this.ConditionType != null)
                    hash = hash * 59 + this.ConditionType.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(FrameworkFilter left, FrameworkFilter right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FrameworkFilter left, FrameworkFilter right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
