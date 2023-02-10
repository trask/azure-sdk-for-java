// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.DatabasePrincipalAssignmentInner;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalAssignmentListResult;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalRole;
import com.azure.resourcemanager.synapse.models.PrincipalType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabasePrincipalAssignmentListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabasePrincipalAssignmentListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"principalId\":\"xiwkgfbql\",\"role\":\"Ingestor\",\"tenantId\":\"khychocokulehur\",\"principalType\":\"Group\",\"tenantName\":\"qffawey\",\"principalName\":\"kphyjdxrav\",\"provisioningState\":\"Running\",\"aadObjectId\":\"brxmrgch\"},\"id\":\"pxkiyf\",\"name\":\"j\",\"type\":\"bajbuscgduusi\"},{\"properties\":{\"principalId\":\"cblevpmc\",\"role\":\"User\",\"tenantId\":\"yxkyxlz\",\"principalType\":\"Group\",\"tenantName\":\"gkzz\",\"principalName\":\"afhbzf\",\"provisioningState\":\"Canceled\",\"aadObjectId\":\"mbj\"},\"id\":\"qsczpgvdwnapfdqw\",\"name\":\"wf\",\"type\":\"ptnuwjtkschgc\"},{\"properties\":{\"principalId\":\"y\",\"role\":\"Viewer\",\"tenantId\":\"seyqrhvyeldotjv\",\"principalType\":\"Group\",\"tenantName\":\"iswskuk\",\"principalName\":\"asbvw\",\"provisioningState\":\"Creating\",\"aadObjectId\":\"xkdtxfkndlqvtwkn\"},\"id\":\"mmbugtywatmqaq\",\"name\":\"ueatgroe\",\"type\":\"hoygzcbyfq\"}]}")
                .toObject(DatabasePrincipalAssignmentListResult.class);
        Assertions.assertEquals("xiwkgfbql", model.value().get(0).principalId());
        Assertions.assertEquals(DatabasePrincipalRole.INGESTOR, model.value().get(0).role());
        Assertions.assertEquals("khychocokulehur", model.value().get(0).tenantId());
        Assertions.assertEquals(PrincipalType.GROUP, model.value().get(0).principalType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabasePrincipalAssignmentListResult model =
            new DatabasePrincipalAssignmentListResult()
                .withValue(
                    Arrays
                        .asList(
                            new DatabasePrincipalAssignmentInner()
                                .withPrincipalId("xiwkgfbql")
                                .withRole(DatabasePrincipalRole.INGESTOR)
                                .withTenantId("khychocokulehur")
                                .withPrincipalType(PrincipalType.GROUP),
                            new DatabasePrincipalAssignmentInner()
                                .withPrincipalId("cblevpmc")
                                .withRole(DatabasePrincipalRole.USER)
                                .withTenantId("yxkyxlz")
                                .withPrincipalType(PrincipalType.GROUP),
                            new DatabasePrincipalAssignmentInner()
                                .withPrincipalId("y")
                                .withRole(DatabasePrincipalRole.VIEWER)
                                .withTenantId("seyqrhvyeldotjv")
                                .withPrincipalType(PrincipalType.GROUP)));
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalAssignmentListResult.class);
        Assertions.assertEquals("xiwkgfbql", model.value().get(0).principalId());
        Assertions.assertEquals(DatabasePrincipalRole.INGESTOR, model.value().get(0).role());
        Assertions.assertEquals("khychocokulehur", model.value().get(0).tenantId());
        Assertions.assertEquals(PrincipalType.GROUP, model.value().get(0).principalType());
    }
}