/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.apache.isis.core.metamodel.facets.object.publishedobject;

import com.google.common.base.Predicate;

import org.apache.isis.core.metamodel.adapter.ObjectAdapter;
import org.apache.isis.core.metamodel.facets.MarkerFacet;

/**
 * Indicates that changes to an object's properties are to be published has, specifying the means by which 
 * a canonical event representing these changes should be created.
 */
public interface PublishedObjectFacet extends MarkerFacet {

    class Predicates {
        private Predicates(){}

        public static Predicate<ObjectAdapter> isPublished() {
            return new Predicate<ObjectAdapter>() {
                @Override
                public boolean apply(final ObjectAdapter objectAdapter) {
                    final PublishedObjectFacet publishedObjectFacet =
                            objectAdapter.getSpecification().getFacet(PublishedObjectFacet.class);
                    return publishedObjectFacet != null;
                }
            };
        }
    }
}
