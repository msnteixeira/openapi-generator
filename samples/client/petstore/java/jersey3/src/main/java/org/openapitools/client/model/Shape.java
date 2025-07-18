/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.client.model.Quadrilateral;
import org.openapitools.client.model.Triangle;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import org.openapitools.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
@JsonDeserialize(using = Shape.ShapeDeserializer.class)
@JsonSerialize(using = Shape.ShapeSerializer.class)
public class Shape extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Shape.class.getName());

    public static class ShapeSerializer extends StdSerializer<Shape> {
        public ShapeSerializer(Class<Shape> t) {
            super(t);
        }

        public ShapeSerializer() {
            this(null);
        }

        @Override
        public void serialize(Shape value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ShapeDeserializer extends StdDeserializer<Shape> {
        public ShapeDeserializer() {
            this(Shape.class);
        }

        public ShapeDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Shape deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Shape newShape = new Shape();
            Map<String, Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("shapeType");
            switch (discriminatorValue) {
                case "Quadrilateral":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Quadrilateral.class);
                    newShape.setActualInstance(deserialized);
                    return newShape;
                case "Triangle":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Triangle.class);
                    newShape.setActualInstance(deserialized);
                    return newShape;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for Shape. Possible values: Quadrilateral Triangle", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Triangle
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Triangle.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Triangle'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Triangle'", e);
            }

            // deserialize Quadrilateral
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Quadrilateral.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Quadrilateral'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Quadrilateral'", e);
            }

            if (match == 1) {
                Shape ret = new Shape();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Shape: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Shape getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Shape cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType<?>> schemas = new HashMap<>();

    public Shape() {
        super("oneOf", Boolean.FALSE);
    }
  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public Shape putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

    /**
     * Return true if this Shape object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o) && Objects.equals(this.additionalProperties, ((Shape)o).additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActualInstance(), isNullable(), getSchemaType(), additionalProperties);
    }
    public Shape(Triangle o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Shape(Quadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Quadrilateral", new GenericType<Quadrilateral>() {
        });
        schemas.put("Triangle", new GenericType<Triangle>() {
        });
        JSON.registerDescendants(Shape.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<>();
        mappings.put("Quadrilateral", Quadrilateral.class);
        mappings.put("Triangle", Triangle.class);
        mappings.put("Shape", Shape.class);
        JSON.registerDiscriminator(Shape.class, "shapeType", mappings);
    }

    @Override
    public Map<String, GenericType<?>> getSchemas() {
        return Shape.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Quadrilateral, Triangle
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Triangle.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Quadrilateral.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Quadrilateral, Triangle");
    }

    /**
     * Get the actual instance, which can be the following:
     * Quadrilateral, Triangle
     *
     * @return The actual instance (Quadrilateral, Triangle)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Triangle`. If the actual instance is not `Triangle`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Triangle`
     * @throws ClassCastException if the instance is not `Triangle`
     */
    public Triangle getTriangle() throws ClassCastException {
        return (Triangle)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Quadrilateral`. If the actual instance is not `Quadrilateral`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Quadrilateral`
     * @throws ClassCastException if the instance is not `Quadrilateral`
     */
    public Quadrilateral getQuadrilateral() throws ClassCastException {
        return (Quadrilateral)super.getActualInstance();
    }

}

