
/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress(
    "unused",
    "nothing_to_inline",
    "useless_cast",
    "unchecked_cast",
    "extension_shadowed_by_member",
    "redundant_projection",
    "RemoveRedundantBackticks",
    "ObjectPropertyName",
    "deprecation"
)
@file:org.gradle.api.Generated

/* ktlint-disable */

package gradle.kotlin.dsl.accessors._c89c08324d0c311f4189ceef586b2d42


import org.gradle.api.Action
import org.gradle.api.Incubating
import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.ConfigurablePublishArtifact
import org.gradle.api.artifacts.ConfigurationContainer
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.DependencyConstraint
import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.api.artifacts.ModuleDependency
import org.gradle.api.artifacts.PublishArtifact
import org.gradle.api.artifacts.dsl.ArtifactHandler
import org.gradle.api.artifacts.dsl.DependencyConstraintHandler
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderConvertible
import org.gradle.api.tasks.TaskContainer
import org.gradle.api.tasks.TaskProvider

import org.gradle.kotlin.dsl.*
import org.gradle.kotlin.dsl.accessors.runtime.*


/**
 * Adds a dependency to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`testCompileOnlyDependenciesMetadata`(dependencyNotation: Any): Dependency? =
    add("testCompileOnlyDependenciesMetadata", dependencyNotation)

/**
 * Adds a dependency to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`testCompileOnlyDependenciesMetadata`(
    dependencyNotation: String,
    dependencyConfiguration: Action<ExternalModuleDependency>
): ExternalModuleDependency = addDependencyTo(
    this, "testCompileOnlyDependenciesMetadata", dependencyNotation, dependencyConfiguration
) as ExternalModuleDependency

/**
 * Adds a dependency to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`testCompileOnlyDependenciesMetadata`(
    dependencyNotation: Provider<*>,
    dependencyConfiguration: Action<ExternalModuleDependency>
): Unit = addConfiguredDependencyTo(
    this, "testCompileOnlyDependenciesMetadata", dependencyNotation, dependencyConfiguration
)

/**
 * Adds a dependency to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`testCompileOnlyDependenciesMetadata`(
    dependencyNotation: ProviderConvertible<*>,
    dependencyConfiguration: Action<ExternalModuleDependency>
): Unit = addConfiguredDependencyTo(
    this, "testCompileOnlyDependenciesMetadata", dependencyNotation, dependencyConfiguration
)

/**
 * Adds a dependency to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param group the group of the module to be added as a dependency.
 * @param name the name of the module to be added as a dependency.
 * @param version the optional version of the module to be added as a dependency.
 * @param configuration the optional configuration of the module to be added as a dependency.
 * @param classifier the optional classifier of the module artifact to be added as a dependency.
 * @param ext the optional extension of the module artifact to be added as a dependency.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.create]
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`testCompileOnlyDependenciesMetadata`(
    group: String,
    name: String,
    version: String? = null,
    configuration: String? = null,
    classifier: String? = null,
    ext: String? = null,
    dependencyConfiguration: Action<ExternalModuleDependency>? = null
): ExternalModuleDependency = addExternalModuleDependencyTo(
    this, "testCompileOnlyDependenciesMetadata", group, name, version, configuration, classifier, ext, dependencyConfiguration
)

/**
 * Adds a dependency to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param dependency dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun <T : ModuleDependency> DependencyHandler.`testCompileOnlyDependenciesMetadata`(
    dependency: T,
    dependencyConfiguration: T.() -> Unit
): T = add("testCompileOnlyDependenciesMetadata", dependency, dependencyConfiguration)

/**
 * Adds a dependency constraint to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param constraintNotation the dependency constraint notation
 *
 * @return the added dependency constraint
 *
 * @see [DependencyConstraintHandler.add]
 */
internal
fun DependencyConstraintHandler.`testCompileOnlyDependenciesMetadata`(constraintNotation: Any): DependencyConstraint? =
    add("testCompileOnlyDependenciesMetadata", constraintNotation)

/**
 * Adds a dependency constraint to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param constraintNotation the dependency constraint notation
 * @param block the block to use to configure the dependency constraint
 *
 * @return the added dependency constraint
 *
 * @see [DependencyConstraintHandler.add]
 */
internal
fun DependencyConstraintHandler.`testCompileOnlyDependenciesMetadata`(constraintNotation: Any, block: DependencyConstraint.() -> Unit): DependencyConstraint? =
    add("testCompileOnlyDependenciesMetadata", constraintNotation, block)

/**
 * Adds an artifact to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param artifactNotation the group of the module to be added as a dependency.
 * @return The artifact.
 *
 * @see [ArtifactHandler.add]
 */
internal
fun ArtifactHandler.`testCompileOnlyDependenciesMetadata`(artifactNotation: Any): PublishArtifact =
    add("testCompileOnlyDependenciesMetadata", artifactNotation)

/**
 * Adds an artifact to the 'testCompileOnlyDependenciesMetadata' configuration.
 *
 * @param artifactNotation the group of the module to be added as a dependency.
 * @param configureAction The action to execute to configure the artifact.
 * @return The artifact.
 *
 * @see [ArtifactHandler.add]
 */
internal
fun ArtifactHandler.`testCompileOnlyDependenciesMetadata`(
    artifactNotation: Any,
    configureAction:  ConfigurablePublishArtifact.() -> Unit
): PublishArtifact =
    add("testCompileOnlyDependenciesMetadata", artifactNotation, configureAction)



