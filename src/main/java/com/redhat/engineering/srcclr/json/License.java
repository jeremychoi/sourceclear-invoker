/*
 * Copyright (C) 2018 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.engineering.srcclr.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "license",
    "fromParentPom"
})
public class License {

    @JsonProperty("name")
    private String name;
    @JsonProperty("license")
    private String license;
    @JsonProperty("fromParentPom")
    private Boolean fromParentPom;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("fromParentPom")
    public Boolean getFromParentPom() {
        return fromParentPom;
    }

    @JsonProperty("fromParentPom")
    public void setFromParentPom(Boolean fromParentPom) {
        this.fromParentPom = fromParentPom;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("license", license).append("fromParentPom", fromParentPom).toString();
    }

}
