/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.psiTypeProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.psiTypeProvider.AbstractAnalysisApiPsiTypeProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleAnalysisApiPsiTypeProviderTestGenerated extends AbstractAnalysisApiPsiTypeProviderTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Dependent,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    @TestMetadata("actual_jvmInline_typealias.kt")
    public void testActual_jvmInline_typealias() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/actual_jvmInline_typealias.kt");
    }

    @Test
    @TestMetadata("actual_typealias.kt")
    public void testActual_typealias() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/actual_typealias.kt");
    }

    @Test
    public void testAllFilesPresentInForDeclaration() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("anonymousObject_exposedAsReturnValue.kt")
    public void testAnonymousObject_exposedAsReturnValue() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/anonymousObject_exposedAsReturnValue.kt");
    }

    @Test
    @TestMetadata("localClass_exposedAsReturnValue.kt")
    public void testLocalClass_exposedAsReturnValue() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/localClass_exposedAsReturnValue.kt");
    }

    @Test
    @TestMetadata("localClass_exposedAsReturnValue_privateFunction.kt")
    public void testLocalClass_exposedAsReturnValue_privateFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/localClass_exposedAsReturnValue_privateFunction.kt");
    }

    @Test
    @TestMetadata("localClass_localFunctionInSameScope.kt")
    public void testLocalClass_localFunctionInSameScope() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/localClass_localFunctionInSameScope.kt");
    }

    @Test
    @TestMetadata("localClass_localPropertyInSameScope.kt")
    public void testLocalClass_localPropertyInSameScope() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/localClass_localPropertyInSameScope.kt");
    }

    @Test
    @TestMetadata("localClass_localPropertyInSampeScope_functionalType.kt")
    public void testLocalClass_localPropertyInSampeScope_functionalType() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/localClass_localPropertyInSampeScope_functionalType.kt");
    }

    @Test
    @TestMetadata("localClass_memberFunction.kt")
    public void testLocalClass_memberFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/localClass_memberFunction.kt");
    }

    @Test
    @TestMetadata("parameter_jvmInline.kt")
    public void testParameter_jvmInline() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/parameter_jvmInline.kt");
    }

    @Test
    @TestMetadata("suspendFunctionValueParameterNoStdlib.kt")
    public void testSuspendFunctionValueParameterNoStdlib() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/suspendFunctionValueParameterNoStdlib.kt");
    }

    @Test
    @TestMetadata("suspendFunctionValueParameterWithStdlib.kt")
    public void testSuspendFunctionValueParameterWithStdlib() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forDeclaration/suspendFunctionValueParameterWithStdlib.kt");
    }
}
