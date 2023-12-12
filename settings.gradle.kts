/*
 * Copyright © [2023] by [Nurul Qistina Binti Osman Talib]. All rights reserved.
 *
 * This work is for course ICT602 , Sir Hafiz .
 * This work, including all text, images, and other content, is a proprietary of me .
 * Any unauthorized use, reproduction, or distribution is strictly prohibited.
 *
 *
 *
 */

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ZakatCalculator"
include(":app")
 