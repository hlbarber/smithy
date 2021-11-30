/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.smithy.model.traits;

import software.amazon.smithy.model.SourceLocation;
import software.amazon.smithy.model.node.Node;
import software.amazon.smithy.model.node.ObjectNode;
import software.amazon.smithy.model.shapes.ShapeId;
import software.amazon.smithy.utils.MapUtils;

/**
 * Specializes a structure as the output of a single operation.
 */
public final class OutputTrait extends AnnotationTrait {
    public static final ShapeId ID = ShapeId.from("smithy.api#output");

    public OutputTrait(ObjectNode node) {
        super(ID, node);
    }

    public OutputTrait() {
        this(Node.objectNode());
    }

    public OutputTrait(SourceLocation sourceLocation) {
        this(new ObjectNode(MapUtils.of(), sourceLocation));
    }

    public static final class Provider extends AnnotationTrait.Provider<OutputTrait> {
        public Provider() {
            super(ID, OutputTrait::new);
        }
    }
}
