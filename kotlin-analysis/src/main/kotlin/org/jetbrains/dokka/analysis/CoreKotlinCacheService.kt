package org.jetbrains.dokka.analysis

import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.analyzer.ModuleInfo
import org.jetbrains.kotlin.caches.resolve.KotlinCacheService
import org.jetbrains.kotlin.caches.resolve.PlatformAnalysisSettings
import org.jetbrains.kotlin.idea.resolve.ResolutionFacade
import org.jetbrains.kotlin.platform.TargetPlatform
import org.jetbrains.kotlin.psi.KtElement
import org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache


class CoreKotlinCacheService(private val resolutionFacade: DokkaResolutionFacade) : KotlinCacheService {
    override fun getResolutionFacade(elements: List<KtElement>): ResolutionFacade {
        return resolutionFacade
    }

    override fun getResolutionFacade(element: KtElement): ResolutionFacade {
        return resolutionFacade
    }

    override fun getResolutionFacadeByFile(
        file: PsiFile,
        platform: org.jetbrains.kotlin.platform.TargetPlatform
    ): ResolutionFacade {
        return resolutionFacade
    }

    override fun getResolutionFacadeByModuleInfo(
        moduleInfo: ModuleInfo,
        settings: PlatformAnalysisSettings
    ): ResolutionFacade {
        return resolutionFacade
    }

    override fun getResolutionFacadeByModuleInfo(
        moduleInfo: ModuleInfo,
        platform: org.jetbrains.kotlin.platform.TargetPlatform
    ): ResolutionFacade {
        return resolutionFacade
    }

    override fun getResolutionFacadeWithForcedPlatform(
        elements: List<KtElement>,
        platform: TargetPlatform
    ): ResolutionFacade {
        return resolutionFacade
    }

    override fun getSuppressionCache(): KotlinSuppressCache {
        throw UnsupportedOperationException()
    }

}
